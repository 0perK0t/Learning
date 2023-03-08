package СountingWordsSortValue;

import java.util.*;

// принимает строку, посчитывает и сортирует количеству повторений
// collection sort comporator (ehjr 5 / 2^00^00)
//  Character.isLetter ()
public class Main {
    public static void main(String[] args) {

        String str = "Ленин всегда живой, ленин всегда со мной.";
        String[] arr = str.split(" ");  // строку перевели в массив, где разделитель " ";
        for(int i =0; i < arr.length; i++ ){   // в цикле удаляем последний символ если это не буква;
            String temp = arr[i];
            if (!Character.isLetter (temp.charAt(temp.length()-1))) {
                arr[i] = temp.substring(0,temp.length()-1);
            }
        }
        Map<String, Integer> treeMap = new TreeMap<String, Integer>(); // создаем ТриМап ключ - стринг , зачение - интежер
        for (String temp : arr){    // цикл добавялем в ТриМап ключ - слово, зачение - кол-в повторений
            int value = 1;          // если в Мапе есть такойже стринг (приводя в нижний реест), то зачение +1
            if(treeMap.containsKey(temp.toLowerCase())){ value = treeMap.get(temp) + 1;}
            treeMap.put(temp.toLowerCase(), value);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(treeMap);
        System.out.println("-----------------------------");

        // Создаем ArrayList принимает коллекцию(объект)Map.Entry(с объектами  String, Integer)
        // treeMap используем метод .entrySet который возвращает все значение в виде объекта Map.Entry
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(treeMap.entrySet());
        Collections.sort(list, new SortByValue());

        // чезез метот forEach (как аналог цикла for) печаталем list
        list.forEach(temp -> {
            System.out.println(temp.getKey() + "\t" + temp.getValue() );
        });

    }

    public static class  SortByValue implements Comparator <Map.Entry<String, Integer>>{
        // создаем класс SortByValue реаилзует интерфейс Comparator, где будет брать объект Integer (объек может быть любым, как Car (имя, год)
        @Override // переназначиваем метод compare (стравнивает объект1 и объект1+1 )
        public int compare(Map.Entry<String, Integer> object1, Map.Entry<String, Integer> object2){
            return object1.getValue().compareTo(object2.getValue());
        }

    }


}

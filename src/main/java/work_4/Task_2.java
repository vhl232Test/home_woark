package work_4;

import java.util.*;

public class Task_2 {

    /*
    *Создать массив с числами int[] mass = new int[] {1, 2, 3, 4, 5, 5, 5, 5, 6, 7, 8, 9, 9} ,
затем в с помощью циклов необходимо узнать какие цифры повторяются в массиве и вывести их
примерно так: "Повторяющийся элемент - " + сам элемент + " , его индекс - " + индекс элемента"
вывести числа уже без повторяющихся
    * */

    public static void main(String[] args) {

        int[] mass = new int[]{1, 2, 0, 0, 3, 4, 0, 5, 5, 5, 5, 6, 7, 8, 9, 9};

        TreeSet<Integer> set_int = new TreeSet<>();
        HashMap<Integer, Set> map = new HashMap<>();

        for (int j : mass) {
            set_int.add(j);
        }

        for (int i = 0; i < mass.length; i++) {
             for (int j = i+1; j <mass.length ; j++) {
                  if (mass[i] == mass[j]) {
                      if(!map.containsKey(mass[i])) {
                          map.put(mass[i], new HashSet());
                          map.get(mass[i]).add(i);
                          map.get(mass[i]).add(j);
                      }
                      else map.get(mass[i]).add(j);
                  }
             }
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Повторяющийся элемент - " + entry.getKey() + " , его индексы - "
                    + entry.getValue());
        }

        System.out.println("\n" +"Вывод без повторений: "+ set_int);

    }
}




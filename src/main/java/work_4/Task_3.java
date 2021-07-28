package work_4;

import java.util.*;

public class Task_3<T> {
    /*
    * Написать метод который принимает коллекцию объектов(любую) и вернет ее без повторений данных, пример ,
 я передаю в метод ArrayList где есть одинаковые числа, а получаю такой же Лист только уже без повторений
 * */


    public static void main(String[] args) {

        Task_3 tTask_3 = new Task_3<>();

        Integer [] a = {1, 2, 3, 4, 5, 5, 5, 5, 6, 7, 8, 9, 9};
        String [] str = {"aaa","vvv","www","qsqs","vvvv", "aaa", "vvv"};


        tTask_3.lin.add("aaa");
        tTask_3.lin.add("vvv");
        tTask_3.lin.add("vvv");
        tTask_3.lin.add("aaa");

        tTask_3.first_arr = tTask_3.return_arr(str);
        System.out.println(tTask_3.first_arr);
        tTask_3.sort_set(tTask_3.lin);
        //System.out.println("Set "+tTask_3.sort_set(tTask_3.first_arr));

        Iterator iterator = tTask_3.tree.iterator();
        while (iterator.hasNext()){
            tTask_3.new_arr.add(iterator.next());
        }

        System.out.println("New ArrayList " + tTask_3.new_arr);
    }

    LinkedList <T> lin = new LinkedList<>();

    ArrayList<T>  first_arr;
    ArrayList<T> new_arr = new ArrayList<>();
    TreeSet<T> tree = new TreeSet<>();

    TreeSet<T> sort_set(Collection <T>c){
        tree.addAll(c);
        return tree;
    }

    ArrayList <T>  return_arr(T[] a){
        ArrayList <T> _arr =  new ArrayList<>();
        for (T z:a){
            _arr.add(z);
        }
        return _arr;
    }

}

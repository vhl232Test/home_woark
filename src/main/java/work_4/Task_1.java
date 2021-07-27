package work_4;

import java.util.ArrayList;

public class Task_1 {

    /*
    *  Создать ArrayList, добавить в него строки "JS", "Java", "Pascal" , "PHP", циклом пройтись по листу
    * и при нахождении элемента с названием Pascal - удалить его , вывести лист без паскаля
*/

    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>();

        str.add("JS");
        str.add("Java");
        str.add("Pascal");
        str.add("PHP");

        System.out.println(str);

        for (String a:str) {
            if ("Pascal".equals(a)){
                str.remove("Pascal");
            }
        }

        System.out.println(str);

    }
}

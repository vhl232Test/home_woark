package work_1;

import java.util.*;

public class Second {

    public static void main(String[] args) {

        Second second = new Second();

        String capitan = "Jhon";
        String navigator = "James";
        String firstMate = "Mary";
        String secondMate = "Oleg";

        // output description
        second.met("dfdfd");

        // reverse massive
        System.out.println(Arrays.toString(second.reverse()));

        // create massive
        second.create_massive();

        Str str = new Str();
        str.put_in_map(str.mass_str);
    }
 /*
1. Необходимо написать 6 перегрузочных методов с названием sum, т.е всего должно быть 7 методов
*/
    void sum(){
        System.out.println("first");
    }
    int sum(int a){
        System.out.println("second");
        return a;
    }
    void sum(double a,int b){
        System.out.println("third");
    }
    void sum(double...a){
        System.out.println("another one");
    }
    void sum(String a){
        System.out.println(a);
    }
    void sum(Object a){
        System.out.println(a);
    }
    String sum(int a,String s,String q){
        return a+s+q;
    }

/*2. Необходимо реализовать логику распределение должностей команды, создать в классе main 4 переменных типа
String: String capitan = "Jhon" , String navigator = "James" , String firstMate = "Mary",
 String secondMate = "Oleg"
 */

    void met(String a){

        switch (a) {
            case "Jhon" -> System.out.println("Jhon - he is a captain. And he drinks a lot");
            case "James" -> System.out.println("James - is our navigating officer. He has money");
            case "Mary" -> System.out.println("Mary - likes staring at stars at night");
            case "Oleg" -> System.out.println("Oleg - just Oleg.");
            default -> System.out.println("there is nothing");
        }
    }

 /*
3. Создать массив и заполнить его цифрами от 0 включительно до 9 включительно, реализовать метод
Reverse в котором этот массив поменяет все свои числа задом наперед ,
т.е должно получится от 9 до 0, и вызвать его в методе main
 */

    int [] reverse(){
        int[]a = new int[10];
        for (int i = 0; i < 10; i++) {
             a[i] = i;
        }
        int[] b = new int[a.length];
        int c = a.length-1;
        for (int i = 0;  i < a.length; i++) {
            b[c] = a[i];
            c--;
        }
       return b;
    }

/*
1. Необходимо считать c консоли число, создать целочисленный массив размером введенного числа
и заполнить массив с помощью  класса Random(погуглить как использовать этот класс)
*/

    void create_massive(){

    Random random = new Random();
    int a = read_number_from_console();
    int [] mass = new int[a];
    for (int i = 0; i < mass.length ; i++) {
            mass[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(mass));
    }

    int read_number_from_console(){
        String text = """
                Please, enter a number 
                to determine the length of the array: """;

        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

/*
Задача на String, HashMap

1.  У вас есть строка: "     name=Amanda=&age=32&&salary=1500&currency=quro                             " ,
нужно  преобразовать эту строку в HashMap используя метод split, и добавить так что бы все слова приняли
вид ключ -  значение, например:  name=Amanda, age=32 и т.д
 */

class Str{

    String str = "     name=Amanda=&age=32&&salary=1500&currency=quro                             ".trim();

    String mass_str[] = str.split("&");

    void put_in_map(String a[]){

        HashMap<String,String> str_Map = new HashMap<>();
        for (String s : mass_str) {
            if (s.equals("")) continue;
            String[] couple = s.split("=");
            for (int j = 0; j < couple.length - 1; j++) {
                str_Map.put(couple[j], couple[j + 1]);
            }
        }
        for(Map.Entry<String, String> item : str_Map.entrySet()){
            System.out.println( item.getKey()+"="+ item.getValue());
        }
    }

}
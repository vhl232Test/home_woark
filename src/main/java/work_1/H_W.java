package work_1;


public class H_W {
    public static void main(String[] args) {

        /*
          1. Создать переменные mark_salary и alice_salary вещественного типа (с плавающей точкой).
          Присвоить созданным переменным значения по своему усмотрению. Вывести в консоль
        */
/*
        double mark_salary = 3.3;
        float  alice_salary = 9.1f;

        System.out.println( mark_salary);
        System.out.println(alice_salary);
*/


        /*
        2. Создать переменные mark_age и alice_age целочисленного типа.
        Присвоить созданным переменным значения по своему усмотрению. Вывести в консоль
        */
/*
        int mark_age = 12;
        long alice_age = 103;

        System.out.println( mark_age);
        System.out.println(alice_age);
*/
        /*
        3. Создать переменные mark_name и alice_name строкового типа.
        Присвоить созданным переменным значения по своему усмотрению. Вывести в консоль
         */
/*
        String mark_name = "Mark";
        String alice_name = "Alice";

        System.out.println(mark_name + " + " + alice_name + " = " + "Love ");
*/

        /*
        4. Создать переменные mark_gender и alice_gender булевого типа.
        Пусть mark будет принимать истинное значение, а alice ложное. Вывести в консоль
         */
/*
        boolean mark_gender = true;
        boolean alice_gender = false;

        System.out.println(mark_gender + " "+ alice_gender);

 */

        /*
        5. Создать массив, размеров в 10 элементов, с целочисленными типами данных,
        заполнить его циклом for, и вывести на экран все числа из массива использую цикл foreach
         */
/*
        int mass[] = new int[10];

        for (int m = 0; m < mass.length; m++) {
            mass[m] = m;
        }
        for (int a : mass) {
            System.out.println(a);
        }

 */

        /*
        6. В созданном массиве, вывести на экран все числа которые больше 5, с помощью цикла foreach
        */
/*
        int mass[] = new int[10];

        for (int m = 0; m < mass.length; m++) {
            mass[m] = m;
        }
        for (int a :mass) {
            if (a>5) System.out.println(a);
        }

 */
        /*
        7**. Создать 2 переменные типа String со значениями "Четный",
         "Нечетный", и Массив типа String на 10 элементов, необходимо заполнить массив strings значениями.
          Если индекс массива чётный — присвоить значение "Чётный" (ноль — цифра чётная), иначе присвоить
          "Нечётный".
         */
/*
        String odd = "Нечетный";
        String even = "Четный";

         String mass []  = new String[10];

        for (int m = 0; m < mass.length; m++) {
            if (m%2==0){
                mass[m] = even;
            }
            else mass[m] = odd;

        }
        for (int i = 0; i < mass.length; i++) {
            System.out.println(i + " " + mass[i]);
        }
*/
        /*
        public int[] array = new int[]{1, 2, 3, -4, 5, 6, 7, 8, 9}; есть массив, необходимо сделать так
        что бы часть цифр изменилась на противоположный знак, например 2 стало -2 ,
        и только изменить те цифры которые четные, т.е цифра 1 остается без изменений
         */
        int[] array = new int[]{1, 2, 3, -4, 5, 6, 7, 8, 9};
        int[] array_copy = array.clone();

        for (int i = 0; i < array_copy.length; i++) {
            if(array_copy[i]%2==0)
                array_copy[i]= array_copy[i]*-1;
        }

        for (int a = 0; a < array_copy.length; a++) {
            System.out.println(array[a] + " = "+ array_copy[a]);
        }

    }
}

package work_3;

public class Calculator {

/*
2. Создай класс Calculator, внутри класса должен быть метод main и другой внутренний статический класс Actions,
внутри класса Actions создай 4 метода(умножение, деление, сложение и вычитание) принимающих 2 параметра
int и вызови эти методы в методе main,без создания объекта класса
*/
    public static void main(String[] args) {

            Actions.sum(2,2);
            Actions.subtraction(4,1);
            Actions.multiplication(5,5);
            Actions.division(8,2);
    }

static  class Actions{

        static void sum (int a, int b){
           System.out.println(a+b);
       }
        static void subtraction  (int a, int b){
        System.out.println(a-b);
    }
        static void multiplication(int a, int b){
            System.out.println(a*b);
        }
        static void division (int a, int b){
            System.out.println(a/b);
        }
}
}

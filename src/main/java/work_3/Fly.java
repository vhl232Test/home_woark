package work_3;

public class Fly {
/*1. В классе Fly создай внутренний класс (inner class) EngineFly.
В классе EngineFly создай boolean поле isFlying, которое принимает значение true, если самолет летит и
false в противном случае. Также в этот класс добавь методы startEngine и stopEngine,
которые будут запускать/останавливать самолет (устанавливать соответствующее значение полю isRunning).
Чтобы использовать двигатель, создай поле engine типа Engine в классе Fly.
* */

    public static void main(String[] args) {

        EngineFly engineFly = new EngineFly();
        double a = Math.random();

        engineFly.isRunning = engineFly.startEngine(a);

        Engine engine = new Engine(engineFly.isRunning);

        int distance = 0;

        if (engine.engine) {
            engineFly.isFlying = engine.engine;
            System.out.println("Fly is flying " + engineFly.isFlying);

            while (engine.engine) {
                double b = Math.random();
                engine.engine = engineFly.stopEngine(b);
                distance++;
                System.out.println("You fly today " + distance + " km");
                if (engine.engine==false){
                    System.out.println("Your fly is break");
                }
            }
        }
        else System.out.println("Engine is not working. You can't fly today");


        //System.out.println(engineFly.isRunning);
    }

}
class EngineFly{

    boolean isFlying;
    boolean isRunning;

    boolean startEngine(double d){
        if(d>0.5) isRunning = true;
        return isRunning;
    }

    boolean stopEngine(double d){
        if(d<0.5) isRunning = false;
        return isRunning;
    }
}

class Engine{

    boolean engine;

    public Engine(boolean engine) {
        this.engine = engine;
    }
}


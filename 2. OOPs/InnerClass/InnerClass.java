package InnerClass;

public class InnerClass {
    public static void main(String[] args) {
        Car car = new Car("Civic");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();
    }
}

class Car {
    String name;
    boolean isEngineOn;

    Car(String name){
        this.name=name;
        isEngineOn=false;
    }

    class Engine{
        void start(){
            if(!isEngineOn){
                System.out.println(name + " engine started");
                isEngineOn=true;
            }
            else{
                System.out.println(name + "Engine already started");
            }
        }

        void stop(){
            if(isEngineOn){
                System.out.println(name + " engine stopped");
            }
            else{
                System.out.println(name + "Engine already stopped");
            }
        }
    }

}

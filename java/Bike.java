public class Bike {
    // run time
    void start(){
        System.out.println("runs on fuel");
    }
}
class ElectricBike extends Bike{
    void start(){
        System.out.println("runs on battery");
    }
}

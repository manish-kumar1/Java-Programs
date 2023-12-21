abstract class Bike {
    abstract void run();
}
class Honda extends Bike{
    void run(){
        System.out.println("Honda is safe and best bike");
    }
}

public class BikeMain{
    public static void main(String []args){
        Bike obj = new Honda();
        obj.run();
    }
}
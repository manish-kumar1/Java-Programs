
abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Rectange Shape");
    }
}
class Cricle extends Shape{
    void draw(){
        System.out.println("Cricle Shape");
    }
}
public class TestAbstract {
    public static void main(String []args){
        Shape obj = new Rectangle();
        obj.draw();
    }
}

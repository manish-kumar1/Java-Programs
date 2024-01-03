import java.lang.Math;
public class Circle {
    public static void main(String [] args){
        int rad = 10;
        double area, circ;
        area = Math.PI*Math.pow(rad, 2);
        circ = 2*Math.PI*rad;
        System.out.println("Area is"+area);
        System.out.println("Circumf is "+circ);
    }
}

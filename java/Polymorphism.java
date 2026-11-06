public class Polymorphism {
    // compile time
   static double area(double r){
        System.out.println("area of circle: ");
        return Math.PI*r*r;
    }
   static int area(int side){
        System.out.println("area of square: ");
        return side*side;
    }
    static int area(int l, int b){
        System.out.println("area of rectangle: ");
        return l*b;
    }
    public static void main(String[] args) {
        
       System.out.println( area(12));
       System.out.println( area(9.6));
       System.out.println( area(4,5));
    }
}

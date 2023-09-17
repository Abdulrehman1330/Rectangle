
public class ShapeTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(30, 30,30,30);
        Rectangle r2 = new Rectangle(30,40,50,50);
        System.out.println("Area is " + r1.area());
        System.out.println("Circumference is " + r1.circumference());
        Rectangle big_rec = Rectangle.min(r2,r1);
        System.out.println(Rectangle.overlap(r1,r2));

    }
}

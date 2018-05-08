package hw2b;

public class PointTester
{
   public static void main(String[] args)
   {
      Comparable<Point> p1 = new Point(3, 4);
      Point p2 = new Point(3, 4);
      Point p3 = new Point(5, 6);
      

      System.out.println(p1.compareTo(p2));
      System.out.println("Expected: true");
      System.out.println(p1.compareTo(p3));
      System.out.println("Expectied: false");
      System.out.println(p3.compareTo(p2));
      System.out.println("Expectied: false");
   }
}

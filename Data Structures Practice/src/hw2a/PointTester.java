package hw2a;

public class PointTester
{
   public static void main(String[] args)
   {
      Measurable p1 = new Point(0, 0);
      Measurable p2 = new Point(3, 4);
      Measurable p3 = new Point(5, 12);
      Measurable p4 = new Point(8, 9);


      System.out.println("Actual: " + p1.getMeasure());
      System.out.println("Expected: 0");
      System.out.println("Actual: " + p2.getMeasure());
      System.out.println("Expected: 5");
      System.out.println("Actual: " + p3.getMeasure());
      System.out.println("Expected: 13");
      System.out.println("Actual: " + p4.getMeasure());
      System.out.println("Expected: 12.041594578792296");
   }
}

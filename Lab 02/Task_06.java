public class Task06 {
    public static void main(String[] args) {
      //(a)
        int x = 16;
        int y = 20;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
         z = x;
         x = y;
         y = z;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
      //(b)
        int x = 16;
        int y = 20;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
         x = x + y;  
         y = x - y;  
         x = x - y;  
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

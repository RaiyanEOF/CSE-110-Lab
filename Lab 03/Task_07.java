import java.util.Scanner;
  public class Task07 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Give me x:");
        int x = a.nextInt();
        int result = 0;
        if(x < 0)
        {
            result = 2*x;
            System.out.println(result);
        }
        else if(x>= 0 && x<2)
        {
            result = x + 1;
            System.out.println(result);
        }
        else if(x>=2 && x<5)
        {
            result =(int)(Math.pow(x, 2)) - 1;
            System.out.println(result);
        }
        else 
        {
            result = 3*(int)(Math.pow(x, 2)) + 2;
            System.out.println(result);
        }
        a.close();
    }
}

import java.util.Scanner;
  public class Task01{
    public static void main(String[] args){
    Scanner x = new Scanner(System.in);
    System.out.println("Give a number:");
        int a = x.nextInt();
         System.out.println("Give a number:");
        int b = x.nextInt();
         System.out.println("Give a number:");
        int c = x.nextInt();
        if(a>b && a>c)
            System.out.println(a + " " +"a is largest");
        else if(b>c && b>a)
            System.out.println(b + " "+ " b is largest");
        else
            System.out.println(c + " "+ " c is largest");
      x.close();
    }
}

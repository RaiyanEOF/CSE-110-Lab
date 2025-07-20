import java.util.Scanner;
  public class Task04{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Give a number:");
        int a = x.nextInt();
        if ( a%5==0 && a%7==0)
            System.out.println("Divisible by both");
        else if ( a%5==0 && a%7!=0)
            System.out.println("Divisible by 5 only");
        else if ( a%7==0 && a%5!=0)
            System.out.println("Divisible by 7 only");
        else {
            System.out.println("Invalid");
        System.out.println("Give me another number");
        }
        x.close();
    }
}

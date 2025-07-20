import java.util.Scanner;
  public class Task06{
    public static void main(String[] args){
    Scanner x = new Scanner(System.in);
    System.out.println("Give me a number:");
    int number = x.nextInt();
    if (number>0 && number%2==0)
        System.out.println("Even and positive");
    else if (number>0 && number%2!=0)
        System.out.println("Odd and positive");
    else if (number<0)
        System.out.println("Negative");
    else
        System.out.println("Zero");
    x.close();
                               
    }
}

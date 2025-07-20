import java.util.Scanner;
  public class Task03{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Give me a sign");
        String op = x.nextLine();
        System.out.println("Give me an input:");
        int a = x.nextInt();
        System.out.println("Give me an input:");
        int b = x.nextInt();
        int result1 = 0;
        int result2 = 0;
        if(op.equals("+"))
        {
            result1 = a+b;
            result2 = a*b;
            System.out.println(result1);
            System.out.println(result2);
        }
        else if(op.equals("-"))
        {
            result1 = a-b;
            result2 = a/b;
            System.out.println(result1);
            System.out.println(result2);
        }
        x.close();  
    }
}

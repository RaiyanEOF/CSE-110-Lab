import java.util.Scanner;
  public class Task10{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Input a:");
        float a = x.nextFloat();
        System.out.println("Input b:");
        float b = x.nextFloat();
        System.out.println("Input c:");
        float c = x.nextFloat();
        if(a>b && a>c)
        {
            if(b>c){
            System.out.println("c is minimum " + c);
            }else{
            System.out.println("b is minimum " + b);
            }
        
        System.out.println("a is maximum " + a);
        }
        else if(b>a && b>c)
        {
        if(a>c)
        {
            System.out.println("c is minimum " + c);
        }else{
            System.out.println("a is minimum " + a);
        }
        System.out.println("b is maximum " + b);
        }
        else if(c>a && c>b)
        {
        if(a>b)
        {
            System.out.println("b is minimum " + b);
        }else{
            System.out.println("a is minimum " + a);
        }
        System.out.println("c is maximum " + c);
        }
        else
            System.out.println("Invalid, Give me another input");
        x.close();
    }
}

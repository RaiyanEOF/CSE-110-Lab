import java.util.Scanner;
  public class Task13{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Input 1st number:");
        double a = x.nextDouble();
        System.out.println("Input 2nd number:");
        double b = x.nextDouble();
        System.out.println("Input 3rd number:");
        double c = x.nextDouble();
        if(a==b && b==c & a==c)
            System.out.println("All numbers are equal");
        else if(a!=b && a!=c && b!=c)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal or different");
        x.close();
    }
}

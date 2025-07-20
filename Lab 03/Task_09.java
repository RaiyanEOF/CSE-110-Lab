import java.util.Scanner;
  public class Task09{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Your age:");
        int age = x.nextInt();
        System.out.println("Your income:");
        double income = x.nextDouble();
        double tax = 0;
        if(income>=10000 && income<=20000 && age>=18)
        {
            tax = income*5/100;
            System.out.println("Your tax amounts in" + " " + tax + "Tk");
        }
        else if(income>20000 && age>=18)
        {
            tax = income*10/100;
            System.out.println("Your tax amounts in" + " " + tax + "TK");
        }
        else
            System.out.println("Your tax amounts in 0 Tk");
        
        x.close();
    }
}

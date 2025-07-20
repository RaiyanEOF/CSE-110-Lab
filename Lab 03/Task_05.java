import java.util.Scanner;
  public class Task05{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Give an year:");
        int year = x.nextInt();
        if ( year%4==0 )
        {
            if( year%100!=0 || year%400==0) 
                System.out.println("Leap year");
            else
                System.out.println("Not leap year");
        }
        else
            System.out.println("Not leap year");
        x.close();
    }
}

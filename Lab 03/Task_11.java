import java.util.Scanner;
  public class Task11{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Give me one side:");
        float side1 = x.nextFloat();
        System.out.println("Give me me another side:");
        float side2 = x.nextFloat();
        System.out.println("Give me another side:");
        float side3 = x.nextFloat();
        if(side1+ side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
        {
            if( side1==side2 && side2==side3 && side3==side1)
            {
                System.out.println("This is a Equilateral triangle");
            }
            else if( side1==side2 || side2==side3 || side3==side1)
            {
                System.out.println("This is a Isosceles triangle");
            }
            else if( side1!=side2 && side2!=side3 && side1!=side2)
            {
                System.out.println("This is a Scalene triangle");
            }
            else
                System.out.println("Invaild Input");
        }
        else
            System.out.println("This is not a triangle");
        x.close();
    }
}

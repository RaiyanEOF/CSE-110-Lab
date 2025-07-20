public class Task12 {
    public static void main(String[] args) {
        int StudentID = 24301564;
        int x = StudentID%100;
        int digit1 = x%10;
        int digit2 = x/10;
        System.out.println(StudentID + " in reverse order are: " + digit1 + "," + digit2);
    }
}

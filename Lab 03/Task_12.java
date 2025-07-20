import java.util.Scanner;
  public class Task12{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the amount the customer need to pay(Taka):");
        int needtopay = x.nextInt();
        System.out.println("Enter the amount, customer gave(Taka):");
        int gave = x.nextInt();
        if(gave >= needtopay) {
            int change = gave-needtopay;
            System.out.println("Change to be returned: " + change + " taka");
            int notes[] = {100, 50, 20, 10};
            int coins[] = {5, 2, 1};
            System.out.println("Change in notes and coins:");
            for(int note : notes) {
                if(change >= note) {
                    int count = change/note;
                    change = change%note;
                    System.out.println(note + " taka note: " + count);
                }
            }
            for(int coin : coins) {
                if(change >= coin) {
                    int count = change/coin;
                    change = change%coin;
                    System.out.println(coin + " taka coin: " + count);
                }
            }
        }
        else {
            int amountToPay = needtopay-gave;
            System.out.println("The customer needs to pay an additional: " + amountToPay + " taka");
        }
        x.close();
    }
}

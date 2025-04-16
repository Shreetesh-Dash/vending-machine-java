import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Display items
        System.out.println("Welcome to DSP vending machine");
        System.out.println("Product     Price  Code");
        System.out.println("Coke        $3     4343");
        System.out.println("Kitkat      $2     4234");
        System.out.println("Oreo        $5     3425");
        System.out.println("Pepsi       $7     9807");
        System.out.println("Silk        $8     8690");
        System.out.println("Sprite      $12    9080");

        // Step 2: Prices
        int cokePrice = 3;
        int kitkatPrice = 2;
        int oreoPrice = 5;
        int pepsiPrice = 7;
        int silkPrice = 8;
        int spritePrice = 12;

        // Step 3: Ask for product code
        System.out.println("Type a product code to continue...");
        System.out.print("Enter code: ");
        int userCode = sc.nextInt();

        int price = 0;
        String item = "";

        // Step 4: Select product
        if (userCode == 4343) {
            item = "Coke";
            price = cokePrice;
        } else if (userCode == 4234) {
            item = "Kitkat";
            price = kitkatPrice;
        } else if (userCode == 3425) {
            item = "Oreo";
            price = oreoPrice;
        } else if (userCode == 9807) {
            item = "Pepsi";
            price = pepsiPrice;
        } else if (userCode == 8690) {
            item = "Silk";
            price = silkPrice;
        } else if (userCode == 9080) {
            item = "Sprite";
            price = spritePrice;
        } else {
            System.out.println("You have selected an invalid item.");
            sc.close();
            return;
        }

        System.out.println("You have selected " + item + " and pay $" + price);

        // Step 5: Ask payment mode
        System.out.print("Cash/Card: ");
        String paymentMode = sc.next();

        if (paymentMode.equalsIgnoreCase("card")) {
            System.out.println("Place the card in the below slot and pay the amount shown above.");
        } else {
            System.out.println("Deposit the money or coin in their desired slot.");
        }

        System.out.println("Pay");
        System.out.print("Enter money: ");
        int payment = sc.nextInt();

        System.out.println("Wait...");

        if (payment < price) {
            System.out.println("Insufficient amount paid, collect your money from the withdrawal slot and try again.");
        } else if (payment > price) {
            System.out.println("Amount paid is more than the item ordered, collect the balance from the withdrawal slot.");
            System.out.println("Collect the item.");
        } else {
            System.out.println("Collect the item.");
        }

        sc.close();
    }
}
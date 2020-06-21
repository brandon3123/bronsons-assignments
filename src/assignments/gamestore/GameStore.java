package assignments.gamestore;

import java.util.Scanner;

public class GameStore {

    public static void main(String args[]) {
        System.out.println("*********************************");
        System.out.println("*   Welcome To The Game Store   *");
        System.out.println("*********************************");

        int selection;
        double totalAmount = 0.0;

        do {
            //Display menu with a loop
            System.out.println("\nPlease choose something to add to your cart");
            System.out.println("----------------------------");

            System.out.println("1. Playstation 4 : $400");
            System.out.println("2. Xbox One : $300");
            System.out.println("3. Nintendo Wii : $250");
            System.out.println("4. Super-Nintendo : $1000");
            System.out.println("5. Scrabble : $20");
            System.out.println("6. Display shopping cart total\n");


            System.out.println("*****************************************************");
            System.out.println("*   Make a selection to add to your shopping cart   *");
            System.out.println("*****************************************************");

            Scanner scanner = new Scanner(System.in);

            selection = scanner.nextInt();

            if (selection > 6 || selection < 1) { //incorrect selection
                System.out.println("*****************************************************");
                System.out.println("*  You've made an incorrect selection. Please try again! *");
                System.out.println("*****************************************************");
            } else if (selection != 6) {
                //Selection is correct, as for a quantity of item
                int quantity;

                do {
                    //Loop for quantity, to eliminate the possibility of an incorrect value
                    System.out.println("******************************************************************");
                    System.out.println("* Please enter a quantity of your selection you wish to purchase *");
                    System.out.println("******************************************************************");

                    //Get the quantity
                    quantity = scanner.nextInt();

                    if (quantity < 0) { //Incorrect quantity
                        System.out.println("*********************************");
                        System.out.println("* Quantity must be 0 or higher! *");
                        System.out.println("*********************************");
                    } else if (quantity > 0) {
                        //Add to the total, based on selection and quantity
                        switch (quantity) {
                            case 1:
                                totalAmount += (400 * quantity);
                                break;
                            case 2:
                                totalAmount += (300 * quantity);
                                break;
                            case 3:
                                totalAmount += (250 * quantity);
                                break;
                            case 4:
                                totalAmount += (1000 * quantity);
                                break;
                            case 5:
                                totalAmount += (20 * quantity);
                                break;
                            default:
                                throw new UnsupportedOperationException("Unaccounted selection!");
                        }
                    }
                } while (quantity < 0);
                //end quality loop, back to menu looping.
            }
        } while (selection != 6);

        //Selection is 6. Looping stopped and total is displayed
        System.out.println("*****************************************************");
        System.out.println("      Your shopping cart total is : $" + totalAmount);
        System.out.println("    --------------------------------------------   ");
        System.out.println("    Thank you for shopping with us! Goodbye!       ");
        System.out.println("*****************************************************");

        //Terminate program, redundant....but I like to be explicit
        System.exit(0);
    }
}

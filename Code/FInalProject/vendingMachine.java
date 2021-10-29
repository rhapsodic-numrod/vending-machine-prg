import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        
        // Landing page

        // Customer menu
        


    public static int findItem(String[][] arr, String searchItem) {
        int indexOfItem = 0, id = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][id].equalsIgnoreCase(searchItem)) {
                indexOfItem = i;
                break;
            } else {
                indexOfItem = -1;
            }
        }
        return indexOfItem;
    }

    public static void main(String[] args) {
        int id = 0, name = 1, price = 2, stock = 3, end = -1, rows = 20, cols = 4;
        String[][] inventory = new String[rows][cols];
        /// Adding base items
        String[] Item0 = {"C01", "Simba Salt and Vinegar Chips 132g", "15.00", "6"};
        String[] Item1 = {"C02", "Simba Chilli Biltong Chips 132g", "15.00", "15"};
        String[] Item2 = {"C03", "Simba Smoked Beef Chips 132g", "15.00", "2"};
        String[] Item3 = {"C04", "Lay's Classic Chips 120g", "15.00", "24"};
        String[] Item4 = {"C05", "Lay's Thai Sweet Chilli Chips 120g", "15.00", "56"};
        String[] Item5 = {"C06", "Lay's Caribbean Onion & Balsamic Chips 120g", "15.00", "26"};
        String[] Item6 = {"C07", "Doritos Sweet Chilli Pepper Corn Chips 150g", "15.00", "70"};
        String[] Item7 = {"S01", "Nestle Aero Peppermint Chocolate Slab 85g", "10", "26"};
        String[] Item8 = {"S02", "Snickers Duo Chocolate Bar 80g", "1.00", "2"};
        String[] Item9 = {"S03", "Maynards Jelly Babies 125g", "2.50", "19"};
        String[] Item10 = {"S04", "Nestle KitKat 11 Finger Dark Chocolate 135g", "10", "30"};
        String[] Item11 = {"S05", "M&M's Peanut Chocolate 100g", "10", "26"};
        String[] Item12 = {"D01", "Mineral Water 500ml", "11.00", "6"};
        String[] Item13 = {"D02", "Natural Water 500ml", "11.00", "20"};
        String[] Item14 = {"D03", "Powerade Island Burst 500ml", "12.00", "10"};
        String[] Item15 = {"D04", "Coke 500ml", "12.00", "26"};
        String[] Item16 = {"D05", "Fanta Grape 500ml", "12.00", "8"};
        String[] Item17 = {"D06", "Fanta Orange 500ml", "12.00", "26"};
        String[] Item18 = {"D07", "Liqui-Fruit Litchi Fruit Juice Box 250ml", "10", "6"};
        String[] Item19 = {"D08", "Liqui-Fruit 100% Berry Blaze Fruit Juice Box 250ml", "10", "26"};

        end++;
        inventory[end] = Item0;
        end++;
        inventory[end] = Item1;
        end++;
        inventory[end] = Item2;
        end++;
        inventory[end] = Item3;
        end++;
        inventory[end] = Item4;
        end++;
        inventory[end] = Item5;
        end++;
        inventory[end] = Item6;
        end++;
        inventory[end] = Item7;
        end++;
        inventory[end] = Item8;
        end++;
        inventory[end] = Item9;
        end++;
        inventory[end] = Item10;
        end++;
        inventory[end] = Item11;
        end++;
        inventory[end] = Item12;
        end++;
        inventory[end] = Item13;
        end++;
        inventory[end] = Item14;
        end++;
        inventory[end] = Item15;
        end++;
        inventory[end] = Item16;
        end++;
        inventory[end] = Item17;
        end++;
        inventory[end] = Item18;
        end++;
        inventory[end] = Item19;

        double cash[] = new double[11];
        cash[0] = 200;
        cash[1] = 100;
        cash[2] = 50;
        cash[3] = 30;
        cash[4] = 20;
        cash[5] = 10;
        cash[6] = 5;
        cash[7] = 1;
        cash[8] = 0.50;
        cash[9] = 0.10;
        cash[10] = 0.05;

        int numCash[] = new int[11];
        numCash[0] = 100;
        numCash[1] = 100;
        numCash[2] = 100;
        numCash[3] = 100;
        numCash[4] = 100;
        numCash[5] = 200;
        numCash[6] = 200;
        numCash[7] = 200;
        numCash[8] = 200;
        numCash[9] = 200;
        numCash[10] = 200;

        int tHundreds = 0,hundreds = 0, fifties = 0, thirties = 0,twenties = 0, tens = 0, fives = 0, ones = 0, fiftyC = 0, tenC = 0, fiveC = 0;

        Scanner rj = new Scanner(System.in);


        double total = 0, priceItem = 0, priceOfItems = 0, change = 0, payment = 0;
        int QTY = 0, newStock = 0, itemRow = 0;
        System.out.println("How many different items do you want to buy?");
        int a = rj.nextInt();
        for (int i = 1; i <= a; i = i + 1) {
            System.out.println("Enter item code: ");
            String x = rj.next();
            itemRow = findItem(inventory, x);
            // If item row is -1 than the item doesnt exist
            if (itemRow == -1) {
                System.out.println("Item does not exist in inventory");
                break;
            } else if (itemRow != 1) {
                System.out.println("Item selected: " + inventory[itemRow][name]);

                System.out.println("Enter quantity of item: ");
                QTY = rj.nextInt();

                System.out.println("Quantity: " + QTY);
                newStock = (Integer.parseInt(inventory[itemRow][stock])) - QTY;

                priceItem = Double.parseDouble(inventory[itemRow][price]);
                priceOfItems = (double) (QTY * priceItem);

                System.out.println("Price of " + inventory[itemRow][name] + ": N$" + priceItem);
                System.out.println("Cost of items: N$" + priceOfItems);
                total = total + priceOfItems;

                System.out.println("Total due: N$" + total);
            }
        }
        System.out.println("Enter amount paid: ");
        payment = rj.nextDouble();

        change = payment - total;
        System.out.println("Change: N$" + change);


        if (change >= 0) {
            int changed = (int) change * 100;

            if (numCash[0] > 25) {
                tHundreds = changed / 20000;
                changed = changed % 20000;
                numCash[0] = numCash[0] - tHundreds;
            } else if (numCash[0] <= 25 && numCash[1] > 25) {
                hundreds = (changed / 20000) * 2;
                changed = (changed % 20000) * 2;
                numCash[1] = numCash[1] - hundreds;
            }

            if (numCash[1] > 25) {
                hundreds = changed / 10000;
                changed = changed % 10000;
                numCash[1] = numCash[1] - hundreds;
            } else if (numCash[1] <= 25 && numCash[2] > 25) {
                fifties = (changed / 10000) * 2;
                changed = (changed % 10000) * 2;
                numCash[2] = numCash[2] - fifties;
            }


            if (numCash[2] > 25) {
                fifties = changed / 5000;
                changed = changed % 5000;
                numCash[2] = numCash[2] - fifties;
            } else if ((numCash[2] <= 25 && numCash[4] > 25) && numCash[5] > 25) {
                changed = changed / 5000;
                changed = changed % 5000;
                twenties = changed * 2;
                numCash[4] = numCash[4] - twenties;
                tens = changed * 1;
                numCash[5] = numCash[5] - tens;
            }

            if (numCash[3] > 25) {
                thirties = changed / 3000;
                changed = changed % 3000;
                numCash[3] = numCash[3] - thirties;
            } else if (numCash[3] <= 25 && numCash[4] > 25) {
                twenties = changed / 2000;
                changed = changed % 2000;
                numCash[4] = numCash[4] - twenties;
            }

            if (numCash[4] > 25) {
                twenties = changed / 2000;
                changed = changed % 2000;
                numCash[4] = numCash[4] - twenties;
            } else if (numCash[4] <= 25 && numCash[5] > 25) {
                tens = (changed / 2000) * 2;
                changed = (changed % 2000) * 2;
                numCash[5] = numCash[5] - tens;
            }

            if (numCash[5] > 25) {
                tens = changed / 1000;
                changed = changed % 1000;
                numCash[5] = numCash[5] - tens;
            } else if (numCash[5] <= 25 && numCash[6] > 25) {
                fives = changed / 500;
                changed = changed % 500;
                numCash[6] = numCash[6] - fives;
            }

            if (numCash[6] > 25) {
                fives = changed / 500;
                changed = changed % 500;
                numCash[6] = numCash[6] - fives;
            } else if (numCash[6] <= 25 && numCash[7] > 25) {
                ones = changed / 100;
                changed = changed % 100;
                numCash[7] = numCash[7] - ones;
            }

            if (numCash[7] > 25) {
                ones = changed / 100;
                changed = changed % 100;
                numCash[7] = numCash[7] - ones;
            } else if (numCash[7] <= 25 && numCash[8] > 25) {
                fiftyC = changed / 50;
                changed = changed % 50;
                numCash[8] = numCash[8] - fiftyC;
            }

            if (numCash[8] > 25) {
                fiftyC = changed / 50;
                changed = changed % 50;
                numCash[8] = numCash[8] - fiftyC;
            } else if (numCash[8] <= 25 && numCash[9] > 25) {
                tenC = changed / 10;
                changed = changed % 10;
                numCash[9] = numCash[9] - tenC;
            }

            if (numCash[9] > 25) {
                tenC = changed / 10;
                changed = changed % 10;
                numCash[9] = numCash[9] - tenC;
            } else if (numCash[9] <= 25 && numCash[10] > 25) {
                fiveC = (changed / 10) * 2;
                changed = (changed % 10) * 2;
                numCash[10] = numCash[10] - fiveC;
            }
            System.out.println("Your change is disbursed as follows: N$200 X " + tHundreds + ", N$100 X " + hundreds + ", N$50 X" + fifties + ", N$30 X " + thirties + ", N$20 X " + twenties + ", N$10 X "  + tens + ", N$5 X " + fives + ", N$1 X " + ones + ", 50cents X " +fiftyC+ ", 10cents X "  + tenC + " and 5cents X " + fiveC);


            System.out.println("Sammy's Sweets");
            System.out.println("417 Iverson Road");
            System.out.println("Windhoek");
            System.out.println("104-836-0217");
            System.out.println("QTY "+ "     "+"Name "+"   "+"Amount");
            System.out.println("* * * * * * * * * * * * * *");
            System.out.println(QTY+"    "+inventory[itemRow][name] + "     " + inventory[itemRow][price]);

            System.out.println("* * * * * * * * * * * * * *");
            System.out.println("Total"+"      "+total);
            System.out.println("Paid"+"      "+payment);
            System.out.println("Change"+"      "+change);
            System.out.println("* * * * * * * * * * * * * *");
        }
        else if(change < 0){
            System.out.println("We do not allow negatives. Please pay with a value greater than or equals to the total due");
        }

        // Owners menu
    }
}

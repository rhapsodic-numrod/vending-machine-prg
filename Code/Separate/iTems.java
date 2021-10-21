import java.util.*;
public class iTems {
    public static void main(String[] args) {
        int id = 0, name = 1, price = 2, stock = 3, end = -1,rows = 20, cols = 4;
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

        Scanner rj = new Scanner(System.in);

        
        double total = 0;
                System.out.println("How many different items do you want to buy?");
        int a = rj.nextInt();
        for (int i = 1; i <= a; i++){
            System.out.println("Enter item code: ");
            int x = rj.nextInt();

            System.out.println("Item selected: " );

            System.out.println("Enter quantity of item: ");
            int QTY = rj.nextInt();

            System.out.println("Quantity: " + QTY);
                double priceOfItems = (double) (QTY * itemPrice[x]);

                System.out.println("Price of " + item[x]  +": N$" +itemPrice[x]);

                System.out.println("Cost of items: N$" + priceOfItems);
                total = total + priceOfItems;

                System.out.println("Total due: N$" + total);
                if(x == a){
                    break;
                }
                itemStock[x] = itemStock[x] - QTY;
                System.out.println("Number of " +item[x] + " remaining: " + itemStock[x]);
            }

                double cash[] = new double[7];
                cash[0] = 100;
                cash[1] = 50;
                cash[2] = 10;
                cash[3] = 5;
                cash[4] = 1;
                cash[5] = 0.10;
                cash[6] = 0.05;

         int numCash[] = new int[7];
         numCash[0] = 100;
         numCash[1] = 100;
         numCash[2] = 100;
         numCash[3] = 100;
         numCash[4] = 100;
         numCash[5] = 200;
         numCash[6] = 200;

                System.out.println("Enter amount paid: ");
                double payment = rj.nextDouble();

                double change = payment - total;
                System.out.println("Change: N$" + change);

                while(change >= 0){
                    int changed = (int)change * 100;

                    if(numCash[0] > 25){
                        int hundreds = changed/10000;
                        changed = changed%10000;
                        numCash[0] = numCash[0] - hundreds;
                    }
                    else if(numCash[0] <= 25 && numCash[1] > 25){
                        int fifties = (changed/10000)*2;
                        changed = (changed%10000)*2;
                        numCash[1] = numCash[1] - fifties;
                        System.out.println("N$" +cash[0] +" remaining:" + numCash[0] +" .Please restock.");
                    }
                    if(numCash[2] > 25){
                        int tens = changed/1000;
                        changed = changed%1000;
                        numCash[2] = numCash[2] - tens;
                    }
                    else if(numCash[2] <= 25 && numCash[3] > 25) {
                        int fives = (changed/1000)*2;
                        changed = (changed%1000)*2;
                        numCash[3] = numCash[3] - fives;
                        System.out.println("N$" +cash[2] +" remaining:" + numCash[2] +" .Please restock.");
                    }
                    if(numCash[3] > 25) {
                        int fives = changed/500;
                        changed = changed%500;
                        numCash[3] = numCash[3] - fives;
                    }
                    else if(numCash[3] <= 25 && numCash[4] > 25) {
                        int ones = (changed/500)*5;
                        changed = (changed%500)*5;
                        numCash[4] = numCash[4] - ones;
                        System.out.println("N$" +cash[3] +" remaining:" + numCash[3] +" .Please restock.");
                    }
                    if(numCash[4] > 25) {
                        int ones = changed/100;
                        changed = changed%100;
                        numCash[4] = numCash[4] - ones;
                    }
                    else if(numCash[4] <= 25 && numCash[5] > 25) {
                        int tenC = (changed/100)*10;
                        changed = (changed%100)*10;
                        numCash[5] = numCash[5] - tenC;
                        System.out.println("N$" +cash[4] +" remaining:" + numCash[4] +" .Please restock.");
                    }
                    if(numCash[5] > 25) {
                        int tenC = changed/10;
                        changed = changed%10;
                        numCash[5] = numCash[5] - tenC;
                    }
                    else if(numCash[5] <= 25 && numCash[6] > 25) {
                        int fiveC = (changed/10)*2;
                        changed = (changed%10)*2;
                        numCash[6] = numCash[6] - 1;
                        System.out.println(cash[5]*100 +"c " +" remaining:" + numCash[5] +" .Please restock.");
                    }
                    if(numCash[6] > 25) {
                        int fiveC = changed/5;
                        changed = changed%5;
                        numCash[6] = numCash[6] - fiveC;
                    }
                    else if(numCash[6] == 0 || numCash[6] <= 25) {
                        System.out.println(cash[6]*100 +"c " +" remaining:" + numCash[6] +" .Please restock.");
                    }
                    System.out.println("Your change is disbursed as follows: N$100 X 1, N$10X1, N$5X1 ,N$1X3,10centsX3\n" +
                            "and 5centsX1");
                }

        }
    }


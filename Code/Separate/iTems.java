import java.util.*;
public class iTems {
     public static void main(String[] args) {
        int id = 0, name = 1, price = 2, stock = 3, end = 0,rows = 20, cols = 4;
        String[][] inventory = new String[rows][cols];
        // Adding test items
        String[] testItem1 = {"12AB", "Chips", "10.00", "20"};
        String[] testItem2 = {"92AB", "Sour gums", "1.00", "2"};
        String[] testItem3 = {"10AB", "Licorice", "2.50", "50"};
        String[] testItem4 = {"12CD", "Bubblegum", "0.50", "70"};
        String[] testItem5 = {"CLB2", "Stokkies", "1.50", "10"};
        String[] testItem6 = {"D01A", "Coke", "10", "26"};
        inventory[end] = testItem1;
        end++;
        inventory[end] = testItem2;
        end++;
        inventory[end] = testItem3;
        end++;
        inventory[end] = testItem4;
        end++;
        inventory[end] = testItem5;
        end++;
        inventory[end] = testItem6;

        Scanner rj = new Scanner(System.in);

        
        double total = 0;
                System.out.println("How many different items do you want to buy?");
        int a = rj.nextInt();
        for (int i = 1; i <= a; i++){
            System.out.println("Enter item code: ");
            int x = rj.nextInt();

            System.out.println("Item selected: " +);

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


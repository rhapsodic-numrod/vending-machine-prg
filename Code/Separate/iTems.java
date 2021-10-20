import java.util.*;
public class iTems {
     public static void main(String[] args) {

        Scanner rj = new Scanner(System.in);

        int itemCode[] = new int[30];
        itemCode[0] = 1234;
        itemCode[1] = 1233;
        itemCode[2] = 1232;
        itemCode[3] = 1231;
        itemCode[4] = 1230;
        itemCode[5] = 1229;
        itemCode[6] = 1228;
        itemCode[7] = 1227;
        itemCode[8] = 1226;
        itemCode[9] = 1225;
        itemCode[10] = 1224;
        itemCode[11] = 1223;
        itemCode[12] = 1222;
        itemCode[13] = 1221;
        itemCode[14] = 1220;
        itemCode[15] = 1219;
        itemCode[16] = 1218;
        itemCode[17] = 1217;
        itemCode[18] = 1216;
        itemCode[19] = 1215;
        itemCode[20] = 1214;
        itemCode[21] = 1213;
        itemCode[22] = 1212;
        itemCode[23] = 1211;
        itemCode[24] = 1210;
        itemCode[25] = 1209;
        itemCode[26] = 1208;
        itemCode[27] = 1207;
        itemCode[28] = 1206;
        itemCode[29] = 1205;

        String item[] = new String[30];
        item[0] = "Simba Salt and Vinegar Flavoured Potato Chops 132g";
        item[1] = "Simba Chilli Biltong Flavoured Potato Chips 132g";
        item[2] = "Simba Mrs Balls Chutney Flavoured Potato Chips 132g";
        item[3] = "Simba Smoked Beef Flavoured Potato Chips 132g";
        item[4] = "Lay's Thai Sweet Chilli Flavoured Potato Chips 120g";
        item[5] = "Lay's Potato Chips Classic 120g";
        item[6] = "Lay's Caribbean Onion & Balsamic Vinegar Potato Chips 120g";
        item[7] = "Lay's Sweet & Smokey American BBQ Potato Chips 120g";
        item[8] = "Doritos Sweet Chilli Pepper Flavoured Corn Chips 150g";
        item[9] = "Doritos Spicy Wings Flavoured Corn Chips 150g";
        item[10] = "Doritos Cheese Supreme Flavoured Corn Chips 150g";
        item[11] = "Doritos Sour Cream & Mild Chilli Flavoured Corn Chips 150";
        item[12] = "Nestle Aero Peppermint Chocolate Slab 85g";
        item[13] = "Cadbury Fruit Snacker 45g";
        item[14] = "M&M's Peanut Chocolate 100g";
        item[15] = "Skittles Coated Candy With Fruit Flavours 38g";
        item[16] = "Nestle KitKat 11 Finger Dark Chocolate Bar 135g";
        item[17] = "Cadbury Lunch Bar Milk Chocolate Bar 48g";
        item[18] = "Nestle Bar-One Chocolate Bar 90g";
        item[19] = "Snickers Duo Chocolate Bar 80g";
        item[20] = "Coke 500ml";
        item[21] = "Fanta Grape 500ml";
        item[22] = "Fanta Orange 500ml";
        item[23] = "Stoney 500ml";
        item[24] = "Liqui-Fruit 100% Berry Blaze Fruit Juice Box 250ml";
        item[25] = "Liqui-Fruit Orange Fruit Juice Box 250ml";
        item[26] = "Liqui-Fruit Litchi Fruit Juice Box 250ml";
        item[27] = "Mineral Water 500ml";
        item[28] = "Natural Water 500ml";
        item[29] = "Sparkling Water Strawberry 500ml";

        double itemPrice[] = new double[30];
        itemPrice[0] = 18;
        itemPrice[1] = 18;
        itemPrice[2] = 18;
        itemPrice[3] = 18;
        itemPrice[4] = 22.50;
        itemPrice[5] = 22.50;
        itemPrice[6] = 22.50;
        itemPrice[7] = 22.50;
        itemPrice[8] = 20.25;
        itemPrice[9] = 20.25;
        itemPrice[10] = 20.25;
        itemPrice[11] = 20.25;
        itemPrice[12] = 12.50;
        itemPrice[13] = 12.50;
        itemPrice[14] = 25.60;
        itemPrice[15] = 12.50;
        itemPrice[16] = 32.60;
        itemPrice[17] = 15.25;
        itemPrice[18] = 15.25;
        itemPrice[19] = 15.25;
        itemPrice[20] = 12.30;
        itemPrice[21] = 12.30;
        itemPrice[22] = 12.30;
        itemPrice[23] = 12.30;
        itemPrice[24] = 10.50;
        itemPrice[25] = 10.50;
        itemPrice[26] = 10.50;
        itemPrice[27] = 6;
        itemPrice[28] = 6;
        itemPrice[29] = 8.25;

        int itemStock[] = new int[30];
        itemStock[0] = 20;
        itemStock[1] = 20;
        itemStock[2] = 20;
        itemStock[3] = 20;
        itemStock[4] = 20;
        itemStock[5] = 20;
        itemStock[6] = 20;
        itemStock[7] = 20;
        itemStock[8] = 20;
        itemStock[9] = 20;
        itemStock[10] = 20;
        itemStock[11] = 20;
        itemStock[12] = 20;
        itemStock[13] = 20;
        itemStock[14] = 20;
        itemStock[15] = 20;
        itemStock[16] = 20;
        itemStock[17] = 20;
        itemStock[18] = 20;
        itemStock[19] = 20;
        itemStock[20] = 20;
        itemStock[21] = 20;
        itemStock[22] = 20;
        itemStock[23] = 20;
        itemStock[24] = 20;
        itemStock[25] = 20;
        itemStock[26] = 20;
        itemStock[27] = 20;
        itemStock[28] = 20;
        itemStock[29] = 20;

        double total = 0;
                System.out.println("How many different items do you want to buy?");
        int a = rj.nextInt();
        for (int i = 1; i <= a; i++){
            System.out.println("Enter item code: ");
            int x = rj.nextInt();

            System.out.println("Item selected: " +item[x]);

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


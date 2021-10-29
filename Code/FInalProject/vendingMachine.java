import java.util.Scanner;

public class vendingMachine {
    public static void printLogo(){
        System.out.println(" /$$$$$$                                                                   /$$$$$$                                      /$$             ");
        System.out.println("/$$__  $$                                                                 /$$__  $$                                    | $$             ");
        System.out.println("| $$  \\__/  /$$$$$$  /$$$$$$/$$$$  /$$$$$$/$$$$  /$$   /$$  /$$$$$$$      | $$  \\__/ /$$  /$$  /$$  /$$$$$$   /$$$$$$  /$$$$$$   /$$$$$$$");
        System.out.println("|  $$$$$$  |____  $$| $$_  $$_  $$| $$_  $$_  $$| $$  | $$ /$$_____/      |  $$$$$$ | $$ | $$ | $$ /$$__  $$ /$$__  $$|_  $$_/  /$$_____/");
        System.out.println(" \\____  $$  /$$$$$$$| $$ \\ $$ \\ $$| $$ \\ $$ \\ $$| $$  | $$|  $$$$$$        \\____  $$| $$ | $$ | $$| $$$$$$$$| $$$$$$$$  | $$   |  $$$$$$ ");
        System.out.println(" /$$  \\ $$ /$$__  $$| $$ | $$ | $$| $$ | $$ | $$| $$  | $$ \\____  $$       /$$  \\ $$| $$ | $$ | $$| $$_____/| $$_____/  | $$ /$$\\____  $$");
        System.out.println("|  $$$$$$/|  $$$$$$$| $$ | $$ | $$| $$ | $$ | $$|  $$$$$$$ /$$$$$$$/      |  $$$$$$/|  $$$$$/$$$$/|  $$$$$$$|  $$$$$$$  |  $$$$//$$$$$$$/");
        System.out.println(" \\______/  \\_______/|__/ |__/ |__/|__/ |__/ |__/ \\____  $$|_______/        \\______/  \\_____/\\___/  \\_______/ \\_______/   \\___/ |_______/ ");
        System.out.println("                                                 /$$  | $$                                                                               ");
        System.out.println("                                                |  $$$$$$/                                                                               ");
        System.out.println("                                                 \\______/                                                                                ");
    }

    public static void printOwnersMenu(){
        System.out.println("----------------------");
        System.out.println("---- Owners Menu ----");
        System.out.println("----------------------");
        System.out.println("What would you like to do?");
        System.out.println("[1] Restock/Add new items");
        System.out.println("[2] Change prices");
        System.out.println("[3] Cash out/ cash in");
        System.out.println("[4] Print out summary of all items in stock");
        System.out.println("[5] Print out amount of cash");
        System.out.println("[6] Print out items that need restocking");
        System.out.println("[7] EXIT");
        System.out.print("Enter a number: ");
    }

    public static int findItem(String[][] arr, String searchItem){
        int indexOfItem = 0, id = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i][id].equalsIgnoreCase(searchItem)){
                indexOfItem = i;
                break;
            } else{
                indexOfItem = -1;
            }
        }
        return indexOfItem;
    }

    public static void ownerPrintAllItems(String[][] items, int lastRow){
        int id = 0,name  = 1, price = 2, stock = 3;
        int itemLength = items.length;
        TableList ownerItemList = new TableList(4, "Item ID", "Item Name", "Price", "Stock Available");
        ownerItemList.withUnicode(true);
        for (int i = 0; i < itemLength; i++){
            ownerItemList.addRow(items[i][id], items[i][name],items[i][price],items[i][stock]);
        }
        ownerItemList.print();
    }

    public static void custPrintAllItems(String[][] items, int lastRow){
        int id = 0,name  = 1, price = 2;
        TableList itemList = new TableList(3, "Item ID", "Item Name", "Price");
        itemList.withUnicode(true);
        for (int i = 0; i < lastRow; i++){
            itemList.addRow(items[i][id], items[i][name], items[i][price]);
        }
        itemList.print();
    }

    public static void printAllcash(double[] moneyArray, int columLen) {
        TableList money = new TableList(columLen, "N$ 200","N$ 100","N$ 50","N$ 30","N$ 20","N$ 10","N$ 5","N$ 1","50c","10c","5c").withUnicode(true);
        money.addRow(Double.toString(moneyArray[0]),Double.toString(moneyArray[1]),Double.toString(moneyArray[2]),Double.toString(moneyArray[3]),Double.toString(moneyArray[4]),Double.toString(moneyArray[5]),Double.toString(moneyArray[6]),Double.toString(moneyArray[7]),Double.toString(moneyArray[8]),Double.toString(moneyArray[9]),Double.toString(moneyArray[10]));
        money.print();
    }
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        // Finance information
        int th, oh, ft, tht, twt, t, f, o, ftc, tc, fc;

        int financeCols = 11;
        double[] money = new double[financeCols];
        //inventory values
        int id = 0,name  = 1, price = 2, stock = 3, inventoryEnd = -1, rows = 20, inventoryCols = 4;
        // Two factor authencation codes
        String ownerPass = "1234";
        String verificationPass = "4321";
        String[][] inventory = new String[rows][inventoryCols];
        //#region adding vending machine items
        // Adding base items
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

        inventoryEnd++;
        inventory[inventoryEnd] = Item0;
        inventoryEnd++;
        inventory[inventoryEnd] = Item1;
        inventoryEnd++;
        inventory[inventoryEnd] = Item2;
        inventoryEnd++;
        inventory[inventoryEnd] = Item3;
        inventoryEnd++;
        inventory[inventoryEnd] = Item4;
        inventoryEnd++;
        inventory[inventoryEnd] = Item5;
        inventoryEnd++;
        inventory[inventoryEnd] = Item6;
        inventoryEnd++;
        inventory[inventoryEnd] = Item7;
        inventoryEnd++;
        inventory[inventoryEnd] = Item8;
        inventoryEnd++;
        inventory[inventoryEnd] = Item9;
        inventoryEnd++;
        inventory[inventoryEnd] = Item10;
        inventoryEnd++;
        inventory[inventoryEnd] = Item11;
        inventoryEnd++;
        inventory[inventoryEnd] = Item12;
        inventoryEnd++;
        inventory[inventoryEnd] = Item13;
        inventoryEnd++;
        inventory[inventoryEnd] = Item14;
        inventoryEnd++;
        inventory[inventoryEnd] = Item15;
        inventoryEnd++;
        inventory[inventoryEnd] = Item16;
        inventoryEnd++;
        inventory[inventoryEnd] = Item17;
        inventoryEnd++;
        inventory[inventoryEnd] = Item18;
        inventoryEnd++;
        inventory[inventoryEnd] = Item19;
        //#endregion adding vending machine items
        String landingPageChoice = "";
        while(!landingPageChoice.equalsIgnoreCase("#####")){ //If user enters ##### the programe shutsdown
            //#region Landing page
            printLogo();
            //    First five items
            System.out.print("Location: Office Building NUST, Windhoek\t\t");
            System.out.println("\tWelcome to Sammy's Sweets Vending Machine!");
            System.out.println("Here are just a few items on sale.");
            custPrintAllItems(inventory, 5);
            System.out.println("To see all our items press [*]");
            landingPageChoice = userInput.next();
            //#endregion Landing page
            //#region Customer menu
            if (landingPageChoice.equals("*")){
                custPrintAllItems(inventory, inventoryEnd);
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
                int i = 0;
                String[][] n = new String[rows][inventoryCols];

                double total = 0, priceItem = 0, priceOfItems = 0, change = 0, payment = 0;
                int QTY = 0, newStock = 0, itemRow = 0;
                System.out.println("How many different items do you want to buy?");
                int a = userInput.nextInt();
                for (i = 1; i <= a; i = i + 1) {
                    System.out.println("Enter item code: ");
                    String x = userInput.next();

                    itemRow = findItem(inventory, x);
                    // If item row is -1 than the item doesnt exist
                    if (itemRow == -1) {
                        System.out.println("Item does not exist in inventory");
                        break;
                    } else if (itemRow != 1) {  //if item exists
                        // prints name of item chosen
                        System.out.println("Item selected: " + inventory[itemRow][name]);
                        n[a+1][1] = inventory[itemRow][name];
                        // asks for quantity of item to be input
                        System.out.println("Enter quantity of item: ");
                        QTY = userInput.nextInt();
                        // prints quantity input
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
                payment = userInput.nextDouble();

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
                    System.out.println("Your change is disbursed as follows: N$200 X " + tHundreds + ", N$100 X " + hundreds + ", N$50 X" + fifties + ", N$30 X " + thirties + ", N$20 X " + twenties + ", N$10 X " + tens + ", N$5 X " + fives + ", N$1 X " + ones + ", 50cents X " + fiftyC + ", 10cents X " + tenC + " and 5cents X " + fiveC);


                    System.out.println("Sammy's Sweets");
                    System.out.println("417 Iverson Road");
                    System.out.println("Windhoek");
                    System.out.println("104-836-0217");
                    System.out.println("QTY " + "     " + "Name " + "   " + "Amount");
                    System.out.println("* * * * * * * * * * * * * *");
                    for (i = 1; i <= a; i++) {
                            System.out.println(QTY + "    " + n[a + 1][1] + "     " + priceItem);
                }
                    System.out.println("* * * * * * * * * * * * * *");
                    System.out.println("Total"+"      "+total);
                    System.out.println("Paid"+"      "+payment);
                    System.out.println("Change"+"      "+change);
                    System.out.println("* * * * * * * * * * * * * *");
                }
                else if(change < 0){
                    System.out.println("We do not allow negatives. Please pay with a value greater than or equals to the total due");
                    break;
                }
                
            //#endregion Customer menu
            //#region Owners menu
            }else if(landingPageChoice.equalsIgnoreCase(ownerPass)){
                System.out.print("Enter verification password: ");
                String verificationCode = userInput.next();
                if (verificationCode.equalsIgnoreCase(verificationPass)){
                    int ownersMenuChoice = -1;
                    do{
                        printOwnersMenu();
                        ownersMenuChoice = userInput.nextInt();

                        switch (ownersMenuChoice){
                            case 1:{
                                System.out.println("------ Restock/Add new items ------");
                                System.out.println("Would you like to:");
                                System.out.println("[1] Restock");
                                System.out.println("[2] Add a new item");
                                System.out.println("[3] Go back");
                                int addRestockChoice = userInput.nextInt();
                                switch (addRestockChoice){
                                    case 1:{
                                        System.out.println("------- Restock -------");
                                        System.out.print("Enter item id: ");
                                        String itemToBeRestocked = userInput.next();
                                        // Find item
                                        int itemRow = findItem(inventory, itemToBeRestocked);
                                        // If item row is -1 than the item doesnt exist
                                        if (itemRow == -1){
                                            System.out.println("Item does not exist in inventory");
                                            break;
                                        } else{
                                            // Print the items name
                                            System.out.printf("Item name: %s Current Stock: %s%n",  inventory[itemRow][name], inventory[itemRow][stock]);
                                            System.out.print("Enter amount to be added: ");
                                            // Get ammount to be added
                                            int amountToBeAdded = userInput.nextInt();
                                            // Get the current stock from the item row
                                            int currentStock = Integer.parseInt(inventory[itemRow][stock]);
                                            // Add the new stock to the existing stock
                                            int newStock = amountToBeAdded + currentStock;
                                            // Change the value of the old stock to the new stock
                                            inventory[itemRow][stock] = String.valueOf(newStock);
                                            System.out.println("-----------------------------");
                                            System.out.printf("Item name: %s Current Stock: %s%n",  inventory[itemRow][name], inventory[itemRow][stock]);
                                            System.out.println("Process successfull :)");
                                            break;
                                        }
                                    } case 2:{
                                        System.out.println("---- Add a new item ----");
                                        // Only add if the inventory is not full
                                        if (inventoryEnd + 1 != rows){
                                            // Get item information
                                            System.out.print("Enter the item ID: ");
                                            String newItemID = userInput.next();

                                            System.out.print("Enter the item name: ");
                                            String newItemName = userInput.next();

                                            System.out.print("Enter the item price: ");
                                            String newItemPrice = userInput.next();
                                            
                                            System.out.print("Enter the ammount to be added: ");
                                            String newItemStock = userInput.next();
                                            // Add new item information to an inventory
                                            String[] newItem = {newItemID, newItemName, newItemPrice, newItemStock};
                                            // Add new item inventory to the inventory
                                            inventory[inventoryEnd + 1] = newItem;
                                            // Increase the inventoryEnd
                                            inventoryEnd++;
                                            System.out.println("Process Successfull :)");
                                            System.out.println("-------------------");
                                            break;
                                        } else{
                                            System.out.println("Unfortunately inventory is full cannot add any more items");
                                            break;
                                        }
                                    } case 3:{
                                        break;
                                    } 
                                }
                                break;
                            } case 2:{
                                System.out.println("------ Change price ------");
                                // Display all items
                                ownerPrintAllItems(inventory, inventoryEnd);
                                while(true){
                                    // Get the item information
                                    System.out.print("Enter item id: ");
                                    String itemID = userInput.nextLine();
                                    // Find the item
                                    int itemRow = findItem(inventory, itemID);
                                    if (itemRow == -1){
                                        System.out.println("Item does not exist, Enter ID again");
                                        // Onwer will have to re-enter the item ID
                                        continue;
                                    } else {
                                        int changePriceChoice = 0;
                                        while(changePriceChoice != 1){
                                            System.out.printf("Item Name: %s, Current Price: %s%n", inventory[itemRow][name], inventory[itemRow][price]);
                                            // Get new price
                                            System.out.print("Enter new price: ");
                                            String changedPrice = userInput.next();
                                            // Ask if user wants to continue
                                            System.out.println("[1] Go back\t[2] Continue");
                                            changePriceChoice = userInput.nextInt();

                                            if (changePriceChoice == 1){
                                                System.out.println("O_O");
                                                break;
                                            } else if (changePriceChoice == 2) {
                                                // Change the price from the row to the new price
                                                inventory[itemRow][price] = changedPrice;
                                                System.out.printf("Item Name: %s, New Price: %s%n", inventory[itemRow][name], inventory[itemRow][price]);
                                                System.out.println("Process Succsesfull :)");
                                                break;
                                            } else {
                                                System.out.println("[1] Go back\t[2] Continue");
                                                continue;
                                            }
                                        } 
                                        break;
                                    }
                                }
                                break;
                            } case 3:{
                                System.out.println("------- Cash in/out -------");
                                System.out.println("[1] Cash in ");
                                System.out.println("[2] Cash out");
                                System.out.println("[3] Go Back");
                                int cashInOutChoice = userInput.nextInt();
                                switch (cashInOutChoice) {
                                    case 1: {

                                        System.out.println("---------------------------------------------------------------");
                                        System.out.println("Enter number of the notes and coins");
                                        System.out.println("for example: " + "N$ 200: \n" + "2");
                                        System.out.println("---------------------------------------------------------------");
                                        System.out.println("N$ 200: ");
                                        //type how much of the 200 notes you want//
                                        //th stands for two hundred//
                                        th = userInput.nextInt();

                                        System.out.println("N$ 100: ");
                                        //oh stands for one hundred//
                                        oh = userInput.nextInt();

                                        System.out.println("N$ 50: ");
                                        ft = userInput.nextInt();

                                        System.out.println("N$ 30: ");
                                        tht = userInput.nextInt();

                                        System.out.println("N$ 20: ");
                                        twt = userInput.nextInt();

                                        System.out.println("N$ 10: ");
                                        t = userInput.nextInt();

                                        System.out.println("N$ 5: ");
                                        f = userInput.nextInt();

                                        System.out.println("N$ 1: ");
                                        o = userInput.nextInt();

                                        System.out.println("50c: ");
                                        ftc = userInput.nextInt();

                                        System.out.println("10c: ");
                                        tc = userInput.nextInt();

                                        System.out.println("5c: ");
                                        fc = userInput.nextInt();

                                        double thr = th * 200.00;
                                        double ohr = oh * 100.00;
                                        double ftr = ft * 50.00;
                                        double thtr = tht * 30.00;
                                        double twtr = twt * 20.00;
                                        double tr = t * 10.00;
                                        double fr = f * 5.00;
                                        double or = o * 1.00;
                                        double ftcr = ftc * 0.50;
                                        double tcr = tc * 0.10;
                                        double fcr = fc * 0.05;

                                        System.out.println("There's " + th + " of N$ 200 dollar(s)");
                                        System.out.println("There's " + oh + " of N$ 100 dollar(s)");
                                        System.out.println("There's " + ft + " of N$ 50 dollar(s)");
                                        System.out.println("There's " + tht + " of N$ 30 dollar(s)");
                                        System.out.println("There's " + twt + " of N$ 20 dollar(s)");
                                        System.out.println("There's " + t + " of N$ 10 dollar(s)");
                                        System.out.println("There's " + f + " of N$ 5 dollar(s)");
                                        System.out.println("There's " + o + " of N$ 1 dollar(s)");
                                        System.out.println("There's " + ftc + " of 50 cent(s)");
                                        System.out.println("There's " + tc + " of 10 cent(s)");
                                        System.out.println("There's " + fc + " of 5 cent(s)");

                                        double result = thr + ohr + ftr + thtr + twtr + tr + fr + or + ftcr + tcr + fcr;


                                        double[] newcash = {thr, ohr, ftr, thtr, twtr, tr, fr, or, ftcr, tcr, fcr};


                                        if (result >= 0) {
                                            //financeCols is an arraysize//
                                            for (int i = 0; i < financeCols; i++) {
                                                //newcash is put in money and then if another newcash is made it will add on the previous newcash in money//
                                                money[i] = money[i] + newcash[i];
                                            }
                                            //lets it appear in table format//
                                            printAllcash(newcash, financeCols);


                                            System.out.println(" ");
                                            double sum = 0;
                                            //adds everything in the array newcash//
                                            for (double itemPrice : newcash) {
                                                sum += itemPrice;
                                            }

                                            System.out.printf("Amount: " + "%.2f", sum);
                                            System.out.println(" ");
                                            System.out.println("Cashed in successfull ! !");
                                            System.out.println(" ");

                                            break;

                                        } else {
                                            System.out.println(" ");
                                            System.out.println("Invalid amount please retry ! !");
                                            System.out.println(" ");
                                            break;
                                        }
                                    }
                                    case 2: {
                                        System.out.println("---------------------------------------------------------------");
                                        System.out.println("Enter number of the notes and coins");
                                        System.out.println("for example: " + "N$ 200: \n" + "2");
                                        System.out.println("---------------------------------------------------------------");
                                        double[] newcash = new double[financeCols];
                                        boolean isPossible = true;
                                        do{
                                        System.out.println("N$ 200: ");
                                        th = userInput.nextInt();

                                        System.out.println("N$ 100: ");
                                        oh = userInput.nextInt();

                                        System.out.println("N$ 50: ");
                                        ft = userInput.nextInt();

                                        System.out.println("N$ 30: ");
                                        tht = userInput.nextInt();

                                        System.out.println("N$ 20: ");
                                        twt = userInput.nextInt();

                                        System.out.println("N$ 10: ");
                                        t = userInput.nextInt();

                                        System.out.println("N$ 5: ");
                                        f = userInput.nextInt();

                                        System.out.println("N$ 1: ");
                                        o = userInput.nextInt();

                                        System.out.println("50c: ");
                                        ftc = userInput.nextInt();

                                        System.out.println("10c: ");
                                        tc = userInput.nextInt();

                                        System.out.println("5c: ");
                                        fc = userInput.nextInt();

                                        double thr = th * 200.00;
                                        double ohr = oh * 100.00;
                                        double ftr = ft * 50.00;
                                        double thtr = tht * 30.00;
                                        double twtr = twt * 20.00;
                                        double tr = t * 10.00;
                                        double fr = f * 5.00;
                                        double or = o * 1.00;
                                        double ftcr = ftc * 0.50;
                                        double tcr = tc * 0.10;
                                        double fcr = fc * 0.05;

                                        System.out.println("There's " + th + " of N$ 200 dollar(s)");
                                        System.out.println("There's " + oh + " of N$ 100 dollar(s)");
                                        System.out.println("There's " + ft + " of N$ 50 dollar(s)");
                                        System.out.println("There's " + tht + " of N$ 30 dollar(s)");
                                        System.out.println("There's " + twt + " of N$ 20 dollar(s)");
                                        System.out.println("There's " + t + " of N$ 10 dollar(s)");
                                        System.out.println("There's " + f + " of N$ 5 dollar(s)");
                                        System.out.println("There's " + o + " of N$ 1 dollar(s)");
                                        System.out.println("There's " + ftc + " of 50 cent(s)");
                                        System.out.println("There's " + tc + " of 10 cent(s)");
                                        System.out.println("There's " + fc + " of 5 cent(s)");

                                        newcash[0] = thr;
                                        newcash[1] = ohr;
                                        newcash[2] = ftr;
                                        newcash[3] = thtr;
                                        newcash[4] = twtr;
                                        newcash[5] = tr;
                                        newcash[6] = fr;
                                        newcash[7] = or;
                                        newcash[8] = ftcr;
                                        newcash[9] = tcr;
                                        newcash[10] = fcr;
                                        for (int i = 0; i < financeCols; i++) {
                                            if (money[i] - newcash[i] < 0) {
                                                isPossible = false;
                                                break;
                                            }
                                        }
                                        if (!isPossible){
                                            System.out.println("");
                                            System.out.println("Invalid amount please cash in enough money to be taken out!!");
                                            System.out.println("");
                                            System.exit(01);
                                        } else{
                                            for (int j = 0; j < financeCols; j++) {
                                                money[j] = money[j] - newcash[j];
                                            }
                                            isPossible = true;
                                            break;
                                        }
                                    }while (!isPossible);
                                    if (isPossible){
                                        printAllcash(newcash, financeCols);
                                        
                                        
                                        System.out.println(" ");
                                        double sum = 0;
                                        for (double itemPrice : newcash) {
                                            sum += itemPrice;
                                        }
                                        
                                        System.out.printf("Amount : " + "%.2f", sum);
                                        System.out.println(" ");
                                        System.out.println("Cashed out successfull ! !");
                                        System.out.println(" ");
                                    }
                                    }
                                    break;
                                    case 3: {
                                        break;
                                    }
                                }
                                break;
                            } case 4:{
                                System.out.println("------- All Items -------");
                                int printChoice = 0;
                                do{
                                ownerPrintAllItems(inventory, inventoryEnd);
                                System.out.println("[1] Go back");
                                printChoice = userInput.nextInt();
                                } while (printChoice != 1);
                                break;
                            } case 5:{
                                System.out.println("------- All Cash -------");
                                int printChoice = 0;
                                do {
                                    //prints all cash in table format//
                                    printAllcash(money, financeCols);

                                    System.out.println("[1] Go back");
                                    printChoice = userInput.nextInt();
                                } while (printChoice != 1);
                                break;
                            } case 6:{
                                System.out.println("----- To Be Restocked -----");
                                TableList restockTable = new TableList(3,"Item ID", "Item Name","Stock Available");
                                restockTable.withUnicode(true);
                                restockTable.sortBy(0);
                                int printRestockChoice = 0;
                                do{
                                for (int k = 0; k < inventoryEnd; k++){
                                    int stockAvailable = Integer.parseInt(inventory[k][stock]);
                                    if (stockAvailable <= 25){
                                        restockTable.addRow(inventory[k][id],inventory[k][name],inventory[k][stock]);
                                    }
                                }
                                restockTable.print();
                                System.out.println("[1] Go back");
                                printRestockChoice = userInput.nextInt();
                                } while (printRestockChoice != 1);
                                break;
                            } case 7:{
                                System.out.println("Goodbye :)");
                                break;
                            } default:{
                                System.out.println("Enter numbers between 1-7");
                            } 
                        }
                    } while(ownersMenuChoice != 7);
                }
            }
            //#endregion Owner menu
        } 
        userInput.close();
    }
    }

import java.util.Scanner;

class OwnersMenu{

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
        int itemLength = items.length;
        TableList itemList = new TableList(3, "Item ID", "Item Name", "Price");
        itemList.withUnicode(true);
        for (int i = 0; i < itemLength; i++){
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
        int id = 0,name  = 1, price = 2, stock = 3, inventoryEnd = -1,rows = 20, inventoryCols = 4;
        String[][] inventory = new String[rows][inventoryCols];
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
        
        
        Scanner userInput = new Scanner(System.in);
        int ownersMenuChoice = -1;
        do{
            printOwnersMenu();
            ownersMenuChoice = userInput.nextInt();

            switch (ownersMenuChoice){
                case 1:{
                    System.out.println("-------------------");
                    System.out.println("Would you like to:");
                    System.out.println("[1] Restock");
                    System.out.println("[2] Add a new item");
                    System.out.println("[3] Go back");
                    int addRestockChoice = userInput.nextInt();
                    switch (addRestockChoice){
                        case 1:{
                            System.out.println("-------------------");
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
                            System.out.println("-------------------");
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
                    System.out.println("-------------------");
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
			// TODO: Finish Cash in Cash out section (Grant)
                    System.out.println("------- Cash in/out -------");
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
                    System.out.println("print all cash");
                    // TODO: Finish print all cash section (Grant)
                    break;
                } case 6:{
                    System.out.println("----- To Be Restocked -----");
                    TableList restockTable = new TableList(3,"Item ID", "Item Name","Stock Available");
                    restockTable.withUnicode(true);
                    restockTable.sortBy(0);
                    int printRestockChoice = 0;
                    do{
                    for (int i = 0; i < inventoryEnd; i++){
                        int stockAvailable = Integer.parseInt(inventory[i][stock]);
                        if (stockAvailable <= 25){
                            restockTable.addRow(inventory[i][id],inventory[i][name],inventory[i][stock]);
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
                    System.out.println("Enter from numbers 1-7");
                } 
            }
        } while(ownersMenuChoice != 7);
        userInput.close();
    }
}

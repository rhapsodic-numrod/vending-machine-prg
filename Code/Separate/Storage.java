

import java.util.Scanner;

public class Storage {


    public static void printOwnersMenu() {
        System.out.println("--------------------");
        System.out.println("----Storage Page----");
        System.out.println("--------------------");
        System.out.println("[1] Cash in/Cash out");
        System.out.println("[2] Print all cash");
        System.out.println("[3] back");
        System.out.println("");
        System.out.println("Enter number: ");
    }

    // public static void printAllcash(double[] cashin, int columLen) {
    //     System.out.println(" ");
    //     System.out.println("N$ 200 :    " + "N$ 100 :    " + "N$ 50 :     " + "N$ 30 :     " + "N$ 20 :     " + "N$ 10 :     " +
    //             "N$ 5 :      " + "N$ 1 :      " + "50c :       " + "10c :       " + "5c :       ");
    //     System.out.println("----------- ----------- ----------- ----------- ----------- ----------- ----------- ----------- ----------- ----------- ----------- ");
    //     for (int j = 0; j < columLen; j++) {
    //         System.out.printf("%.2f" + "         ", cashin[j]);
    //     }
    //     System.out.println(" ");
    //     System.out.println();
    // }
    public static void printAllcash(double[] moneyArray, int columLen) {
        TableList money = new TableList(columLen, "N$ 200","N$ 100","N$ 50","N$ 30","N$ 20","N$ 10","N$ 5","N$ 1","50c","10c","5c").withUnicode(true);
        money.addRow(Double.toString(moneyArray[0]),Double.toString(moneyArray[1]),Double.toString(moneyArray[2]),Double.toString(moneyArray[3]),Double.toString(moneyArray[4]),Double.toString(moneyArray[5]),Double.toString(moneyArray[6]),Double.toString(moneyArray[7]),Double.toString(moneyArray[8]),Double.toString(moneyArray[9]),Double.toString(moneyArray[10]));
        money.print();
    }


    public static void main(String[] args) {
        int th, oh, ft, tht, twt, t, f, o, ftc, tc, fc;

        int financeCols = 11;
        double[] money = new double[financeCols];


        Scanner userInput = new Scanner(System.in);
        int choice = -1;
        do {
            printOwnersMenu();
            choice = userInput.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("[1] Cash in ");
                    System.out.println("[2] Cash out");
                    System.out.println("[3] Back");
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
                                for (double price : newcash) {
                                    sum += price;
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


                            double[] newcash = {thr, ohr, ftr, thtr, twtr, tr, fr, or, ftcr, tcr, fcr};


                            for (int i = 0; i < financeCols; i++) {

                                if (money[i] - newcash[i] < 0) {
                                    System.out.println("");
                                    System.out.println("Invalid amount please cash in enough money to be taken out!!");
                                    System.out.println("");
                                    System.exit(01);
                                    //tried using break but it didn't work so i used System.exit
                                }
                                //newcash is put in money and then if another newcash is made in cash out it will subtract on the previous newcash in money
                                //which will show at the print all cash choice

                                    money[i] = money[i] - newcash[i];

                            }
                                    printAllcash(newcash, financeCols);


                                    System.out.println(" ");
                                    double sum = 0;
                                    for (double price : newcash) {
                                        sum += price;
                                    }

                                    System.out.printf("Amount : " + "%.2f", sum);
                                    System.out.println(" ");
                                    System.out.println("Cashed out successfull ! !");
                                    System.out.println(" ");
                                }




                        break;
                        case 3: {
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("print all");
                    int printChoice = 0;
                    do {
                        //prints all cash in table format//
                        printAllcash(money, financeCols);

                        System.out.println("[1] Go back");
                        printChoice = userInput.nextInt();
                    } while (printChoice != 1);
                    break;

                }
            }
        }
                while (choice != 3) ;
                userInput.close();


        }
    }


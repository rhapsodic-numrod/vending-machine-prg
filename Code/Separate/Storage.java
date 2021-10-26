

import java.util.Scanner;

public class Storage {




    public static void printOwnersMenu () {
        System.out.println("--------------------");
        System.out.println("----Storage Page----");
        System.out.println("--------------------");
        System.out.println("[1] Cash in/Cash out");
        System.out.println("[2] Print all cash");
        System.out.println("[3] back");
        System.out.println("");
        System.out.println("Enter number: ");
    }

    public static void printAllcash ( double[] cashin, int columLen){
        System.out.println(" ");
        System.out.println("N$ 200 :    " + "N$ 100 :    " + "N$ 50 :     " + "N$ 30 :     " + "N$ 20 :     " + "N$ 10 :     " +
                "N$ 5 :      " + "N$ 1 :      " + "50c :       " + "10c :       " + "5c :       ");
        System.out.println("----------- ----------- ----------- ----------- ----------- ----------- ----------- ----------- ----------- ----------- ----------- ");
        for (int j = 0; j < columLen; j++) {
            System.out.printf("%.2f" + "         ", cashin[j]);
        }
        System.out.println(" ");
        System.out.println();
    }


    public static void main (String[]args){
        int th, oh, ft, tht, twt, t, f, o, ftc, tc, fc;

        int  cols = 11;
        double[] money = new double[cols];

        Scanner keybrd = new Scanner(System.in);
        int choice = -1;
        do {
            printOwnersMenu();
            choice = keybrd.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("[1] Cash in ");
                    System.out.println("[2] Cash out");
                    System.out.println("[3] Back");
                    int choice1 = keybrd.nextInt();
                    switch (choice1) {
                        case 1: {

                            System.out.println("---------------------------------------------------------------");
                            System.out.println("Enter number of the notes and coins");
                            System.out.println("for example: " + "N$ 200: \n" + "2");
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("N$ 200: ");
                            th = keybrd.nextInt();

                            System.out.println("N$ 100: ");
                            oh = keybrd.nextInt();

                            System.out.println("N$ 50: ");
                            ft = keybrd.nextInt();

                            System.out.println("N$ 30: ");
                            tht = keybrd.nextInt();

                            System.out.println("N$ 20: ");
                            twt = keybrd.nextInt();

                            System.out.println("N$ 10: ");
                            t = keybrd.nextInt();

                            System.out.println("N$ 5: ");
                            f = keybrd.nextInt();

                            System.out.println("N$ 1: ");
                            o = keybrd.nextInt();

                            System.out.println("50c: ");
                            ftc = keybrd.nextInt();

                            System.out.println("10c: ");
                            tc = keybrd.nextInt();

                            System.out.println("5c: ");
                            fc = keybrd.nextInt();

                            double thr = th * 200.00;
                            double ohr = oh * 100.00;
                            double ftr = ft * 50.00;
                            double thtr = tht * 30.00;
                            double twtr = twt * 20.00;
                            double tr = t * 10.00;
                            double fr = f * 5.00;
                            double or = o*1.00;
                            double ftcr = ftc * 0.50;
                            double tcr = tc * 0.10;
                            double fcr = fc * 0.05;

                            System.out.println("There's "+th+" of N$ 200 dollar(s)");
                            System.out.println("There's "+oh+" of N$ 100 dollar(s)");
                            System.out.println("There's "+ft+ " of N$ 50 dollar(s)");
                            System.out.println("There's "+tht+" of N$ 30 dollar(s)");
                            System.out.println("There's "+twt+" of N$ 20 dollar(s)");
                            System.out.println("There's "+t+" of N$ 10 dollar(s)");
                            System.out.println("There's "+f+" of N$ 5 dollar(s)");
                            System.out.println("There's "+o+" of N$ 1 dollar(s)");
                            System.out.println("There's "+ftc+" of 50 cent(s)");
                            System.out.println("There's "+tc+" of 10 cent(s)");
                            System.out.println("There's "+fc+" of 5 cent(s)");

                            double result=thr+ ohr+ ftr+ thtr+ twtr+ tr+ fr+ or+ ftcr+ tcr+ fcr;

                            double[] newcash = {thr, ohr, ftr, thtr, twtr, tr, fr, or, ftcr, tcr, fcr};


                            if(result>0){
                                for(int i=0;i<cols;i++) {
                                    money[i] = money[i] + newcash[i];
                                }

                                printAllcash(newcash, cols);


                                System.out.println(" ");
                                double sum = 0;
                                for (double price : newcash) {
                                    sum += price;
                                }

                                System.out.printf("Amount: "+"%.2f", sum);
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
                            th = keybrd.nextInt();

                            System.out.println("N$ 100: ");
                            oh = keybrd.nextInt();

                            System.out.println("N$ 50: ");
                            ft = keybrd.nextInt();

                            System.out.println("N$ 30: ");
                            tht = keybrd.nextInt();

                            System.out.println("N$ 20: ");
                            twt = keybrd.nextInt();

                            System.out.println("N$ 10: ");
                            t = keybrd.nextInt();

                            System.out.println("N$ 5: ");
                            f = keybrd.nextInt();

                            System.out.println("N$ 1: ");
                            o = keybrd.nextInt();

                            System.out.println("50c: ");
                            ftc = keybrd.nextInt();

                            System.out.println("10c: ");
                            tc = keybrd.nextInt();

                            System.out.println("5c: ");
                            fc = keybrd.nextInt();

                            double thr = th * 200.00;
                            double ohr = oh * 100.00;
                            double ftr = ft * 50.00;
                            double thtr = tht * 30.00;
                            double twtr = twt * 20.00;
                            double tr = t * 10.00;
                            double fr = f * 5.00;
                            double or = o*1.00;
                            double ftcr = ftc * 0.50;
                            double tcr = tc * 0.10;
                            double fcr = fc * 0.05;

                            System.out.println("There's "+th+" of N$ 200 dollar(s)");
                            System.out.println("There's "+oh+" of N$ 100 dollar(s)");
                            System.out.println("There's "+ft+ " of N$ 50 dollar(s)");
                            System.out.println("There's "+tht+" of N$ 30 dollar(s)");
                            System.out.println("There's "+twt+" of N$ 20 dollar(s)");
                            System.out.println("There's "+t+" of N$ 10 dollar(s)");
                            System.out.println("There's "+f+" of N$ 5 dollar(s)");
                            System.out.println("There's "+o+" of N$ 1 dollar(s)");
                            System.out.println("There's "+ftc+" of 50 cent(s)");
                            System.out.println("There's "+tc+" of 10 cent(s)");
                            System.out.println("There's "+fc+" of 5 cent(s)");

                            double result=thr+ ohr+ ftr+ thtr+ twtr+ tr+ fr+ or+ ftcr+ tcr+ fcr;

                            double[] newcash = {thr, ohr, ftr, thtr, twtr, tr, fr, or, ftcr, tcr, fcr};


                            for(int i=0;i<cols;i++) {
                                money[i] = money[i] - newcash[i];
                            }
                            printAllcash(newcash, cols);


                            System.out.println(" ");
                            double sum = 0;
                            for (double price : newcash) {
                                sum += price;
                            }

                            System.out.printf("Amount : "+"%.2f", sum);
                            System.out.println(" ");
                            System.out.println("Cashed in successfull ! !");
                            System.out.println(" ");


                        }break;
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

                        printAllcash(money, cols);

                        System.out.println("[1] Go back");
                        printChoice = keybrd.nextInt();
                    } while (printChoice != 1);
                    break;
                }

            }
        } while (choice != 3);
        keybrd.close();
    }
}
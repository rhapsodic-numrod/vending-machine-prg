
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

        public static void printAllcash ( double[][] cashin, int lastRow, int columLen){
            System.out.println("TwoHundred  " + "OneHundred  " + "Fifty       " + "Thirty      " + "Twenty      " + "Ten         " +
                    "Five        " + "One         " + "FiftyCent   " + "TenCent     " + "FiveCent    ");
            System.out.println("----------- ----------- ----------- ----------- ----------- ----------- ----------- ----------- ----------- ----------- ----------- ");
            for (int i = 0; i <= lastRow; i++) {
                for (int j = 0; j < columLen; j++) {
                    System.out.print(cashin[i][j] + "         ");
                }
                System.out.println();
            }
        }

        public static void main (String[]args){
            int th, oh, ft, tht, twt, t, f, o, ftc, tc, fc;

            int TwoHundred = 0, OneHundred = 1, Fifty = 2, Thirty = 3, Twenty = 4, Ten = 5, Five = 6, One = 7, FiftyCent = 8, TenCent = 9, FiveCent = 10, end = 0, rows = 1, cols = 11;
            double[][] money = new double[rows][cols];

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
                                System.out.println("Enter the number of how much of notes and coins there should be");
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

                                double result = thr + ohr + ftr + thtr + twtr + tr + fr + or + ftcr + tcr + fcr;
                                if (result == 300.00) {
                                    double[] newcash = {thr, ohr, ftr, thtr, twtr, tr, fr, or, ftcr, tcr, fcr};

                                    if (end!=rows) {
                                        rows = rows - 1;
                                        money[end] = newcash;
                                    } else {
                                        money[end] = newcash;
                                    }
                                    System.out.println("Cashed in successfull ! !");
                                    break;
                                } else {
                                    System.out.println("Invalid amount please retry ! !");

                                    break;
                                }
                            }
                            case 2: {


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
                            printAllcash(money, end, cols);

                            if(end!=rows){
                                System.out.println("");
                                System.out.println("Amount : 0.0");
                                System.out.println("");
                            }else {
                                System.out.println("");
                                System.out.println("Amount : N$300.00");
                                System.out.println("");
                            }
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

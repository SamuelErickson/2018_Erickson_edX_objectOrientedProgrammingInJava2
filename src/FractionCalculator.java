import java.util.Scanner;

public class FractionCalculator {

    // big problem = how to work with fraction like 100/250 where not just 3 characters

    public static void main(String[] args) {
        intro();
        String op = getOperation();

        while (!op.equals("q") && !op.equals("Q")) {
            Fraction frac1 = getFraction();
            Fraction frac2 = getFraction();
            Fraction result;
            if (op.equals("+")) {
                result = frac1.add(frac2);
                System.out.println(frac1.toString() + " + " + frac2.toString() + " = " + result.toLowestTerms().toString()); // start here
            } else if (op.equals("-")) {
                result = frac1.subtract(frac2);
                System.out.println(frac1.toString() + " - " + frac2.toString() + " = " + result.toLowestTerms().toString()); // start here
            } else if (op.equals("/")) {
                result = frac1.divide(frac2);
                System.out.println(frac1.toString() + " / " + frac2.toString() + " = " + result.toLowestTerms().toString()); // start here
            } else if (op.equals("*")) {
                result = frac1.multiply(frac2);
                System.out.println(frac1.toString() + " * " + frac2.toString() + " = " + result.toLowestTerms().toString()); // start here
            } else if (op.equals("=")) {
                Boolean isEqual = frac1.equals(frac2);
                System.out.println(frac1.toString() + " = " + frac2.toString() + " is " + isEqual);
            }
            System.out.println("-----------------------------------------------");
            op = getOperation();
        }
    }


        public static String getOperation() {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter an operation +,-,/,*,=, or Q to quit");
            boolean validInput = false;
            String op;
            op = input.nextLine();
            while (validInput == false) {
                if (op.equals("+") || op.equals("-") || op.equals("/") || op.equals("*") || op.equals("=") || op.equals("Q")|| op.equals("q")) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input, try again");
                    op = input.nextLine();
                }
            }
            return op;
        }

        public static boolean validFraction (String input) {
            // need to fix to allow single digit input
            if (input.length() == 3) {

                if (input.substring(0, 1).matches("[0123456789]") && input.substring(2).matches("[0123456789]")) {
                    return true;
                } else {
                    return false;
                }
            } else if (input.length() == 1) {

                if (input.matches("[0123456789]")) {
                    return true;
                } else {
                    return false;
                }

                } else {
                    return false;
                }

            }



        public static Fraction getFraction(){
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a fraction (a/b) or integer (a): ");
            String str = input.nextLine();
            boolean validInput = false;

            while (validInput == false) {
                if (validFraction(str)) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input, try again");
                    str = input.nextLine();
                }
            }
            int a = Integer.parseInt(str.substring(0, 1));
            int b;
            if (str.length()<3){
                b = 1;
            } else {
                 b = Integer.parseInt(str.substring(2));
            }
            Fraction newFraction = new Fraction(a, b);
            return newFraction;
        }

        public static void intro () {
            System.out.println("This program is a fraction calculator");
            System.out.println("It will add, subtract, multiply and divide fractions until you type Q to quit");
            System.out.println("Please enter your fractions in the form a/b, where a and b are integers");
            System.out.println("-----------------------------------------------");
        }
/*
    public static int gcd(int num, int den){
        int a = num;
        int b = den;
        int val = Math.min(a,b);
        int cd = 1;
        while(val>0&&cd==1) {
            if ((int)a % val == 0 && (int)b % val == 0) {
                cd = val;
            }
            val--;
        }
        return cd;
    }

    public static int gcd2(int a, int b){
        //testing idea
        while (a!=0 && b!=0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
*/
/*
        public static int gcd ( int a, int b){
            //testing idea
            System.out.println("Running gcd()"); // keep testing here
            while (a != 0 && b != 0) {
                System.out.println("a= " + a + "b=" + b); // keep testing here
                int rem = a % b;
                a = b;
                b = rem;
            }
            return a;
        }
        */
    }



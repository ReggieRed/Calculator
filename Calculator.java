import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        calc.ask();
    }

    public void ask(){
        boolean done = false;
        while(!done) {
            Scanner in = new Scanner(System.in);

            //first term
            System.out.print("Equations follow format of A + B = C.\nPlease enter A (q to quit): ");
            intake = in.next();
            while(!done) {
                try{
                    if ("q".equalsIgnoreCase(intake)) {
                        return;
                    } else{
                        a = Integer.parseInt(intake);
                        done = true;
                    }
                } catch(Exception e){
                    System.out.print("Please enter a valid number: ");
                    intake = in.next();
                }
            }
            done = false;

            //second term
            System.out.print("Please enter B: ");
            intake = in.next();
            while(!done) {
                try {
                    if (intake.equalsIgnoreCase("q")) {
                        return;
                    } else {
                        b = Integer.parseInt(intake);
                        done = true;
                    }
                } catch(Exception e){
                    System.out.print("Please enter a valid number: ");
                    intake = in.next();
                }
            }
            done = false;

            //operator
            System.out.print("Please enter an operator (+/-/*/%): ");
            op = in.next();
            while(!done) {
                if (op.equalsIgnoreCase("q")) {
                    return;
                } else if (op.equals("+")) {
                    c = a + b;
                    System.out.println(a + " + " + b + " = " + c);
                    done = true;
                } else if (op.equals("-")) {
                    c = a - b;
                    System.out.println(a + " - " + b + " = " + c);
                    done = true;
                } else if (op.equals("*")) {
                    c = a * b;
                    System.out.println(a + " * " + b + " = " + c);
                    done = true;
                } else if (op.equals("%")) {
                    c = a / b;
                    System.out.println(a + " % " + b + " = " + c);
                    done = true;
                } else {
                    System.out.print("Please enter a valid operation: ");
                    op = in.next();
                }
            }
            done = false;
        }
        return;
    }

    private int a;
    private int b;
    private int c;
    private String op;
    private String intake;
}

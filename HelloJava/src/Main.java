
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//import java.util.Scanner;
public class Main {

    public void foo() {
        System.out.println("Fooo!!");
    }

    public static void main(String[] args) {
        System.out.println("Hello java" + " !!" + 12.1234);
        // foo(); // Not a good way sometimes
        Main myMain = new Main();
        myMain.foo();
        System.out.println("myMain: " + myMain);
        //Create a Scanner object
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        Double number1 = input.nextDouble();
        System.out.println("number1: " + number1);
        */
        System.out.println(1/2);
        System.out.println((double)1/2);
        System.out.println((double)(1/2));
    }
}
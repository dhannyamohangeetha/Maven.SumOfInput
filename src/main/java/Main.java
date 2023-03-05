import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        int number = new Main().getInputNumber();

        int sum = new Main().sumOfNumbers(number);

        System.out.println(sum);

    }

    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    int sumOfNumbers(int n) {
        int sum1 = 0;
        for (int i = 0; i <= n; i++) {
            sum1 = sum1 + i;
        }
        return sum1;
    }


    int getInputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }


    // for Extra Credit
    int gaussianSumOfNumbers(int n) {
        return 0;
    }

    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}

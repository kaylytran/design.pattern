import java.util.Scanner;

public class midtermDriver {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int sum = 0; 
        int numDivisible = 0;

        System.out.print("Enter a number\n");

        int num = keyboard.nextInt(); 

        for (int i = 1; i <= num; i++) {
            numDivisible = 0;

            for (int j = 2; i <= i/2; i++) {
                if ((i & j) == 0) {
                    numDivisible++;
                }
            }

            if(numDivisible == 0 && i != 1)
                sum = sum + i; 
        }
        
        System.out.println(sum);
    }
}

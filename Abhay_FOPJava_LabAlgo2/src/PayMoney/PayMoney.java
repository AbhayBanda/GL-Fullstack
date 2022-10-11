package PayMoney;

import java.util.Scanner;

public class PayMoney {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of transaction array");

        int size = sc.nextInt();
        int[] transactions = new int[size];

        System.out.println("enter the values of array");

        for(int i = 0; i<size; ++i) {
            transactions[i] = sc.nextInt();
        }

        System.out.println("enter the total no of targets that needs to be achieved");

        int noOfTargets = sc.nextInt();

        for(int i = 0; i<noOfTargets; ++i) {
            System.out.println("enter the value of target");

            int target = sc.nextInt();
            int noOfTransactionsNeeded = findNumberOfTransations(target, transactions);

            if(noOfTransactionsNeeded == 0)
                System.out.println("Given target is not achieved");
            else
                System.out.println(
                        String.format(
                                "Target achieved after %d transactions\n",
                                noOfTransactionsNeeded
                        )
                );
        }
    }

    public static int findNumberOfTransations(int target, int[] transactions) {
        int sum = 0, numberOfTransactions = 0;

        for(int i = 0; i<transactions.length; ++i) {
            sum += transactions[i];
            if(sum >= target) {
                numberOfTransactions++;
                break;
            };
            numberOfTransactions++;
        }
        if(target > sum) return 0;
        return numberOfTransactions <= transactions.length ? numberOfTransactions : 0;
    }
}

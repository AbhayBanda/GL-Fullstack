package MinimumDenomination.main;

import MinimumDenomination.util.MergeSort;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of currency denominations");

        int size = sc.nextInt();
        int[] denominations = new int[size];

        System.out.println("enter the currency denominations value");

        for(int i = 0; i<size; ++i) {
            denominations[i] = sc.nextInt();
        }

        System.out.println("enter the amount you want to pay");

        int targetAmount = sc.nextInt();

        System.out.println("Your payment approach in order to give min no of notes will be");

        printPaymentApproach(denominations, targetAmount);

    }

    public static void printPaymentApproach(int[] denominations, int targetAmount) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(denominations, 0, denominations.length-1);

        int[] denominationCounter = new int[denominations[0] + 1];
        int currentAmount = 0;

        for(int denomimation : denominations) {
            int maxPossibleCurrentDenomination = targetAmount/denomimation;

            if(targetAmount - denomimation*maxPossibleCurrentDenomination >=0) {
                targetAmount -= denomimation*maxPossibleCurrentDenomination;
                denominationCounter[denomimation]= maxPossibleCurrentDenomination;
            }

            if(targetAmount == 0) break;

        }

        for(int i = denominationCounter.length - 1; i>=0; --i) {
            if(denominationCounter[i] != 0) {
                System.out.println(String.format("%d : %d", i, denominationCounter[i]));
            }
        }

    }
}

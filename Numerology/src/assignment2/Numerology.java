package assignment2;

import java.util.Scanner;

/**
 * Created by HARIV on 12/6/2021.
 */
public class Numerology {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the multiDigit number : ");

        int num = sc.nextInt();

        Numerology obj = new Numerology();
        System.out.println("Digit sum is: " + obj.digiSum(num));

        System.out.println("numerlogy no: " + obj.numCal(obj.digiSum(num)));
        obj.digiOddEvenCheck(num);




    }


    int digiSum(int n)

    {
        int digit, sum, dsum = 0;

        while (n > 0) {
            digit = n % 10;
            dsum = dsum + digit;

            n = n / 10;


        }

        return dsum;
    }


    int numCal(int dsum) {
        int sum = 0, digit;
        if (dsum >= 9) {
            while (dsum > 0) {
                digit = dsum % 10;
                sum = sum + digit;
                dsum = dsum / 10;
            }
        } else
            return dsum;

        return digiSum(sum);

    }


    void digiOddEvenCheck(int num)
    {
        int evencount = 0;
        int oddcount = 0, tmp;
        while (num > 0) {
            tmp = num % 10;
            if (tmp % 2 == 0)
                evencount++;
            else
                oddcount++;

            num = num / 10;

        }
        System.out.println("number of even no: " + evencount);
        System.out.println("number of odd no: " + oddcount);
    }

 }




















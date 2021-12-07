package assignment;

import java.util.Scanner;

/**
 * Created by HARIV on 12/6/2021.
 */
public class Account {
    public static void main(String[] args) {

        long accnum;
        double bal, credamt,debtamt;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Account no: ");
        accnum=sc.nextLong();

        System.out.println("Enter the Initial Balance :");
        bal=sc.nextDouble();

        System.out.println("Enter the amount to be deposited :");
        credamt=sc.nextDouble();

        Operation obj=new Operation(accnum,bal);

        obj.credAcc(credamt);

        System.out.println("Enter the withdrwal amount :");
        debtamt=sc.nextDouble();
        obj.debtAcc(debtamt);

        System.out.println("Available bal :"+ obj.getBal());



    }


}
package Assignment3;

import java.util.Scanner;

/**
 * Created by HARIV on 12/6/2021.
 */
public class TypeConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter long type variable: ");
        long l=sc.nextLong();

        System.out.println("Converting long value to int :"+(int)l);


        System.out.println("Enter int type variable");
        int i=sc.nextInt();

        System.out.println("Converting  int value in to  long:"+(long)i );
        System.out.println("Coverting int value in to string:"+String.valueOf(i));
        System.out.println("Converting int type value to double "+ (double)i);


        System.out.println("Enter Double type variable:");
        double d=sc.nextDouble();

        System.out.println("Converting Double type to int :"+(int)d);
        System.out.println("Converting Double type to String: "+ String.valueOf(d));




        System.out.println("Enter boolean value: ");
        boolean b=sc.nextBoolean();

        System.out.println("Convert Boolean to string Value :"+String.valueOf(b));


        System.out.println("Enter String value :");
        String str=sc.next();
        System.out.println("Convert String to double "+Double.parseDouble(str));
        System.out.println("Converting String to int "+Integer.parseInt(str));
        System.out.println("Converting String to boolean "+Boolean.parseBoolean(str));



        //convert primitive data type to wraper object

        System.out.println("enter int value and convert into wraper class Integer :");
        int pi=sc.nextInt();
        System.out.println("converting primitive int in to Interger class object: " +Integer.valueOf(pi));

        System.out.println("enter double value and convert in to object ");

    double pd=sc.nextDouble();

        System.out.println("Converting primitive double in to Double class object "+Double.valueOf(pd));



    }
}
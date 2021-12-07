package assignment;

/**
 * Created by HARIV on 12/6/2021.
 */
public class Operation {
    long accnum;
    double accbal;

    public Operation(long accnum, double accbal) {
        this.accnum = accnum;
        this.accbal = accbal;

    }

    //deposite amount

    public double credAcc(double credamt) {
        return (this.accbal = this.accbal + credamt);


    }

    //withdrawl amount

    public void debtAcc(double debtamt) {
        if (this.accbal - debtamt > 0)
            this.accbal = this.accbal - debtamt;
        else
            System.out.println("Insufficient aammount in account");
            getBal();
    }

// return  available bal
    public double getBal() {
        return this.accbal;
    }

}

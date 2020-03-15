package test;

class ConversionTest {
    public static void main(String[] args) {
        var conversion = new Conversion(9070056, 47.63);
        conversion.weightConversion();
        conversion.dollarConversion();



    }

}

class Conversion {
    int milligrams;
    double dollar;

    // constructor
    public Conversion(int milligrams, double dollar) {
        this.milligrams = milligrams;
        this.dollar = dollar;

    }


    void weightConversion() {
        int remain = 0;
        int kilograms = this.milligrams / 1000000;
        remain = this.milligrams % 1000000;
        int grams = remain / 1000;
        remain = remain % 1000;
        int milligrams = remain;
        System.out.println(this.milligrams + " is equivalent to " +
                kilograms + " kilograms, " +
                grams + " grams, " +
                milligrams + " milligrams.");

    }

    void dollarConversion() {
        int remain = 0;
        int cents = (int) (this.dollar * 100);
        int tenDollar = cents / 1000;
        remain = cents % 1000;
        int fiveDollar = remain / 500;
        remain = remain % 500;
        int oneDollar = remain / 100;
        remain = remain % 100;
        int quarters = remain / 25;
        remain = remain % 25;
        int dimes = remain / 10;
        remain = remain % 10;
        int nickles = remain / 5;
        int pennies = remain;
        System.out.println(tenDollar + " ten dollar bills.");
        System.out.println(fiveDollar + " five dollar bills.");
        System.out.println(oneDollar + " one dollar bills.");
        System.out.println(quarters + " quarters.");
        System.out.println(dimes + " dimes.");
        System.out.println(nickles + " nickles.");
        System.out.println(pennies + " pennies.");

    }

}
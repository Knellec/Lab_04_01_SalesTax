public class Main
{
    public static void main(String[] args)
    {
        // declare variables
        double TAX_RATE = 0.05;
        double purchasePrice = 60.99;
        double salesTax = 0;

        // calculate sales tax
        salesTax = purchasePrice * TAX_RATE;

        // display
        System.out.println("The net cost of your item is " + purchasePrice + ".");
        System.out.println("The tax on your item is " + salesTax + ".");
    }
}
public class Invest {
    public static void main(String[] arguments) {
        float total = 14000;
        System.out.println("Original investment: $" + total);

        //increases by 40 percent the first year total = total + (total * .4F);
        total = total + (total * .4F);
        System.out.println("After one year: $" + total);
        //loses $1,500 the second year total = total - 1500F;
        total = total - 1500F;
        System.out .println("After two year: $" + total);

        //increase by 12 percent the third year total = total + (total * .12F);
        total = total + (total * .12F);
        System.out.println("Afte three year: $" + total);
    }
}
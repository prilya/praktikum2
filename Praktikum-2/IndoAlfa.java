public class IndoAlfa {

    public static void main(String[] args) {

        System.out.println("Program Menghitung Total Penjualan");
        System.out.println("\tBarang yang terjual\t: ");
        System.out.println("Milkies Chocolate\t: 6000x3");
        System.out.println("Mie Sedap Goreng\t: 2300x15");
        System.out.println("Chitato 60gr\t\t: 6500x6");
        System.out.println("Tissue Paseo\t\t: 8000x4");
        System.out.println("lays 60gr\t\t\t: 7500x5");
        
        //implisit
        int milkieschocolate = 3;
        float m = milkieschocolate;
        
        int sedapgoreng = 15;
        float s = sedapgoreng;
        
        int chitato = 6;
        float c = chitato;
        
        int tissue = 4;
        float t = tissue;
        
        int lays = 5;
        float l = lays;

        //eksplisit
        double uang = 200000;
        float ug = (float) uang;

        /*System.out.println("\nMasukkan jumlah barang yang terjual\t");
        System.out.println("Milkies Chocolate\t:");
        m = keyboard.nextInt();
        System.out.println("Mie Sedap Goreng\t:");
        s = keyboard.nextInt();
        System.out.println("Chitato 60gr\t:");
        c = keyboard.nextInt();
        System.out.println("Tissue Paseo\t:");
        t = keyboard.nextInt();
        System.out.println("lays 60gr\t:");
        l = keyboard.nextInt();
        */
        
        float b = (m*6000F)+(s*2300F)+(c*6500F)+(t*8000F)+(l*7500F);
        System.out.println("\nTotal penjualan Sebesar\t: "+b);

        System.out.println("\nUang yang dibayarkan\t: "+ug);

        float kembalian = ug-b;
        System.out.println("Kembaliannya sebesar\t: "+kembalian);
    }
}
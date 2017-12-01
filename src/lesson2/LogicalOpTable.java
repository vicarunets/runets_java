package lesson2;

public class LogicalOpTable {
    public static void main(String[] args) {
        int p, q;
        int p1 = 0;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        p = 1; q = 1;
        if(p==0)p1=1;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p ^q) + "\t" + p1);
        p = 1; q = 0;
        if(p==0)p1=1;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + p1);
        p = 0; q = 1;
        if(p==0)p1=1;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println( (p^q) + "\t" + p1);
        p = 0; q = 0;
        if(p==0)p1=1;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + p1);
    }
}

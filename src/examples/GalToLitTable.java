package examples;

public class GalToLitTable {
    public static void main(String[] args) {
        double gallons,liters;
        int counter=0;
        for (gallons=1;gallons<=100;gallons++) {
            liters=gallons*3.7854;
            System.out.println(gallons+" галлонам соответствует "+liters+" литра");
            counter++;
            if (counter==10){
                System.out.println();
                counter=0;
            }
        }

    }
}

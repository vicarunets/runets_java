package lesson1.examples;

public class InchToMeterTable {
    public static void main(String[] args) {
    double inch,meter;
    int counter=0;
        for (inch=1;inch<=144;inch++) {
            meter = inch / 39.37;
            System.out.println(inch + " дюймам соответствует " + meter + " метра");
            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}

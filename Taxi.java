public class Taxi {
    double typeMultiplier;
    String taxiColor;
    String driverName;

    public double addJourney(double type, double milesDriven, double tipPercent) {
        tipPercent = 15.0D;
        double tipDecimal = tipPercent / 100.0D;
        double subtotal = this.typeMultiplier * milesDriven;
        double total = subtotal + subtotal * tipDecimal;
        return total;
    }

    public Taxi(double type, String color, String driver) {
        this.typeMultiplier = type;
        this.taxiColor = color;
        this.driverName = driver;
    }

    public static void main(String[] args) {
        Taxi YE167PE = new Taxi(1.0D, "black", "dom");
        Taxi AE127BD = new Taxi(1.4D, "blue", "gary");
        System.out.println(YE167PE.typeMultiplier);
        System.out.println(AE127BD.driverName);
        System.out.println(AE127BD.addJourney(1.0D, 3.1D, 15.0D));

        System.out.println(" Your total: " + YE167PE.addJourney(1.0, 3.2, 7.5));
    }
}

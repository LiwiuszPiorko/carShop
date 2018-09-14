public class CarShop2 {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "M5", 2007, 2.6); //marka, model, rocznik, pojemność silnika
        Car car2=new Car("Opel", "Vectra", 2004,1.8);

    String br="BMW";
    String mo="M5";

    System.out.println("Samochód 1:");
    System.out.printf("Marka: %S, Model: %S, Rocznik: %s, Pojemność silnika: %s",br, mo, 2007, 2.6);

    String br2="Opel";
    String mo2="Vectra";

    System.out.println("\nSamochód 2:");
    System.out.printf("Marka: %S, Model: %S, Rocznik: %s, Pojemność silnika: %s", br2, mo2, 2004, 1.8);
    }
}


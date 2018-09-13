public class carShop2 {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "M5", 2007, 2.6); //marka, model, rocznik, pojemność silnika
        Car car2=new Car("Opel", "Vectra", 2004,1.8);

    String Br="BMW";
    String Mo="M5";




        System.out.println("Samochód 1:");
        System.out.printf("Marka: %S, Model: %S, Rocznik: %s, Pojemność silnika: %s",Br, Mo, 2007, 2.6);

        String Br2="Opel";
        String Mo2="Vectra";


        System.out.println("\nSamochód 2:");
        System.out.printf("Marka: %S, Model: %S, Rocznik: %s, Pojemność silnika: %s", Br2, Mo2, 2004, 1.8);
    }
}


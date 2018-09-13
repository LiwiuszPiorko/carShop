public class carShop2 {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "M5", 2007, 2.6); //marka, model, rocznik, pojemność silnika
        Car car2=new Car("Opel", "Vectra", 2004,1.8);

        System.out.println("Samochód 1:");
        System.out.println("Marka: " + car1.Brand + ", model: " + car1.Model +
                ", rocznik: " + car1.Year + ", pojemność: " + car1.Capacity);
        System.out.println("Samochód 2:");
        System.out.println("Marka: " + car2.Brand + ", model: " + car2.Model +
                ", rocznik: " + car2.Year + ", pojemność: " + car2.Capacity);
    }
}


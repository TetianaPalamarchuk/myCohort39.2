package car;

public class CarDemo {
    public static void main(String[] args) {
        SedanCar sedanCar1 = new SedanCar("Volvo", 50);
        SedanCar sedanCar2 = new SedanCar("BMW", 80);

        SportCar sportCar1 = new SportCar("Ferrary", 120);

        TruckCar truck = new TruckCar("MAN", 40);

        Car[] cars = {sedanCar1, sedanCar2, sportCar1, truck};

        for (int i = 0; i < cars.length; i++) {
            cars[i].speedUp();
        }

    }


}

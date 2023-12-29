package car;

public class TruckCar extends Car{
    public TruckCar(String model, Integer speed) {
        super(model, speed);
    }

    @Override
    void speedUp() {
        System.out.println("Our Truck " + getModel() + " speedUp!");
        setSpeed(getSpeed() + 3);
        System.out.println("Текущая скорость: " + getSpeed());
    }}

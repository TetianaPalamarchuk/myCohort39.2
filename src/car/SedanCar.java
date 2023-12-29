package car;

public class SedanCar extends Car{


    public SedanCar(String model, Integer speed) {
        super(model, speed);
    }

    @Override
    void speedUp() {
        System.out.println("Sedan " + getModel() + " speedUp!");
        setSpeed(getSpeed() + 10);
        System.out.println("Текущая скорость: " + getSpeed());

    }

}

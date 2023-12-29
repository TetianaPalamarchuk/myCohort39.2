package car;
/*
Реализовать модель, которая описывает автомобили следующих типов: седан, спортивный автомобиль и грузовик.
Все автомобили умеют ускорятся (вывести сообщение, или увеличить значение текущей скорости авто ...)

Необходимо создать несколько автомобилей
и у всех вызвать "ускорение"
 */


abstract class Car {
    private String model;
    private Integer speed;

    public Car(String model, Integer speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    abstract void speedUp();

}

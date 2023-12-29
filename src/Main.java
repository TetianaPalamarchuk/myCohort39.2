class Animal {
    void eat() {
        System.out.println("I am eat");
    }
    void sleep() {
        System.out.println("I am sleep");
    }
}
// дочерний класс, следующий от Animal
class Dog extends Animal {
    void bark(){
        System.out.println("the dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        // создаем экземпляр класса Dog
        Dog myDog = new Dog();
        // вызываем методы как из родительского, так и из дочернего класса
        myDog.eat();
        myDog.sleep();
        myDog.bark();

    }
}
/* в этом примере класса Gog наследует методы eat и sleep от родительского класса Animal. Кроме того у класса Dog есть
 свой собственный метод bark В методе main создается объект класса Dog и вызываются различные методы из обоих классов
*/
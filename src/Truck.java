public class Truck extends Car {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}

// Наследование позволяет создать новый класс на основе существующего, расширяя или переопределяя его функциональность.
// В этом коде класс Truck наследует класс Car. Это означает, что Truck получает все функции и поля класса Car,
// а также может добавлять или переопределять их. В данном случае класс Truck расширяет функционал класса Car, добавляя новый метод checkTrailer().
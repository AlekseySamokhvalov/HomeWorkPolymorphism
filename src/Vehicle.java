public interface Vehicle {
    String getModelName();
    int getWheelsCount();
    void updateTyre();
}
// Полиморфизм позволяет использовать объекты разных классов с общим интерфейсом.
// В данном случае, интерфейс Vehicle определяет общий набор методов (getModelName(), getWheelsCount() и updateTyre()),
// который должен поддерживать каждый Vehicle. Класс ServiceStation использует метод check(),
// который принимает объект интерфейса Vehicle и вызывает его методы, не заботясь о конкретном классе объекта.
// Это позволяет использовать check() для обслуживания различных видов транспортных средств, таких как Car, Truck и Bicycle.
public class ServiceStation {
    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
//        if (vehicle instanceof EnginePoweredVehicle) {
//            ((EnginePoweredVehicle) vehicle).checkEngine();
//        }
//        if (vehicle instanceof Truck) {
//            ((Truck) vehicle).checkTrailer();
//        }
        // откомментировать для реализации второго интерфейса
    }

    public void check(Car car) {
        check((Vehicle) car);
        car.checkEngine();
    }

    public void check(Truck truck) {
        check((Car) truck);
        truck.checkTrailer();
    }
//  Здесь я добавил два новых перегруженных метода check для обслуживания объектов Car и Truck.
//  В методе check(Car car), я вызываю метод check для супертипа Vehicle, чтобы обработать общие части обслуживания,
//  затем вызываю метод checkEngine для специфических задач Car.
//  Принцип аналогичен для метода check(Truck truck) с вызовом специфического метода checkTrailer.
//  Таким образом, при вызове метода check с объектами разных классов, будут автоматически выбираться соответствующие перегруженные методы.

}


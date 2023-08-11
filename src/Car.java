public class Car implements Vehicle,  EnginePoweredVehicle{
    private String modelName;
    private int wheelsCount;

    public Car(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
// Инкапсуляция заключается в объединении данных и методов работы с этими данными внутри объекта и скрытии деталей реализации от внешних вызовов.
// В этом коде инкапсуляция реализована через использование приватных полей (private String modelName и private int wheelsCount в классах Car и Bicycle)
// и предоставление публичных методов для доступа к этим данным (getModelName() и getWheelsCount()).
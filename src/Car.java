import java.util.Objects;

public class Car {
     String logo;
     String model;
     double engineСapacity;
     int yearOfManufacture;

    @Override
    public String toString() {
        return "Car{" +
                "logo='" + logo + '\'' +
                ", model='" + model + '\'' +
                ", engineСapacity=" + engineСapacity +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }

    public Car(String logo, String model, double engineСapacity, int yearOfManufacture) {
        this.logo = logo;
        this.model = model;
        this.engineСapacity = engineСapacity;
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfManufacture == car.yearOfManufacture && model.equals(car.model);
    }
}

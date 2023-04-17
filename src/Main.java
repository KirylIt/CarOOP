public class Main{

    public static void main(String[] args) {
        //Условие задачи
        //Создать класс «машина» с полями: марка, модель, объём двигателя и год выпуска.
        //Переопределить метод equals, который определяет по модели и году выпуска эквивалентны ли две машины.

        Car car = new Car("Audi","a6",2.5,2000);
        Car car1 = new Car("Audi","a6",2.5,2001);

        if (car.equals(car1)){
            System.out.println("Car compare");
            System.out.println(car.toString());
            System.out.println(car1.toString());
        }else {
            System.out.println("Car not compare");
            System.out.println(car.toString());
            System.out.println(car1.toString());
        }
   }
}
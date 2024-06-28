import builders.CarBuilder;
import builders.CarManualBuilder;
import builders.Manual;
import cars.Car;
import director.Director;

public class BuildDemo {
    public static void main(String[] args) {
        Director director = new Director();


        // 특정 제품을 얻기 위한 빌더입니다.
        CarBuilder builder = new CarBuilder();
        director.constructCityCar(builder);

        //최종 제품은 종종 빌더 객체에서 검색됩니다.
        // Director는 구체적인 건축업자와 제품을 인식하지 못하고 의존하지 않습니다.

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();


        // Director는 여러 가지 건축법을 알고 있을 수도 있습니다.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

    }
}
package javaBasics.OOPS.InterFaces;

public class Main {
    public static void main(String[] args) {

        Car car=new Car();
        car.brake();
        car.acc();
        car.start();
        car.stop();

        Engine car1=new Car();
        //car1.a;
        //it can not access a because it depends on the left hand side i.e Engine interface
    }
}

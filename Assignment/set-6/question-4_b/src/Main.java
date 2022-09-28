public class Main {
    public static void service(Object o){
        if(o instanceof ElectricCar){
            System.out.println("Electric car need servicing");
        } else if (o instanceof FuelCar) {
            System.out.println("Fuel car need servicing");
        }
    }
    public static void main(String[] args) {
        FuelCar fc=new FuelCar();
        ElectricCar ec=new ElectricCar();
        fc.run();
        ec.run();
        service(fc);
        service(ec);


    }
}
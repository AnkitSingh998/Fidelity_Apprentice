
    public class ParkingLotSystem{
        public static void main(String[] args) {
            Car car=new Car("KA01AB124","Honda",5);
            Motorcycle motorcycle=new Motorcycle("KA01AB774","Yamaha","V-TWIN");
            System.out.println("Car parking fee" + car.calculateParkingFee());
            System.out.println("Motorcycle parking fee" + motorcycle.calculateParkingFee());
        }
    }


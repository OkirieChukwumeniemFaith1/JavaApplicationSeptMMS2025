package classwork2;
public class AllVehicles {
    public static void main(String[] args){ 
        Vehicle[] VehicleObject = { 
            new Car(),
            new Bike(),
            new Bus()
        };
        for(Vehicle vehicle : VehicleObject){ 
            vehicle.move();
        
        }
    }
}

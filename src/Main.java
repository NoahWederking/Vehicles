import java.util.ArrayList;

public class Main {
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    Car c = new Car("Aston");
    Plane p = new Plane("Boeing Boy");
    Ship s = new Ship("Mega Ship");

    public void addVehicles(){
        vehicles.add(c);
        vehicles.add(p);
        vehicles.add(s);
    }
    public void arrayListRealisation() {
        for (int i = 0; i < vehicles.size(); i++){
            Vehicle v = vehicles.get(i);
            System.out.println(v);
            if(v instanceof Car){
                ((Car) v).drive();
            } else if (v instanceof Plane){
                ((Plane) v ).fly();
            } else if (v instanceof Ship){
                ((Ship) v).sail();
            }
        }
    }
    public void run(){
        addVehicles();
        arrayListRealisation();

        c.isStarted(true);
        c.moveForward();
        p.isStarted(false);
        p.moveForward();


    }
    public static void main(String[]args){
        new Main().run();
    }
}

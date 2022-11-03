public class Vehicle {

    private String name;
    private boolean isStarted;

    public Vehicle(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void isStarted(boolean isStarted){
        this.isStarted = isStarted;
        if (isStarted == false){
            System.out.println(name + " engine is off");
        } else System.out.println(name + " engine is running");
    }
    public boolean isStarted(){
        return isStarted;
    }

    public void moveForward(){
        if (isStarted != true){
            System.out.println(name + " engine is not running");
        }else {
            System.out.println(name + " is moving forward");
        }
    }



    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Lamp{
    //Atrybuty:
    
    int isOn;
    String status;
    
    //Metody:
    
    public void turnOn(){
        isOn = 1;
    }
    public void turnOff(){
        isOn = 0;
    }
    public void showStatus(){
        if (isOn != 0){ 
            System.out.println("Lamp is on");
        }else{
            System.out.println("Lamp is off");
        }
    }
    public static void main(String[] args){
        Lamp l1 = new Lamp();
        Lamp l2 = new Lamp();
        l1.isOn = 0;
        l2.isOn = 0;
        l1.turnOn();
        l2.turnOff();
        l1.showStatus();
        l2.showStatus();
    }
}
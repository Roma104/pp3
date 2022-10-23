public class Smartphone{
    //Atrybuty:
    
    String mark;
    double version;
    String color;
    int numberOfAplications;
    boolean isWorking;
    
    //Metody:
    
    public void presentModel(){
        System.out.println(mark + version + " " + color);
    }
    public void showNumberOfAplication(){
        System.out.println(numberOfAplications + "aplications in your phone");
    }
    public void isItWorking(){
        isWorking=!isWorking;
        System.out.println("Status: "+isWorking);
    }
    public static void main(String[] args){
        Smartphone s1 = new Smartphone();
        s1.mark = "Samsung";
        s1.version = 5.04;
        s1.color = "black";
        s1.numberOfAplications = 32;
        s1.isWorking = true;
        s1.presentModel();
        s1.showNumberOfAplication();
        s1.isItWorking();
    }
}
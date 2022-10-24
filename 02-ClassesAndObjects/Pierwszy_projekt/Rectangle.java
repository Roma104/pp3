public class Rectangle{
    //Atrybuty:
    
    int a;
    int b;
    int ab;
    
    //Metody:

    public void calculate(){
        ab = a*b;
    }
    public void showCalculations(){
        System.out.println("a = " + a +" b = " + b + " ab = " + ab);
    }
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.a = 3;
        r1.b = 4;
        r2.a = 2;
        r2.b = 7;
        r1.calculate();
        r2.calculate();
        r1.showCalculations();
        r2.showCalculations();
    }

}
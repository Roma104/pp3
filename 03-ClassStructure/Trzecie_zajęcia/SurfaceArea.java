public class SurfaceArea{
    //Atrybuty:
    static double pi = 3.14;
    
    
    //Metody:
    public static double  circle(double rad){
        return rad * rad * pi;
    }
    public static double rectangle(double a,double b){
        return a*b;
    }
    public static double triangle(double a,double b){
        return a*b/2.0;
    }
    public static void main(String[] arg){
        System.out.println(circle(6));
        System.out.println(rectangle(6,6));
        System.out.println(triangle(6,6));
    }
}
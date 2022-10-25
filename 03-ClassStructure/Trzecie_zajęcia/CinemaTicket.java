public class CinemaTicket{
    //Atrybuty:
    static String cinemaName = "Morning Star Cinema";
    String filmTitle;
    int row;
    String seat;
    double price;
    
    //Metody:
    
    public void displayTicket(){
        System.out.println("Cinema: " +cinemaName+ "\n" +"Film Title: " +filmTitle+ "\n" + "Row: " +row+ 
        " Seat: " +seat+ "\n" +"Price: "+ price + " zł");
    }
    
    public double calculatePrice(){
        if(row<=2){
            price = 10;
        }else{
            price = 25;
        }
        return price;
    }
    
    public static void main(String[] args){
        CinemaTicket c1 = new CinemaTicket("Nezha Reborn",7,"6");
        CinemaTicket c2 = new CinemaTicket("Nezha Reborn",2,"6");
        c1.displayTicket();
        c2.displayTicket();
    }
    
    public CinemaTicket(String film, int r, String s){
        filmTitle = film;
        row = r;
        seat = s;
        price = calculatePrice();
    }
}
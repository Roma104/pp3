public class Book{

    //Atrybuty:
    String title;
    int page;
    int wordcount;
    String author;
    String ganre;
    
    //Metody:
    
    public void showBasics(){
        System.out.println("Title: " + title + " Author: " + author + " Ganre: " + ganre);
    }
    public void showMore(){
        System.out.println("Title: " + title + " Author: " + author + " Ganre: " + ganre + " Pages: "+ page);
    }
    public void showDetails(){
        System.out.println("Title: " + title + " Author: " + author + " Ganre: " + ganre + " Pages: "+ page + " Wordcount: "+ wordcount);
    }
    public static void main(String[] args){
        Book b1 = new Book();
        b1.title = "Zatracenie";
        b1.page = 176;
        b1.wordcount = 52624;
        b1.author = "Dazai Osamu";
        b1.ganre = "Psychologiczne";
        b1.showBasics();
        b1.showMore();
        b1.showDetails();
    }

}
public class BankAccount{
    //Atrybuty:
    
    String name;
    int numberOfMoney;
    int age;
    String gender;
    boolean isActive;
    
    //Metody:

    public void showOwner(){
        System.out.println("Name: " + name + " Age: " + age +
        " Gender: "+ gender);
    }
    public void showContent(){
        System.out.println("You have " + numberOfMoney + " zł on your account.");
    }
    public void isItActive(){
        isActive = !isActive;
    }
    public void showActive(){
        System.out.println("Active: " + isActive);
    }
    public static void main(String[] args){
        BankAccount b1 = new BankAccount();
        b1.name = "Mei";
        b1.age = 21;
        b1.gender = "female";
        b1.numberOfMoney = 939429266;
        b1.isActive = false;
        b1.showOwner();
        b1.showContent();
        b1.isItActive();
        b1.showActive();
    } 
}
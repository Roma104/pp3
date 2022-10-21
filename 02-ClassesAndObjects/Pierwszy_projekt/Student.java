public class Student{
    //Atrybuty:
    
    String name;
    int age;
    String ID;
    boolean isValid;
    int semester;
    double averageGrade;
    
    //Zachowania(metody):
    
    public void sayHello(){
        System.out.println("Hey-ya bud!");
    }
    public void displayName(){ 
        System.out.println("My name is " + name);
    }
    public void displayAge(){
        System.out.println("I'm " + age + " years old.");
    }
    public void displayStudent(){
        System.out.println("I'm " + name + " I'm on my " + semester + " semester and mine average grade is " + averageGrade + "." );
    }
    public void changeIDStatus(){
        isValid = !isValid;
    }
    public void showStudentStatus(){
        System.out.println("Name: " + name + " ID: " + ID + " is valid: " + isValid);
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Sun Wukong";
        s1.age = 5000;
        s1.ID = "123456";
        s1.isValid = true;
        s1.semester = 3;
        s1.averageGrade = 4.5;
        s1.sayHello();
        s1.displayName();
        s1.changeIDStatus();
        s1.displayStudent();
        s1.showStudentStatus();
        Student s2 = new Student();
        s2.age = 4000;
        s2.name = "Liu'Er Mihou";
        s2.ID = "654321";
        s2.isValid = false;
        s2.semester = 3;
        s2.averageGrade = 5.5;
        s2.sayHello();
        s2.displayName();
        s2.changeIDStatus();
        s2.displayStudent();
        s2.showStudentStatus();
    }    
}
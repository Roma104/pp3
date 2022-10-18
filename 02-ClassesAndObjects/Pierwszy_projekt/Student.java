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
        System.out.println("I'm " + name + "I'm on" + semester + "I have" + averageGrade);
    }
    public void changeIDStatus(){
        isValid = !isValid;
    }
    public void showStudentStatus(){
        System.out.println(name + ID + isValid);
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
        s1.showStudentStatus();
    }    
}
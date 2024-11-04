import java.util.jar.Attributes;
public class Father {
    private String Name;
    private int Age;

    public Father(String name, int age) {
        this.Name = name;
        this.Age = age;
    }
    public void displayFDetails() {
        System.out.println("name: " + Name + ",age: " + Age);
    }
    public final void displayMessage() {
        System.out.println("The final method of the parent class.");
    }
}

class son extends Father{
    private String nickname;
    public son(String name, int age, String nickname) {
        super(name, age);
        this.nickname = nickname;
    }
    @Override
    public void displayFDetails() {
        super.displayFDetails();
        System.out.println("Nickname: "+nickname);
    }
}

class Daughter extends Father{
    private String Color;
    public Daughter(String name, int age, String color) {
        super(name, age);
        this.Color = color;
    }
    @Override
    public void displayFDetails() {
        super.displayFDetails();
        System.out.println("color is: "+ Color);
    }
}


class TYpeChecker {
    public void identifyObjectType(Father obj){
        if (obj instanceof son) {
            System.out.println(" the object type is instance of son");
        } else if (obj instanceof Daughter) {
            System.out.println("the object type is instance of Daughter");
        }
        else {
            System.out.println("The object is instance of Father");
        }
    }
}


class main {
    public static void main(String[] args) {

        son Son = new son("ali",44,"aliyow");
        Daughter dau = new Daughter("amina", 37,"white");

        System.out.println("details of son object");
        Son.displayFDetails();
        Son.displayMessage();

        System.out.println("details of daughter object");
        dau.displayFDetails();
        dau.displayMessage();

        TYpeChecker typeCh = new TYpeChecker();
        System.out.println("type is checking");
        typeCh.identifyObjectType(Son);
        typeCh.identifyObjectType(dau);

    }
}





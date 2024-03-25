package InheritanceJava;

public class Animal {

    protected String name;
    protected String dob;
    protected double weight;
    protected double height;

    Animal(){

    }

    Animal(String name, String dob, double weight, double height){
        this.name = name;
        this.dob = dob;
        this.weight = weight;
        this.height = height;
    }

    void eat(){
        System.out.println("...Animal eating..");
    }

    void move(){
        System.out.println("..animal moving..");
    }
}

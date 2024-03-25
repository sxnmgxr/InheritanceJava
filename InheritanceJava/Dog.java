package InheritanceJava;


public class Dog extends Animal{
    @SuppressWarnings("unused")
    private String breed;

    Dog(){

    }
    Dog(String name, String dob, double weight, double height, String breed){
        super(name, dob, weight, height);
        this.breed = breed;
    }

    void bark(){
        System.out.println("..dog barking..");
    }

    void eat()
    {
        System.out.println("..dog eating..");
    }

    void move(){
        System.out.println("..dog moving..");
    }
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.eat();

        Animal dog1 = new Dog("kanxi", "21/04/2023", 15.45, 23.5, "tiger");
        dog1.move();
    }

}

package InheritanceJava;

public class Cat extends Animal{
private String breed;
private int amount;

Cat(){

}

Cat(String name, String dob, double weight, double height, String breed, int amount){
    super(name, dob, weight, height);
    this.breed = breed;
    this.amount = amount;

}

public String getBreed()
{
    return breed;
}

public void  setBreed(String breed)
{
    this.breed = breed;
}


}
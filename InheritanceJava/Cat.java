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

public int getAmount()
{
    return amount;
}

public void setAmount(int amount)
{
    this.amount = amount;
}


public static void main(String[] args) {
    Cat cat = new Cat();
    Cat cat1 = new Cat("Kitty", "12/05/2024", 56.6, 78.2, "lion", 12000); 
}
}
package animal;
public class Animal {
    private String name;
    private int numberOfLegs;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
    public Animal() {
    }
    public Animal(String name, int numberOfLegs) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
    }
    public void move() {
        System.out.println("I am moving");
    }
    public void eat() {
        System.out.println("I want to eat");
    }
    public void eat(String food) {
        System.out.println("I am eating " + food);
    }
}

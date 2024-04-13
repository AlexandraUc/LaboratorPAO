package animal;

public class Bird extends Animal {
    private String colour;
    public Bird(String name, int numberOfLegs, String colour) {
        super(name, numberOfLegs);
        this.colour = colour;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void sing() {
        System.out.println("I can chirp");
    }
    @Override
    public void move() {
        System.out.println("I am flying");
    }
}

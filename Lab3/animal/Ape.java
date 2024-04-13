package animal;

public class Ape extends Animal {
    private String size;
    public Ape(String name, int numberOfLegs, String size) {
        super(name, numberOfLegs);
        this.size = size;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    @Override
    public void move() {
        System.out.println("I can jump");
    }
}

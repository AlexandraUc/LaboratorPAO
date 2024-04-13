package animal;

import java.util.Objects;

public class Duck extends Bird {
    private int length;
    public Duck(String name, int numberOfLegs, String colour, int length) {
        super(name, numberOfLegs, colour);
        this.length = length;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    @Override
    public void move() {
        System.out.println("I can swim");
    }
    @Override
    public void sing() {
        System.out.println("I can quack");
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj == null) {
            return false;
        }

        if(getClass() != obj.getClass()) {
            return false;
        }

        Duck duck = (Duck)obj;

        return this.getLength() == duck.getLength()
                && Objects.equals(this.getName(), duck.getName())
                && Objects.equals(this.getColour(), duck.getColour())
                && this.getNumberOfLegs() == duck.getNumberOfLegs();
    }
    @Override
    public int hashCode() {
        return Objects.hash(length, getName(), getColour(), getNumberOfLegs());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

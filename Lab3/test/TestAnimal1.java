package test;

import animal.Animal;

public class TestAnimal1 {
    public static void main(String[] args) {
        Animal a = new Animal();

        a.move();
        a.eat();
        a.eat("leaves");
    }
}

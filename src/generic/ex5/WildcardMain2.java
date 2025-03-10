package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포함.
        writeBox(objBox);
        writeBox(animalBox);
//        writeBox(dogBox);
//        writeBox(catBox);

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);
    }

    // super 하한 animal 이상 wildcard에만 사용가능.
    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}

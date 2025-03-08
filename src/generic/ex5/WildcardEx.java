package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    //Box<Dog>, Box<Cat>, Box<Object> ?는 아무거나 다들어올수 있다.
    static void printWildcardV1(Box<?> box) {
        System.out.println("? : " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("t.getName() = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("t.getName() = " + animal.getName());
    }

    static <T extends Animal> T printANdReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());

        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());

        return animal;
    }
}

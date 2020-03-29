package B21_ArrayHoldingManyObjects;

public class Main {
    public static void main(String[] args) {

        AnimalList dLo = new AnimalList();
        Dog d = new Dog();
        Fish f = new Fish();

        dLo.add(d);
        dLo.add(f);

    }
}

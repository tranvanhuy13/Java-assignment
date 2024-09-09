public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
//invoke method overriding
        System.out.println("Origin: " +
                animal.origin);
    }
}
public class Mammal extends Animal {
    private int speed;

    public Mammal(String name, String animalSpecial, int age) {
        super(name, animalSpecial, age);
    }

    @Override
    public void show() {
        System.out.println("name: "+ name + ", age: " + age + "speed: " + speed + ", \"" + animalSpecial + "\"");
    }
}
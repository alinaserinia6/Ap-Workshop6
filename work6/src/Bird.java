public class Bird extends Animal{
    private int heigh;


    public Bird(String name, String animalSpecial, int age) {
        super(name, animalSpecial, age);
    }

    @Override
    public void show() {
        System.out.println("name: "+ name + ", age: " + age + "height of fly: " + heigh + ", \"" + animalSpecial + "\"");
    }
}

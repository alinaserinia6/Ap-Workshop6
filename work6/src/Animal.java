public abstract class Animal {
    protected String name;
    protected String animalSpecial;
    protected int age;

    public Animal(String name, String animalSpecial, int age) {
        this.name = name;
        this.animalSpecial = animalSpecial;
        this.age = age;
    }

    public abstract void show();

//    public static void main(String[] args) throws Exception {
//
//    }

}

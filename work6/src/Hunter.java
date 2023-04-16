public interface Hunter {
    public String getName();
    default void hunt(Prey prey) {
        String thisName = getName();
        String preyName = prey.getName();
        System.out.println(thisName + " hunted " + preyName);
    }

}

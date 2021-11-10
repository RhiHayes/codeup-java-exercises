public class Animal {

    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    @Override //converts garbled array items to strings, USE THIS!!!
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String roar() {
        String myRoar = "I am a " + this.name + ", HEAR ME ROAR!!!";
        return myRoar;

    }

    public static void main(String[] args) {

        Animal lion = new Animal("Lion", "Mammal");
        Animal frog = new Animal("Frog", "Amphibian");

        System.out.println(lion.roar());
        System.out.println(frog.roar());


    }


}

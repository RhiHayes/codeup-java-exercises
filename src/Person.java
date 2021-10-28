public class Person {

    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        //TODO: return the person's name
        return name;
    }

    public void setName(String name){
        //TODO: change the name property to the passed value
        this.name = name;
    }

    public void sayHello(){
        //TODO: print a message to the console using the person's name
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {

        Person rhiannon = new Person("Rhiannon");

        rhiannon.sayHello();
        rhiannon.setName("Kimi");
        rhiannon.sayHello();

        //COPIED AND PASTED CODE

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //returns true
//        System.out.println(person1 == person2); //returns false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); //returns true

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); //John
//        System.out.println(person2.getName()); //John
//        person2.setName("Jane");
//        System.out.println(person1.getName()); //Jane
//        System.out.println(person2.getName()); //Jane


    }


}

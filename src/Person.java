public class Person {

    //A class: This is the template or a blueprint for a 'PERSON'

    //instance variables
    public String firstName;
    public String lastName;
    public int age;

    //instance method

    public String joinChat() {
        return lastName + " , " + firstName + " has entered the chat!";
    }

    //make a static property - representing the world population

    public static long worldPop = 7_903_000_000L;


    public static void main(String[] args) {
        Person rhi = new Person();

        rhi.firstName = "Rhiannon";
        rhi.lastName = "Hayes";

        System.out.println("Rhi First Name = " + rhi.firstName);
        System.out.println("Rhi Last Name = " + rhi.lastName);

        System.out.println(rhi.joinChat());

        System.out.println("World pop = " + worldPop);

        Person douglas = new Person();
        douglas.firstName = "Douglas";
        douglas.lastName = "Hirsh";

        //Douglas didn't get counted in the worldPop :0 how would I add him
        // into our count?


        System.out.println("World pop with Douglas :D = " + worldPop);
        System.out.println(douglas.worldPop); // this WILL run, but it is NOT PROPER CODE

        //Can we...talk to Person.firstName

//        System.out.println(Person.firstName); //CITE - no going forward until we fix this







    }


}

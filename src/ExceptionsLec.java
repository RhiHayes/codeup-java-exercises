public class ExceptionsLec {


    public static void main(String[] args) throws Exception {

        System.out.println("Hello world");

//        try {
//            throw new Exception("Hey, something bad happened.");
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }

        //A deeper example: with try catch

        try {
            System.out.println("Let me see if I can divide by zero.");
            int result = 1 / 0;
            System.out.println("I did it! Math is now MINE!");
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }


       //An even deeper example - a bigger try catch


//
//        try {
//            throw new Exception("Something went wrong\n ERROR!");
//        }
//        catch (NullPointerException e) {
//            e.printStackTrace();
//            e.getMessage();
//        }
//        catch (RuntimeException e) {
//            System.out.println("RuntimeException fired!");
//            e.printStackTrace();
//            e.getMessage();
//        }
//        catch (Exception e) {
//            System.out.println("Generic exception fired.");
//            e.printStackTrace();
//            e.getMessage();
//        }
//        finally {
//            System.out.println("This will always run.");
//        }



        //Final example: let's trigger an array out of bounds and deal with it
         //programmatically.

        try {
            String[] days = {"Monday", "Tuesday"};
            System.out.println(days[2]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Most specific");
            e.printStackTrace();
            e.getMessage();
        } catch (RuntimeException e) {
            System.out.println("Sort of specific");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Least specific");
            e.printStackTrace();
        }



    }


}

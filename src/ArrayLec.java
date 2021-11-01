import java.util.Arrays;

public class ArrayLec {


public static void main(String[] args) {

    double[] prices = new double[4];
    final int numberOfSides = 6;

    int[] diceSides = new int[numberOfSides];



    System.out.println("prices.length = " + prices.length);
    System.out.println("diceSides.length = " + diceSides.length);


    String[] mybag = {"Snickers", "Reeses", "Brussel Sprouts"};

    System.out.println("mybag.length =  " + mybag.length);
    System.out.println("mybag[1] =  " + mybag[1]);


    for (int i = 0; i < mybag.length; i++) {
        System.out.println(mybag[i]);
    }

    for(String candy : mybag) {
        System.out.println(candy);
    }



    String[] anotherbag = new String[12];

    System.out.println(anotherbag[0]);
    System.out.println(anotherbag[5]);

    Arrays.fill(anotherbag, "snickers");

    for(String candy : anotherbag) {
        System.out.println(candy);
    }


    String[] mybagplustwo = Arrays.copyOf(mybag, 5);
    System.out.println("mybag.length" + mybag.length);
    System.out.println("mybag.length" + mybagplustwo.length);

    for (String candy: mybagplustwo) {
        System.out.println(candy);
    }


}



}

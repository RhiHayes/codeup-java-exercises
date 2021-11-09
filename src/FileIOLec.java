import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class FileIOLec {

    public static void main(String[] args) throws IOException {

        //Let's make some new stuff- CREATING files and directories in JAVA

        String directory = "./src/data";
        String filename = "groceryList.txt";
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        System.out.println(dataFile);


        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (Files.notExists(dataFile)) {
            Files.createFile(dataFile);
        }


        Path groceriesTxtPath = Paths.get(directory, filename);

        System.out.println("groceriesTxtPath = " + groceriesTxtPath);
        System.out.println("Files.exists(groceriesTxtPath) = " + Files.exists(groceriesTxtPath));

        List<String> groceryList = Arrays.asList("dog food", "pizza sauce");
        System.out.println("groceryList = " + groceryList);

        Files.write(groceriesTxtPath, groceryList);

        List <String> printList = Files.readAllLines(groceriesTxtPath);
        System.out.println("printList = " + printList);

        Files.write(Paths.get(groceriesTxtPath, Arrays.asList("eggs", "milkbones"), StandardOpenOption.APPEND);




        groceryList = Files.readAllLines(groceriesTxtPath);
        List<String> newList = new ArrayList<>();

        for (String line : groceryList) {

            if(line.equalsIgnoreCase("pizza sauce")) {
                newList.add("PIZZA SAUCE");
                continue;
            }
            newList.add(line);

        }

    System.out.println(newList);

    }


}

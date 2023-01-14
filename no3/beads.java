package no3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class beads {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("./no3/in.txt");
        Scanner scanner = new Scanner(fileReader);
        FileWriter fileWriter = new FileWriter("./no3/out.txt");
        fileWriter.write(String.valueOf(scanner.nextInt()+1));
        fileWriter.close();


    }
}

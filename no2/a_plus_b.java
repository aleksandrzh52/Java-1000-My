package no2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class a_plus_b {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("./no2/in.txt");
        Scanner scanner = new Scanner(fileReader);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a + b;
        FileWriter fileWriter = new FileWriter("./no2/out.txt");
        fileWriter.write(String.valueOf(c));
        fileWriter.close();

    }
}

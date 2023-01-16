package no7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class eniya {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("./no7/in.txt");
        Scanner scanner = new Scanner(fileReader);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        FileWriter fileWriter = new FileWriter("./no7/out.txt");
        fileWriter.write(String.valueOf((A*B*N)*2));
        fileWriter.close();

    }
}

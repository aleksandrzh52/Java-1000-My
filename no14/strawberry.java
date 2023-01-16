package no14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class strawberry {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("./no14/in.txt");
        Scanner scanner = new Scanner(fileReader);
        int xMasha = scanner.nextInt();
        int yMisha = scanner.nextInt();
        int sieli = scanner.nextInt();
        int itogo = (xMasha+yMisha) - sieli;
        FileWriter fileWriter = new FileWriter("./no14/out.txt");
        if ((xMasha+yMisha)<sieli) {
            fileWriter.write("Impossible");
        }
        else {
            fileWriter.write(String.valueOf(itogo));
        }
        fileWriter.close();

    }
}

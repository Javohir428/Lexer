package com.javo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import static com.javo.Lexer.error;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                File f = new File(args[0]);
                Scanner s = new Scanner(f);
                StringBuilder source = new StringBuilder(" ");
                while (s.hasNext()) {
                    source.append(s.nextLine()).append("\n");
                }
                Lexer l = new Lexer(source.toString());
                l.printTokens();
            } catch(FileNotFoundException e) {
                error(-1, -1, e.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            error(-1, -1, "The program code file is not specified. For Example: java -jar Lexer.jar program.txt");
        }
    }
}

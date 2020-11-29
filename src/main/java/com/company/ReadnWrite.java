package com.company;
import java.io.*;
import java.util.Scanner;

public class ReadnWrite extends FileReaderClass  {
    static void readnWrite(String NameOfFile)   {
        try {
            Scanner scan = new Scanner(FileReaderMethod(NameOfFile));
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
            FileReaderMethod(NameOfFile).close();
        } catch (IOException e) {
            Text.IfYourNameWasNotFounded(NameOfFile);
            Text.PleasingToWrtiting();
            SCANNER scanner = new SCANNER();
            scanner.SetName(scanner.GetName());
            Text.YourWrittedName(scanner.NameOfFile);
            ReadnWrite.readnWrite(scanner.NameOfFile);
        }
    }

}
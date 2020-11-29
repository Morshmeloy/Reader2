package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Text.PleasingToWrtiting();
        SCANNER scanner = new SCANNER();
        scanner.SetName(scanner.GetName());
        Text.YourWrittedName(scanner.NameOfFile);
        try {
            ReadnWrite.readnWrite(scanner.NameOfFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Text.WhatsNext();
        scanner.SetWhatsPersonWantToDo(scanner.GetWhatsPersonWantToDo());
        FileNumberOf NumberOf = new FileNumberOf();
        switch (scanner.WhatsPersonWantToDo) {
            case ("количество символов без пробелов"):
                NumberOf.NumberOfLetters(scanner.NameOfFile);
                System.out.println(NumberOf.NumberOfLetters(scanner.NameOfFile));

                break;
            case ("количество символов с пробелами"):
                NumberOf.NumberOfLettersWithSpace(scanner.NameOfFile);
                System.out.println(NumberOf.NumberOfLettersWithSpace(scanner.NameOfFile));

                break;
            case ("количество слов"):
                NumberOf.NumberOfWords(scanner.NameOfFile);
                System.out.println(NumberOf.NumberOfWords(scanner.NameOfFile));
                break;

            case ("количество пробелов"):
                NumberOf.NumberOfSpace(scanner.NameOfFile);
                System.out.println(NumberOf.NumberOfSpace(scanner.NameOfFile));
                break;

            case ("количество точек, запятых"):
                NumberOf.NumberOfDots(scanner.NameOfFile);
                System.out.println(NumberOf.NumberOfDots(scanner.NameOfFile));
                break;
            case ("количество строк в файле"):
                try {
                    NumberOf.NumberOfLines(scanner.NameOfFile);
                    System.out.println(NumberOf.NumberOfLines(scanner.NameOfFile));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                break;
            case ("Хочу ввести сам символ который найти"):
                Text.PleaseWriteYourSimbol();
                scanner.SetWhatsSimbolPersonWant(scanner.GetWhatsSimbolPersonWant());
                Text.YourSimbolIs(scanner.WhatsSimbolPersonWant);
                NumberOf.NumberOfYourSimbol(scanner.NameOfFile, scanner.WhatsSimbolPersonWant);
                System.out.println(NumberOf.NumberOfYourSimbol(scanner.NameOfFile, NumberOf.WhatsSimbolPersonWant));

                break;
        }
    }


}
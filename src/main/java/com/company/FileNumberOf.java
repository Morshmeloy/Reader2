package com.company;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class FileNumberOf extends FileReaderClass{


    public int NumberOfWords(String NameOfFile){
        int FileNumberOfWords = 0;
        try {
            Scanner scan = new Scanner(FileReaderMethod(NameOfFile));
            while (scan.hasNext()) {
                scan.next();
                FileNumberOfWords++;
            }
            FileReaderMethod(NameOfFile).close();


        } catch (IOException e) {
            e.printStackTrace();
        }
        return FileNumberOfWords;
    }

    public int NumberOfLettersWithSpace(String NameOfFile)  {
        int FileNumberOfLettersWithSpace = 1;
        try {

            Scanner scan = new Scanner(FileReaderMethod(NameOfFile));

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] number = line.split("");
                for (String s : number) {
                    int c = s.length();
                    FileNumberOfLettersWithSpace = c + FileNumberOfLettersWithSpace;
                }
            }
            FileReaderMethod(NameOfFile).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return FileNumberOfLettersWithSpace;
    }

    public int NumberOfLetters(String NameOfFile){
        int  FileNumberOfLetters = 0;
        try {

            Scanner scan = new Scanner(FileReaderMethod(NameOfFile));

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] number = line.split(" ");
                for (String s : number) {
                    int c = s.length();
                    FileNumberOfLetters = c + FileNumberOfLetters;
                }
            }


            FileReaderMethod(NameOfFile).close();


        } catch (IOException e) {
            e.printStackTrace();
        }
        return FileNumberOfLetters;
    }


    public int NumberOfLines(String NameOfFile) throws IOException {
        int FileNumberOfLines = 0;
        try {
            LineNumberReader NumberOfLinesReader = new LineNumberReader(FileReaderMethod(NameOfFile));

            while (NumberOfLinesReader.readLine() != null) {
                FileNumberOfLines++;
            }
            FileReaderMethod(NameOfFile).close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return FileNumberOfLines;
    }


    public int NumberOfDots(String NameOfFile){
        int  FileNumberOfDots = 0;
        try {
            Scanner scan = new Scanner(FileReaderMethod(NameOfFile));

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] number = line.split("");
                for (String s : number) {
                    if (s.equals(",") || s.equals(".")) {
                        FileNumberOfDots++;
                    }

                }
            }


            FileReaderMethod(NameOfFile).close();


        } catch (IOException e) {
            e.printStackTrace();
        }
        return FileNumberOfDots;
    }


    public int NumberOfSpace(String NameOfFile) {
        int   FileNumberOfSpace = 0;
        try {
            Scanner scan = new Scanner(FileReaderMethod(NameOfFile));

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] number = line.split("");
                for (String s : number) {
                    if (s.equals(" ")) {
                        FileNumberOfSpace++;
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return FileNumberOfSpace;
    }

    public int NumberOfYourSimbol(String NameOfFile, String WhatsSimbolPersonWant) {
        int FileNumberOfYourSimbol = 0;
        try {
            Scanner scan = new Scanner(FileReaderMethod(NameOfFile));

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] number = line.split("");
                for (String s : number) {
                    if (s.equals(WhatsSimbolPersonWant)) {
                        FileNumberOfYourSimbol++;
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return FileNumberOfYourSimbol;
    }
}
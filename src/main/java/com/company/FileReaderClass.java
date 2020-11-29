package com.company;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass extends SCANNER {

    static FileReader FileReaderMethod(String NameOfFile) throws IOException {
        FileReader file=new FileReader("C:\\Users\\Альфред\\Desktop\\Project" + NameOfFile + ".txt");
        return file;

    }
}
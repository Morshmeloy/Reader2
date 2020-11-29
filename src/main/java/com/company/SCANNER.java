package com.company;

import java.util.Scanner;

public class SCANNER {
    Scanner scan = new Scanner(System.in);
    String NameOfFile;
    String WhatsPersonWantToDo;
    String WhatsSimbolPersonWant;

    public void SetName(String NameOfFile) {
        this.NameOfFile = NameOfFile;
    }

    public String GetName() {
        NameOfFile = scan.nextLine();
        return NameOfFile;
    }

    public void SetWhatsPersonWantToDo(String WhatsPersonWantToDo) {
        this.WhatsPersonWantToDo = WhatsPersonWantToDo;
    }

    public String GetWhatsPersonWantToDo() {
        WhatsPersonWantToDo = scan.nextLine();
        return WhatsPersonWantToDo;
    }

    public void SetWhatsSimbolPersonWant(String WhatsSimbolPersonWant) {
        this.WhatsSimbolPersonWant = WhatsSimbolPersonWant;
    }

    public String GetWhatsSimbolPersonWant() {
        WhatsSimbolPersonWant = scan.nextLine();
        return WhatsSimbolPersonWant;
    }
}
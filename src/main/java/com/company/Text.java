package com.company;

public class Text {
    static void PleasingToWrtiting() {
        System.out.println("Введите названия вашего файла ");
    }

    static void YourWrittedName(String NameOfFile) {
        System.out.println("Вы ввели " + NameOfFile);
    }

    static void IfYourNameWasNotFounded(String NameOfFile) {
        System.out.println("Введённое вами " + NameOfFile + " названием файла не являеться ");
    }

    static void WhatsNext() {
        System.out.println("Введите что хотите сделать ?\n-количество символов без пробелов\n-количество символов c пробелов\n-Количество слов?\n-Количество пробелов?\n-Количество точек, запятых\n-Хочу ввести сам символ который найти");
    }

    static void PleaseWriteYourSimbol() {
        System.out.println("Пожалуйста введите ваш символ");
    }

    static void YourSimbolIs(String WhatsSimbolPersonWant) {
        System.out.println("Вами введённый символ: " + WhatsSimbolPersonWant);
    }
}
package ru.lanit.de;
// master
public class Main {
  public static void main(String[] args) {
    int aInt = 666;
    int bInt = 8888;
    int multiplication = aInt * bInt;
    int division = bInt / aInt;
    int addition = aInt + bInt;
    int subtraction = bInt - aInt;
    int remainder = bInt % aInt;
    System.out.println("Даны числа А и Б");
    System.out.println("А = 666 и B = 8888");
    System.out.println("Умножение А на Б = " + multiplication);
    System.out.println("Деление Б на А = " + division);
    System.out.println("Сложение А и Б = "+ addition);
    System.out.println("Вычитаение А из Б = "+ subtraction);
    System.out.println("");
  }
}


// Логические операторы всегда тип boolean
// <> <= >= == !=
// Операторы && ||
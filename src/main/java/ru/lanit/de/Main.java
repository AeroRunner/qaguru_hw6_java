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
    System.out.println("Остаток от деления Б на А = " + remainder);

    int cInt = 500;
    int dInt = 2500;
    System.out.println("Даны числа C и D");
    System.out.println("C = 500 и D = 2500");
    System.out.println("C меньше D? Ответ:"+(cInt < dInt));
    System.out.println("C больше D? Ответ:"+(cInt > dInt));
    System.out.println("C равно D? Ответ:" + (cInt==dInt));
    System.out.println("C не равно D? Ответ:"+(cInt != dInt));
    System.out.println("C больше или равно D? Ответ:" +(cInt>=dInt));
    System.out.println("С меньше или равно D? Ответ:"+(cInt<=dInt));

    int income = 100000;
    int age = 21;
    int creditRate = 80;
    if (age>=21){
      if (income>100000);
      if (creditRate>=80);
      System.out.println("Вы подходите под условия кредитования!");
    }


  }
}


// Логические операторы всегда тип boolean
// <> <= >= == !=
// Операторы && ||
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

    int income = 160000;
    int age = 18;
    int creditRate = 97;
    String solution;
    if (age>=21 && income>=100000 && creditRate>=80 ) {
      solution = "Кредит одобрен!";
      System.out.println(solution);
    }
     else if (income<100000 ||  age < 21 || creditRate<80){
      solution = "Отказано в кредите(";
      System.out.println(solution);
     }

     int ticket = 3 ;
     int box = 500000;
     String message ="Ваш лотырейный билет попадает в категорию до ";
     switch (ticket){
         case 1:
         case 2:
         case 3:
             box = 300000;
             break;
         case 4:
         case 5:
         case 6:
         case 7:
             box = 50000;
             break;
         case 8:
             box = 1000000;
             break;
         case 9:
         case 10:
             box = 400000;
     }
      System.out.println(message+box);

      byte aByte = 127;
      byte bByte = -1;
      byte overByte = (byte) (aByte - bByte);
      System.out.println("Переполнение вычисление типа данных byte: " + overByte);
      int intBorder = Integer.MAX_VALUE;
      int intOver = intBorder;
      intOver++;
      System.out.println("Переполнение вычисления типа данных int: " + intOver);

      System.out.println("Даны числа E и F" +"\n" + "E=17512 и F=19.3");
      int eInt = 17512;
      double aDouble = 19.3;
      double dSum = eInt + aDouble;
      double dSub = eInt - aDouble;
      double dDiv = eInt / aDouble;
      double dMult = eInt * aDouble;
      int lastResult = (int)(dDiv + dSum);
      System.out.println("Ответы с остатком: "+"\n"
              +"Сложение E и F: "+dSum+"\n"
              +"Вычитание F из E: "+dSub+"\n"
              +"Деление E на F: "+dDiv+"\n"
              +"Умножение E на F: "+dMult+"\n"
              +"Сумма дробных числе в виде int без остатка: " +lastResult);

                    }

}

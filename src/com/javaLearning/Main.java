package com.javaLearning;

public class Main {

    public static void main(String[] args) {

      boolean findLeapYear =   isLeapYear(-1600);
        System.out.println(findLeapYear);
        boolean findLeapYear2 =   isLeapYear(1600);
        System.out.println(findLeapYear2);
        boolean findLeapYear3 =   isLeapYear(2017);
        System.out.println(findLeapYear3);
        boolean findLeapYear4 =   isLeapYear(2000);
        System.out.println(findLeapYear4);


    }
    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
          if (year % 4 == 0 ){
              if (year % 100 == 0){
                  if (year % 400 == 0){
                      return true;

                  }else {
                      return false;
                  }
              }else {
                  return true;
              }
          }else {
              return false;
          }
        }else {
            return false;
        }
    }
}

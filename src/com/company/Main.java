package com.company;

import java.util.Scanner;
import java.util.SplittableRandom;
import java.util.StringJoiner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //1)
      /**  System.out.println("Введите Ваше имя и нажмите <Enter>:");
        Scanner me=new Scanner(System.in);
        String name=me.next();
        System.out.println("Добрый день," + name+"." +"Мы рады, что Вы с нами!");
        me.close();}}*/

       // для себя
      /**for (String arg:args){
            System.out.println (arg);
        }*/

        //2)
        /**int i;
        for (i=args.length-1;i>=0;i--){
            System.out.println (args[i]);
        }}}*/

       //3)
        /**System.out.println("введите 2 числа и нажмите <Enter> ");
        Scanner sk=new Scanner(System.in);
        int number=sk.nextInt();
        int number2=sk.nextInt();
        System.out.println(number);
        System.out.println(number2);
        System.out.print(number+" ");
        System.out.print(number2);
        sk.close();}}*/

        //4)
        /**String passvord="12345";
        System.out.println("Введите Ваш пароль и нажмите <Enter> ");
        Scanner sk=new Scanner(System.in);
        String name=sk.next();
        if (name.equals(passvord)){
        System.out.println("Вход выполнен успешно");}
        else System.out.println("Пароль введен не верно");
        sk.close();}}*/

        //5)
        /**int a,b;
        System.out.println("введите 3 числа и нажмите <Enter> ");
        Scanner sk=new Scanner(System.in);
        int number=sk.nextInt();
        int number_r=sk.nextInt();
        int number_rr=sk.nextInt();
        a=number+number_r+number_rr;
        b=number*number_r*number_rr;
        System.out.print("Cумма чисел="+a +";"+"произведение="+b);
        sk.close();}}*/

        //6.1)
        /**int a,b,c,d;
        System.out.println("введите 4 числа и нажмите <Enter> ");
        Scanner sk=new Scanner(System.in);
        a=sk.nextInt();
        b=sk.nextInt();
        c=sk.nextInt();
        d=sk.nextInt();
        int nums[]={a,b,c,d};
        for (int x:nums){
            if (x%2==0){
            System.out.println("Четное число:"+x);}}
        for (int x:nums){
            if (x%2==0)continue;
        System.out.println("Нечетное число:"+x);
        }
        sk.close();}}*/

        //6.2)
        /**int a,b,c,d;
        System.out.println("введите 4 числа и нажмите <Enter> ");
        Scanner sk=new Scanner(System.in);
        a=sk.nextInt();
        b=sk.nextInt();
        c=sk.nextInt();
        d=sk.nextInt();
        int nums[]={a,b,c,d};
        int min = nums[0];
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(min>nums[i])
                min = nums[i];}
            System.out.println("Минимальное значение: "+  min);
        for(int i = 0; i < nums.length; i++){
        if (max<nums[i])
                max=nums[i];}
            System.out.println("Максимальное значение: "+  max);} }*/

        //6.3)
        /**int a,b,c,d;
        System.out.println("введите 4 числа и нажмите <Enter> ");
        Scanner sk=new Scanner(System.in);
        a=sk.nextInt();
        b=sk.nextInt();
        c=sk.nextInt();
        d=sk.nextInt();
        int nums[]={a,b,c,d};
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%3==0|nums[i]%9==0)
        System.out.print(nums[i]+" ");}}}*/

        //6.4)
        /**int a,b,c,d;
        System.out.println("введите 4 числа и нажмите <Enter> ");
        Scanner sk=new Scanner(System.in);
        a=sk.nextInt();
        b=sk.nextInt();
        c=sk.nextInt();
        d=sk.nextInt();
        int nums[]={a,b,c,d};
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%5==0&nums[i]%7==0){
                System.out.println("число "+nums[i]+" можно разделить на 5 и на 7");}}}}*/

        //6.5)
        /**String a,b,c,d;
        System.out.println("введите 4 числа и нажмите <Enter> ");
        Scanner sk=new Scanner(System.in);
        a=sk.next();
        b=sk.next();
        c=sk.next();
        d=sk.next();
        String nums[]={a,b,c,d};
        for(String x:nums) {
            if (x.length()==3&&x.charAt(0)!=x.charAt(1)&&x.charAt(1)!=x.charAt(2)&&x.charAt(0)!=x.charAt(2)) {
                System.out.println("число " + x);}
            }}}*/

        //6.6
        /**String a,b,c,d;
        System.out.println("введите 4 числа и нажмите <Enter> ");
        Scanner sk=new Scanner(System.in);
        a=sk.next();
        b=sk.next();
        c=sk.next();
        d=sk.next();
        String nums[]={a,b,c,d};
        for(String x:nums) {
            if (x.length()==4&&x.charAt(0)+x.charAt(1)==x.charAt(2)+x.charAt(3))
                System.out.println("Счастливое число " + x+" ");}}}*/

        //6.7
        /**String  a,b,c;
        System.out.println("введите 3 числа и нажмите <Enter> ");
        Scanner sk=new Scanner(System.in);
        a=sk.next();
        b=sk.next();
        c=sk.next();
        String nums[]={a,b,c};
        for(String x:nums) {
           if (x.length()<3) {
               continue;}
            if (x.length()==3&&x.charAt(0)==(x.charAt(1)+x.charAt(2))/2){
                System.out.println("элемент "  + x.charAt(0) + " равен полусумме соседних элементов числа " + x);}
            else if (x.length()==3&&x.charAt(1)==(x.charAt(0)+x.charAt(2))/2){
                System.out.println("элемент "  + x.charAt(1) + " равен полусумме соседних элементов числа " + x);}
            else if (x.length()==3&&x.charAt(2)==(x.charAt(0)+x.charAt(1))/2){
                System.out.println("элемент "  + x.charAt(2) + " равен полусумме соседних элементов числа " + x);}}}}*/

       











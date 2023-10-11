/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany;

import java.util.Scanner;

/**
 *
 * @author Ваня
 */
public class App {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Molq, vuvedete broq na godinite: ");
        int n=scan.nextInt();
        if(n<=0){
            System.out.println("Ochakva se da vuvedete tsialo polozhitelno chislo.");
            return;
        }
        int i=0;
        String status;
        int years[]=new int [n];
        do{
            System.out.print("Godina "+(i+1)+": ");
            int year=scan.nextInt();
            if(year>0){
                years[i]=year;
                i++;
                if(isLeap(year)){
                    status="e visokosna";
                }
                else{
                    status="ne e visokosna";
                }
                String info=String.format("Godinata %d %s", year,status);
                System.out.println(info);
            }
            else{
                System.out.println("Nevalidna godina: "+year);
            }
        }while(i!=n);
    }
    private static boolean isLeap(int year){
        boolean result = false;
        if((year%4==0)&&(year%100!=0)||(year%400==0)){
            result=true;
        }
        return result;
    } 
}

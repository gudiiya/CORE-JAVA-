/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

public class constructor {
    constructor()
    {
        System.out.println("Hello java");  //default constructor
    }
     String name;
    String detail;
    constructor(String n,String s)      //parameterized constructor
    {
        name=n;
        detail=s;
    }
    constructor(constructor s)          //copy constructor
    {
        name=s.name;
        detail=s.detail;
                }
    void display()
    {
        System.out.println(name+" "+detail);
    }
    public static void main(String[] args){
        
        constructor a=new constructor();
        Scanner fg=new Scanner(System.in);
        System.out.println("Enter a name");
        String name=fg.nextLine();
        System.out.println("Enter a Details");
        String detail=fg.nextLine();
    }
    
}

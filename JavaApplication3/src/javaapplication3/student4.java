/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Software1
 */
public class student4 {
    int id;
    String name;
    student4(int i,String n)
    {
        id=i;
        name=n;
    }
        void display()
        {
            System.out.println(id+"  "+name);
        }
           public static void main(String args[])
        {
            student4 s1=new student4(111,"khushi");
            student4 s2=new student4(222,"Siya");
            s1.display();
            s2.display();
        }
    }


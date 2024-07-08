/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
public class student5 {
    int id;
    String name;
    int age;
    student5(int i,String n)
    {
        id=i;
        name=n;
    }
    student5(student5 s)
    {
        id=s.id;
        name=s.name;
        age=s.age;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }
    public static void main(String args[])
    {
        student5 s1=new student5(101,"khushi");
        student5 s2=new student5(s1);
        s1.display();
        s2.display();
    }
    
    
}

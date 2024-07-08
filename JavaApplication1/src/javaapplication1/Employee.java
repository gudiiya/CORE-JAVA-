
package javaapplication1;

import static java.lang.Math.E;
import java.util.Scanner;
public class Employee 
{
    private int ID;
    private String name;
    private int age;
    private static int nextid=1;
    public Employee(String name,int age)
    {
        this.name=name;
        this.age=age;
        this.ID=nextid++;
    }
    public void show()
    {
        System.out.println("Id="+ID+"\nName="+name+"\nAge"+age);
    }
    public void showNextId()
    {
        System.out.println("Next Employee id will be="+nextid);
    }  
}
class UseEmployee
{
    public static void main(String[]args)
    {
        Scanner fg=new Scanner(System.in);
         System.out.println("Enter a Name:");
        String name=fg.nextLine();
        System.out.println("Enter a Age:");
        int age=fg.nextInt();
        System.out.println("Enter a ID:");
        int ID=fg.nextInt();
    }   
}



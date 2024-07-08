/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

public class JavaApplication3 {
    public static void main(String[] args) {
        double [] mylist = {2.0,2.3,3.5,4.5};
        for(int i=0;i<mylist.length;i++)
        {
            System.out.println(mylist[i]+" ");
        }
        double total=0;
        for(int i=0;i<mylist.length;i++)
        {
            total +=mylist[i];
        }
        System.out.println("Total is "+total);
        double max=mylist[0];
        for(int i=1;i<mylist.length;i++)
        {
            if(mylist[i]>max)max=mylist[i];
        }
        System.out.println("Max is "+max);
    }
    
}

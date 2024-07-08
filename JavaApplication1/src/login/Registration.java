/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.util.Scanner;
public class Registration {
    static Register register=new Register();
    public static void main(String[]args){
        try(Scanner scanner=new Scanner(System.in))
        {
            System.out.print("Enter First Name = ");
            String firstName=scanner.nextLine();
            register.setFirstName(firstName);
            System.out.print("Enter Last Name = ");
            String lastName=scanner.nextLine();
            register.setLastName(lastName);
            System.out.print("Enter UserName = ");
            String userName=scanner.nextLine();
            register.setUserName(userName);
            System.out.print("Enter a Password = ");
            String password=scanner.nextLine();
            register.setPassword(password);
            System.out.print("Enter a Email Id = ");
            String emailid=scanner.nextLine();
            register.setEmailID(emailid);
            System.out.println("Enter a DOB = ");
            String dob=scanner.nextLine();
            register.setdob(dob);
            System.out.print("Enter a Joining Date=");
            String JoiningDate=scanner.nextLine();
            register.setjoiningdate(JoiningDate);
            System.out.print("Enter a Blood Group=");
            String bloodgroup=scanner.nextLine();
            register.setbloodgroup(bloodgroup);
            System.out.print("Enter a Phone No = ");
            long phoneno=scanner.nextLong();
            register.setPhoneNo(phoneno);
            
            
            System.out.println(register.toString());
        }
        
    }
    
}

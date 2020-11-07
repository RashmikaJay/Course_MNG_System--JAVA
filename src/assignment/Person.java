/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;  

public class Person{

    Scanner pobj = new Scanner(System.in);
    public String name;
    public String email;
    public String phone;
	 
	 
//    public Person(String name,String email,int phone) {
//		
//        this.name=name;
//        this.email=email;
//        this.phone=phone;
//    }

//   public String getName(){
//       System.out.println("Enter Person Name :");
//       name = pobj.next();
//       return name;
//   }
//    
//    
//    public String getEmail() {
//        System.out.println("Enter Person Email :");
//        email = pobj.next();
//        return email;
//    }
//
//    
//    public int getPhone() {
//        
//        System.out.println("Enter Person Phone :");
//        phone = pobj.nextInt();
//        return phone;
//    }
    
    public void setName(String name){
        
        this.name = name;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author ps
 */

import java.util.Scanner;

/**
 * 
 */
public class Instructor extends Person {

    /**
     * Default constructor
     */
	public int mark;
	public String InID;
        private String module;
	Scanner inobj = new Scanner(System.in);
	
//    public Instructor(String n,String e,int p) {
//		
//	//super(name,email,phone);
//        System.out.println("Instructor Name :"+n+ "     EMAIL :"+e+ "   Phone Number :"+p);
//	//this.InID = InID;
//    }
    
    
    
    public String getInID() {
        System.out.println("Input Instructor ID :");
        String InID=inobj.nextLine();
        System.out.println("InStructor  ID :"+InID);
        return InID;
    }

    public void viewModule(String InID, String modName) {
        System.out.println("Modules Can view by Instructor "+InID + " - " + modName);
        for(int i:Administrator.moduleList.keySet()){
            if((Administrator.moduleList.get(i)).equals(InID)){
            //System.out.println("Module :"+i);
        }
        }
    
    }
    
    public void addMark(){
        System.out.print("Pass mark of the Mathematics :");
        int mark1 =inobj.nextInt();
        
        System.out.println();
        System.out.print("Pass mark of the Information System :");
        int mark2 =inobj.nextInt();
        
        System.out.println();
        System.out.print("Pass mark of the Personal Computing :");
        int mark3 =inobj.nextInt();
        
        System.out.println();
        System.out.print("Pass mark of the Programming :");
        int mark4 =inobj.nextInt();
        
        System.out.println();
        System.out.print("Pass mark of the Web Application :");
        int mark5 =inobj.nextInt();
        
        System.out.println();
        System.out.print("Pass mark of the System Analysis Design :");
        int mark6 =inobj.nextInt();
        
    }
        
    }



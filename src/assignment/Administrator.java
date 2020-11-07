/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;


public class Administrator extends Person {
    
 
    Scanner myobj = new Scanner(System.in);
    HashMap<String,String> List = new HashMap<>();
    static HashMap<Integer, String> moduleList = new HashMap<>();
    static HashMap<Integer,String> instructMark = new HashMap<>();
   
    
//    private String name;
//    private String email;
//    private int phone;
    private String adminID;

//    Administrator() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    /**
     *
     */

    
    
    public String getAdmin() {
    System.out.print("Input Admin ID :");
    String adminID=myobj.nextLine();
    System.out.println("Admin ID :"+adminID);
    return adminID;
    }
    
    public void addCourse(String code, String courseName) {
        List.put(code, courseName);
        System.out.println("Add a Course :"+courseName+ "    Code of the Course :"+code);
        
    } 
    

    protected void editCourse() {
        String courseName;
        String code;
        System.out.print("Code of Course to be Edited: ");
        code = myobj.nextLine();
        System.out.print("New Course Name: ");
        courseName = myobj.nextLine();
        List.replace(code, courseName);
        System.out.print("Course " + code + " edited\n");
    }
    

    
    public void cancelCourse() {
        String code;
        String courseName;
        System.out.print("Cancelled Course code : ");
        code = myobj.nextLine();
        courseName = List.get(code);
        List.remove (code, courseName );
        System.out.println("Code :"+code+ " Course :"+courseName+" cancelled");
        System.out.println("Available Courses :" );
        
    }
    
    
    public void addModule(int moduleNo,String moduleName){
        moduleList.put(moduleNo,moduleName);
        System.out.println("Add modules to the Course :"+moduleName);
    }
    
    public void editModule(int moduleNo,String moduleName){
        moduleList.replace(moduleNo, moduleName);
        System.out.println("Module edited :"+moduleName);
    }    

    public int generateGrade(){
        String grade;
        System.out.println("Enter student average marks of all modules :");
        int mark =myobj.nextInt();
        if(mark >=75){
        grade ="A";
        
        }else if(mark>=65){
            grade = "B";
        }else if(mark>=55){
            grade ="C";
        }else{
            grade = "F";
        }
        System.out.println("Student Grade :"+grade);
        return mark;
        
    }

    
    public void pass_fail(String stdid) throws FileNotFoundException {
        
        PrintWriter genTranscript = new PrintWriter("Results.txt");
        int x = generateGrade();
        String mod1;
        genTranscript.println("Student Number: " + stdid);
        
        
        genTranscript.println("Average Marks: " + x);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  Grade :");
        mod1 = scanner.nextLine();
        
        genTranscript.println("Grade: " + mod1);
        
        if(mod1.equals("A")){
            System.out.println("First class !");
            genTranscript.println("First class !");
        }else if(mod1.equals("B")){
            System.out.println("First upper class !");
            genTranscript.println("First upper class !");
        }else if(mod1.equals("C")){
            System.out.println("Second upper class !");
            genTranscript.println("Second upper class !");
        }else{
            System.out.println("Repeat !!");
            genTranscript.println("Repeat !!");
        }
          genTranscript.close();
    }

}

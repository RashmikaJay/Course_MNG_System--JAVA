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
public class Student extends Person {

    /**
     * Default constructor
     */
	Scanner st1 = new Scanner(System.in);
	private String stID;
	private String semester_level;
        static String[][] enrolledMod = new String[16][2];
	
//    public Student(int stID, String level,String n,String e,int p) {
//		
//		//super(name,email,phone);
//		this.stID =stID;
//		semester_level = level;
//    }

    
    public String getStID(){
     
        System.out.println("Enter Student ID :");
        String StID = st1.next();
        return StID;
    }
    
//    public void enrolModule(){
//        System.out.println("Student ID : "+stID+ ", Enrol Module :Database");
//        System.out.println("Student ID : "+stID+ ", Enrol Module :Programming");
//        System.out.println("Student ID : "+stID+ ", Enrol Module :Mathematics");
//        System.out.println("Student ID : "+stID+ ", Enrol Module :System Analysis Design");
//    }
    int i = 0;
    public void enrollModule(String uId, String modCode,String module) {
        int count = 0;
//        for(int j = 0; j < 16; j++){
//            if(enrolledMod[j][0] != null){
//                if(enrolledMod[j][0].equals(modCode)){
//                    System.out.println("\nYou have already enrolled to Module " + modCode);
//                    count++;
//                    break;
//                }
//            }
//        }
        if (count == 0){
            enrolledMod[i][0] = (modCode);
            System.out.println("User " + uId + " successfully enrolled to "+module);
        }
        i++;
    }
    
    public void ModandInstructor(String enrolledModCode,String Instructor) {
        
     System.out.println("Module: " + enrolledModCode + " Instructor: " + Instructor);
    }
        
    
    public int getstID(int id) {
        // TODO implement here
        return id;
    }
    
    public String getLevel(String level){
        return level;
    }
    

    /**
     * @return
     */
//    public String getSemester() {
//        // TODO implement here
//        return "";
//    }

}

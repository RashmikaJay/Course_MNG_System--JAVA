/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 *
 * @author ps
 */
public class Assignment {

    
    public static void main(String[] args) throws FileNotFoundException {
        //import  person file
        String[][] fileData = new String[50][3];
        String fileName = "Person.csv";
        File file = new File(fileName);
        Scanner inputStream = new Scanner(file);
        int count = 0;
        while (inputStream.hasNext()){
            String data = inputStream.nextLine();
            String[] values = data.split(",");
            fileData[count] = values;
            count++;
        }
        inputStream.close();
        
        //create an object to administrator
        Administrator emp = new Administrator();
        
        //Enter admin ID
        System.out.println("Create Administrator ");
        emp.getAdmin();
        System.out.println(fileData[1][0]);
        System.out.println(fileData[1][1]);
        System.out.println(fileData[1][2]);
        emp.setName(fileData[1][1]);
        emp.setEmail(fileData[1][1]);
        emp.setPhone(fileData[1][2]);
        
        emp.addCourse("NS001","BA(Hons) Creative Multimedia");
        emp.addCourse("NS002", "BSc(Hons) Computer Science");
        emp.addCourse("NS003", "BSc(Hons) Computer Networks");
        emp.addCourse("NS004", "BSc(Hons) Computer Security");
        
        emp.editCourse();
        emp.cancelCourse();
        
        //Print out full list of courses
        System.out.println();
        for(String i:emp.List.keySet()){
            System.out.println("Course No: " + i + " Course Name: " + emp.List.get(i));
        }
        
        //create an object for add module
        System.out.println();
        emp.addModule(441, "Communication Skills");
        emp.addModule(442, "Information System");
        emp.addModule(443, "Mathematics");
        emp.addModule(553,"System Analysis Design");
        emp.addModule(444,"Personal Computing");
        emp.addModule(552,"Information System");
        
        
        
        
        //create an object for edit module...
        System.out.println();
        emp.editModule(441, "Database");
        emp.editModule(442, "Programming");
        
        
//        emp.generateGrade();
//        System.out.println();
//        emp.pass_fail();
        
        //create an object for instructor 1 to represent the module
        
        Instructor inMod1 = new Instructor(/*"Ruvii Jayasekara. ","ruvii@yahoo.com ",56789*/);
        String InID = inMod1.getInID();
        System.out.println(fileData[2][0]);
        System.out.println(fileData[2][1]);
        System.out.println(fileData[2][2]);
        inMod1.setName(fileData[2][0]);
        inMod1.setEmail(fileData[2][1]);
        inMod1.setPhone(fileData[2][2]);
        
        
        System.out.println();
        
        //Create Instuctor 
        Instructor inMod2 = new Instructor(/*"Sachini Vindya Gunasekara ","Sachini.Vindya@cinec.edu ",77880*/);
        String InID2 = inMod2.getInID();
        System.out.println(fileData[3][0]);
        System.out.println(fileData[3][1]);
        System.out.println(fileData[3][2]);
        inMod2.setName(fileData[3][0]);
        inMod2.setEmail(fileData[3][1]);
        inMod2.setPhone(fileData[3][2]);
        System.out.println();
        
        //Create Instructor
        Instructor inMod3 = new Instructor(/*"Sankalpa Lokuliyanage ","sakalpa@gmail.com ",11900 */);
        String InID3 =inMod3.getInID();
        System.out.println(fileData[4][0]);
        System.out.println(fileData[4][1]);
        System.out.println(fileData[4][2]);
        inMod3.setName(fileData[4][0]);
        inMod3.setEmail(fileData[4][1]);
        inMod3.setPhone(fileData[4][2]);
        
        
        System.out.println();
        
        
        
        //create an object for module....
        Module mobj1 = new Module(442,"Programming"," One");
        Module mobj2 = new Module(441,"Database"," One");
        Module mobj3 = new Module(444,"Personal Computing"," One");
        Module mobj4 = new Module(551,"Mathematics"," Two");
        Module mobj5 = new Module(552,"Information System"," Two");
        Module mobj6 = new Module(553,"System Analysis Design"," Two");
        System.out.println();
        
        
        inMod1.viewModule(InID, "Mathematics");
        inMod1.viewModule(InID, "Information System");
        inMod1.viewModule(InID, "Personal Computing");
        inMod1.viewModule(InID, "Programming");
        inMod1.viewModule(InID, "Web Application");
        inMod1.viewModule(InID, "System Analysis Design");
        System.out.println();
        
        
        inMod1.addMark();
        
        
        //create an object for Instructor 2
        System.out.println();
        inMod2.viewModule(InID2, "System Analysis Design");
        inMod2.viewModule(InID2, "Information System");
        inMod2.viewModule(InID2, "Mathematics");
        inMod2.viewModule(InID2, "Web Application");
        inMod2.viewModule(InID2, "Personal Computing");
        inMod2.viewModule(InID2, "Programming");
        System.out.println();
        
        inMod2.addMark();
        
        //create an object for Instructor 3
        System.out.println();
        inMod3.viewModule(InID3, "Web Application");
        inMod3.viewModule(InID3, "Personal Computing");
        inMod3.viewModule(InID3, "Programming");
        inMod3.viewModule(InID3, "Information System");
        inMod3.viewModule(InID3, "Mathematics");
        System.out.println();
        
        inMod3.addMark();
        System.out.println();
        
        //object create for Course
        System.out.println("Course Available");
        Course cobj1 = new Course("NS001","BA(Hons) Creative Multimedia");
        Course cobj2 = new Course("NS002", "BSc(Hons) Computer Science");
        Course cobj3 = new Course("NS003", "BSc(Hons) Computer Networks");
        Course cobj4 = new Course("NS004", "BSc(Hons) Business Science");
        
        Student sobj = new Student ();
        
        sobj.getStID();
        System.out.println(fileData[5][0]);
        System.out.println(fileData[5][1]);
        System.out.println(fileData[5][2]);
        sobj.setName(fileData[5][0]);
        sobj.setEmail(fileData[5][1]);
        sobj.setPhone(fileData[5][2]);
        
        sobj.enrollModule("ST001", "NS001","Web Application");
        sobj.enrollModule("ST001", "NS015","Personal Computing");
        sobj.enrollModule("ST001", "NS018","Programming");
        sobj.enrollModule("ST001", "NS014","Database");
        sobj.enrollModule("ST001", "NS016","Mathematics");
        sobj.enrollModule("ST001", "NS013","Information System");
        
        sobj.ModandInstructor("NS001","L1");
        sobj.ModandInstructor("NS015","L1");
        sobj.ModandInstructor("NS018","L2");
        sobj.ModandInstructor("NS014","L2");
        sobj.ModandInstructor("NS013","L3"); 
        
        
        
        //emp.generateGrade();
        emp.pass_fail("ST001");
     
    }
    
}

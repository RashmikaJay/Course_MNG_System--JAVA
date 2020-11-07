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

import java.util.*;

/**
 * 
 */
public class Module {

    public String moduleName;
    public int modelNo;
    public String semester;
    
    public Module(int modelNo,String moduleName,String semester) {
        this.modelNo=modelNo;
        this.moduleName=moduleName;
        this.semester=semester;
        System.out.println("Module number :"+modelNo+ " -- SEMESTER :"+semester  + " -- Module Name :"+moduleName);
    }
    
    
    
    



}

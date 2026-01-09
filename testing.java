/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author safaz
 */
public class testing {
    public static void main(String[] args) {
        
        Department cardio = new Department("Cardiology", 3);

        
        Doctor drSafa = new Doctor("Dr. Talitha", 23, "SZH1003", "Heart Surgeon", "Cardiology", true);
        Doctor drAndi = new Doctor("Dr. Jasmine", 22 , "JSK1004", "Cardiologist", "Cardiology", false); 
        
        cardio.addDoctor(drSafa);
        cardio.addDoctor(drAndi);

        
        Patient Patient1 = new Patient("Carissa", "PT1002", 25, "Chest Pain", "O");
        Patient Patient2 = new Patient("Keisha", "PT1001", 30, "High Blood Pressure", "A");

        System.out.println("---====== HOSPITAL MANAGEMENT SYSTEM ======---");
        
        
        System.out.println("\n---=== Initial Patient Data ===---");
        Patient1.displayInfo();
        Patient2.displayInfo();

        
        System.out.println("");
        System.out.println("\n---=== Processing Appointments ===---");
        System.out.println("");
       
        cardio.assignPatient(Patient1); 
        
       
        cardio.assignPatient(Patient1); 

        
        System.out.println("");
        System.out.println("\n---=== Final Status Update ===---");
        Patient1.displayInfo(); 
        System.out.println("");
        drSafa.displayInfo(); 
        
        System.out.println("\n================================================");
    }
}

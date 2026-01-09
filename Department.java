/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author safaz
 */
public class Department {
    private String dName;
    private Doctor[] doctors;
    private int doctorCount;
    
    Department(String name, int capacity){
        this.dName = name;
        this.doctors = new Doctor[capacity];
        this.doctorCount = 0;
    }
    
    void addDoctor(Doctor a){
        if(doctorCount < doctors.length){
            doctors[doctorCount] = a;
            doctorCount++;
        }
    }
    
    void assignPatient(Patient b){
        for(int i = 0; i < doctorCount; i++){
            if(doctors[i].available){
                System.out.printf("Patient %s assigned to Dr. %s", b.name, doctors[i].name);
                doctors[i].available = false;
            }
        }
    }
    
}

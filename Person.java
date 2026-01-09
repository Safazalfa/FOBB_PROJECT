/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author safaz
 */
public class Person {
    protected String name;
    protected String id;
    protected int age;
    
    Person(String name, String id, int age ){
    this.name = name;
    this.id = id;
    this.age = age;
    }
    
    void displayInfo(){
        System.out.printf("%nName = %s%nAge = %d%nID = %s", name, age, id);
    }
            
    
} class Doctor extends Person{
    protected String specialization;
    protected String department;
    protected boolean  available;
    
    Doctor(String name, int age, String id, String specialization, String department, boolean available){
        super(name, id, age);
        this.specialization = specialization;
        this.department = department;
        this.available = available;
    }
    
    @Override
    void displayInfo(){
        super.displayInfo();
        String a ;
        if(available == true){
            a = "AVAILABLE";
        }else{
            a = "UNAVAILABLE";
        }
        System.out.printf("%nSpecialization = %s%nDepartment = %s%nAvailability = %s%n",specialization, department, a);
    }

} class Patient extends Person{
    protected String ailment;
    protected String bloodType;
    
    Patient(String name, String id, int age, String ailment, String bloodType){
        super(name,id,age);
        this.ailment = ailment;
        this.bloodType = bloodType;
    }
    
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.printf("%nAilment = %s%nBlood Type = %s", ailment, bloodType);
        
    }
}

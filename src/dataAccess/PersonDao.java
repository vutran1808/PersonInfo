/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess;

import common.ScannerFactory;
import java.util.List;
import model.Person;

/**
 *
 * @author ASUS
 */
public class PersonDao {

    private static PersonDao instance = null;
    ScannerFactory sc;

    public PersonDao() {
        sc = new ScannerFactory();
    }

    public static PersonDao Instance() {
        if (instance == null) {
            synchronized (PersonDao.class) {
                if (instance == null) {
                    instance = new PersonDao();
                }
            }
        }
        return instance;
    }

    public void addPerson(Person[] personList) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Input Information of Person");
            String name = sc.getString("Please input name: ");
            String address = sc.getString("Please input address: ");
            float salary = sc.getDouble("Please input Salary: ");
            personList[i] = new Person(name, address, salary);
        }
    }

    public void displayPerson(Person[] personList) {
        for (Person ps : personList) {
            System.out.println("Name: " + ps.getName());
            System.out.println("Address: " + ps.getAddress());
            System.out.println("Salary: " + ps.getSalary());
        }
    }

    public void sortBySalary(Person[] personList) {
        for (int i = 0; i < personList.length - 1; i++) {
            for (int j = 0; j < personList.length - i - 1; j++) {
                if(personList[j].getSalary() > personList[j + 1].getSalary()){
                    Person temp = personList[j];
                    personList[j] = personList[j + 1];
                    personList[j + 1] = temp;
                }
            }
        }
    }
}

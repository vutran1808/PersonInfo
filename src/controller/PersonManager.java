/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Person;
import repository.IPersonRes;
import repository.PersonRes;
import view.Menu;

/**
 *
 * @author ASUS
 */
public class PersonManager extends Menu{

    private Person[] personList;
    IPersonRes mn;
    static String[] mc = {"Input 3 Person", "Display Person", "Sort by Salary", "Exit"};
    
    public PersonManager() {
        super("Manager Person Programer", mc);
        personList = new Person[3];
        mn = new PersonRes();
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1 -> mn.addPerson(personList);
            case 2 -> mn.displayPerson(personList);
            case 3 -> mn.sortBySalary(personList);
            case 4 -> System.exit(0);
        }
    }
    
}

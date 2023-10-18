/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.PersonDao;
import java.util.List;
import model.Person;

/**
 *
 * @author ASUS
 */
public class PersonRes implements IPersonRes {

    @Override
    public void addPerson(Person[] personList) {
        PersonDao.Instance().addPerson(personList);
    }

    @Override
    public void displayPerson(Person[] personList) {
        PersonDao.Instance().displayPerson(personList);
    }

    @Override
    public void sortBySalary(Person[] personList) {
        PersonDao.Instance().sortBySalary(personList);
    }

}

package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComapnyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarkson = new Employee("Stephanie", "Clarkson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarkson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarkson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Them
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
        companyDao.delete(softwareMachineId);
        companyDao.delete(dataMaestersId);
        companyDao.delete(greyMatterId);
        } catch (Exception e) {
        //do nothing
        }
    }

    @Test
    public void testRetrieveEmployeeByLastname() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Company softwareMachine = new Company("Software Machine");

        johnSmith.getCompanies().add(softwareMachine);
        softwareMachine.getEmployees().add(johnSmith);

        employeeDao.save(johnSmith);
        int johnId = johnSmith.getId();

        //When
        List<Employee> employeeLastname = employeeDao.retrieveEmployeeByLastname("Smith");
        //Then
        Assert.assertEquals(1, employeeLastname.size());
        //CleanUp
        employeeDao.delete(johnId);

    }

    @Test
    public void testRetrieveCompanyByName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Company softwareMachine = new Company("Software Machine");
        johnSmith.getCompanies().add(softwareMachine);
        softwareMachine.getEmployees().add(johnSmith);

        companyDao.save(softwareMachine);
        int softwareId = softwareMachine.getId();

        //When
        List<Company> companyName = companyDao.retrieveCompanyByName("Sof");
        //Then
        Assert.assertEquals(1, companyName.size());
        //CleanUp
        companyDao.delete(softwareId);
    }
}

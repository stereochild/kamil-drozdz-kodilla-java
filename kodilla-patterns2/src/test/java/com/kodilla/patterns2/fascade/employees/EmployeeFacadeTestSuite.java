package com.kodilla.patterns2.fascade.employees;

import com.kodilla.patterns2.facade.employees.Company;
import com.kodilla.patterns2.facade.employees.Employee;
import com.kodilla.patterns2.facade.employees.EmployeeFacade;
import com.kodilla.patterns2.facade.employees.NameFindException;
import com.kodilla.patterns2.facade.employees.dao.CompanyDao;
import com.kodilla.patterns2.facade.employees.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeFacadeTestSuite {
    @Autowired
    EmployeeFacade employeeFacade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testRetrieveCompanyNameByScrap() throws NameFindException {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //When
        List<Company> scrapName = employeeFacade.retrieveCompanyNameByScrap("ma");

        //Then
        Assert.assertEquals(3, scrapName.size());
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
    public void testRetrieveEmployeeNameByScrap() throws NameFindException {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarkson = new Employee("Stephanie", "Clarkson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        int smithId = johnSmith.getId();
        employeeDao.save(stephanieClarkson);
        int clarksonId = stephanieClarkson.getId();
        employeeDao.save(lindaKovalsky).getId();
        int kovalskyId = lindaKovalsky.getId();

        //When
        List<Employee> scrapName = employeeFacade.retrieveEmployeeNameByScrap("ar");

        //Then
        Assert.assertEquals(1, scrapName.size());

        //CleanUp
        try {
            employeeDao.delete(smithId);
            employeeDao.delete(clarksonId);
            employeeDao.delete(kovalskyId);
        } catch (Exception e) {
            //do nothing
        }


    }
}

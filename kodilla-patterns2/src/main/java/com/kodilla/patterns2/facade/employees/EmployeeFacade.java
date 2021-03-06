package com.kodilla.patterns2.facade.employees;

import com.kodilla.patterns2.facade.api.OrderFacade;
import com.kodilla.patterns2.facade.employees.dao.CompanyDao;
import com.kodilla.patterns2.facade.employees.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public final class EmployeeFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacade.class);

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

//    public List<Company> retrieveCompanyNameByScrap(String name) {
//        return companyDao.retrieveCompanyNameByScrap("%" + name + "%");
//    }
//
//    public List<Employee> retrieveEmployeeNameByScrap(String name) {
//        return employeeDao.retrieveEmployeeNameByScrap("%" + name + "%");
//    }

    public List<Company> retrieveCompanyNameByScrap(String name) throws NameFindException {
        LOGGER.info("Searching for company.");
        List<Company> companyName = companyDao.retrieveCompanyNameByScrap("%" + name + "%");
        if(!companyName.isEmpty()) {
            LOGGER.info("Company " + name + " found");
            return companyName;
        } else {
            LOGGER.error(NameFindException.ERROR_COMPANY_NOT_FOUND);
            throw new NameFindException(NameFindException.ERROR_COMPANY_NOT_FOUND);
        }
    }

    public List<Employee> retrieveEmployeeNameByScrap(String lastname) throws NameFindException {
        LOGGER.info("Searching for employee");
        List<Employee> employeeName = employeeDao.retrieveEmployeeNameByScrap("%" + lastname + "%");
        if(!employeeName.isEmpty()) {
            LOGGER.info("Employee " + lastname + " found");
            return employeeName;
        } else {
            LOGGER.error(NameFindException.ERROR_EMPLOYEE_NOT_FOUND);
            throw new NameFindException(NameFindException.ERROR_EMPLOYEE_NOT_FOUND);
        }
    }
}

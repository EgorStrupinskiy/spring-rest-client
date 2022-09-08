package com.egorstrupinski.spring.rest;

import com.egorstrupinski.spring.rest.configuration.MyConfig;
import com.egorstrupinski.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);


//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee employee = communication.getEmployee(2);
//        System.out.println(employee);

//        Employee employee = new Employee("Sveta", "Boltak", "Veshalka", 0);
//        employee.setId(8);
//        communication.saveEmployee(employee);

//        communication.deleteEmployee(8);
    }
}

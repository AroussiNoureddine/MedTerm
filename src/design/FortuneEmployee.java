package design;

import java.util.Scanner;
import databases.ConnectToSqlDB;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		ConnectToSqlDB connectionToDB=null;
		Scanner inPut = new Scanner(System.in);
		EmployeeInfo employeeInfo = new EmployeeInfo();
		System.out.print("Inter The employee ID number:");
		employeeInfo.setiD(inPut.nextInt());
		System.out.print("Inter The employee Full Name:");
		employeeInfo.setName(inPut.next());
		employeeInfo.assignDepartment();
		employeeInfo.calculateSalary();
		int pesion = employeeInfo.calculateEmployeePension(employeeInfo.getSalary());
		int bonus = employeeInfo.calculateEmployeeBonus(5,employeeInfo.getSalary(),"Best");
		System.out.println(employeeInfo.getiD()+", "+employeeInfo.getName()+", "+employeeInfo.getDepartment()+", "+
				employeeInfo.getSalary()+", "+pesion+", "+ bonus);
       //Create the table in the database first
		connectionToDB.insertEmpToSqlTable(new EmployeeInfo(),"EmployeeInfo","iD","name","department","salary");
	}

}

package design;

import java.util.Scanner;

public class EmployeeInfo extends Person implements Employee {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String department;
	static int  salary;

	public static String getDepartment() {
		return department;
	}

	public static int getSalary() {
		return salary;
	}

	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(){super();}
	public EmployeeInfo(int employeeId){
		super (employeeId);
	}
    public EmployeeInfo(String empname, int employeeId){
		super(empname,employeeId);
	}

	public EmployeeInfo(String empname, int employeeId,String department,int salary ) {
		super(empname,employeeId);
		this.department=department;
		this.salary=salary;
	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeeBonus(int numberOfYearsWithCompany, int salary , String performance){
		int total=0;
		double bonusPercent=0;
		switch (performance){
			case "Best" :bonusPercent= 0.1;break;
			case "Average" :bonusPercent= 0.08;break;
			case "Below Average" :bonusPercent= 0.04;break;
			default:bonusPercent= 0;
		}
		total = (int) (12*(salary * bonusPercent))* numberOfYearsWithCompany;
		return total;
	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static int calculateEmployeePension(int salary){
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = "August,2014";//sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate ="August,2019";// sc.nextLine();
        joiningDate= DateConversion.convertDate(joiningDate);
        todaysDate = DateConversion.convertDate(todaysDate);
		int numbersOfYears = numbersOfYears(joiningDate,todaysDate);
        //implement numbers of year from above two dates

		//Calculate pension
		total=(int)(salary *(numbersOfYears*0.05));
		return total;
	}
	public static int numbersOfYears(String date1,String date2){
		int numbersOfYears=0;
		int joinYear=Integer.parseInt(date1.substring(date1.length()-4,date1.length()));
		int joinMonth = Integer.parseInt(date1.substring(0,date1.length()-5));
		System.out.println(joinYear+" ,"+ joinMonth);
		int todayYear=Integer.parseInt(date2.substring(date2.length()-4,date2.length()));
		int todayMonth = Integer.parseInt(date2.substring(0,date2.length()-5));
		System.out.println(todayYear+" ,"+ todayMonth);
		if(todayMonth<joinMonth) numbersOfYears=todayYear-joinYear -1;
		else numbersOfYears=todayYear-joinYear;
		return numbersOfYears;
	}

	@Override
	public int employeeId() {

		return super.getiD();
	}

	@Override
	public String employeeName() {
		return super.getName();
	}

	@Override
	public void assignDepartment() {
		Scanner inStr=new Scanner(System.in);
		System.out.print("Type in the Department name for the Employee please: ");
		department = inStr.next();
	}

	@Override
	public int calculateSalary() {
		Scanner inStr=new Scanner(System.in);
		System.out.print("Type in the Salary for the employee please: ");
		salary = inStr.nextInt();
		return salary;
	}

	@Override
	public void benefitLayout() {

	}

	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 7;
					break;
				case August:
					date = 8;
					break;
				case September:
					date = 9;
					break;
				case October:
					date = 10;
					break;
				case November:
					date = 11;
					break;
				case December:
					date = 12;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}

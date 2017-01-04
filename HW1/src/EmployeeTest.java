public class EmployeeTest {
public static void main (String[] args){
	Employee e_1 = new Employee("Lori", "NewGrove", 100.23);
	Employee e_2 = new Employee("Rose", "Rabbit", 400.65);
	
	System.out.printf(e_1.getFirstName() + " " + e_1.getLastName() + "\'s yearly salary is $" + e_1.getSalary() + ".\n");
	System.out.printf(e_2.getFirstName() + " " + e_2.getLastName() + "\'s yearly salary is $" + e_2.getSalary() + ". \n\n");
	
	System.out.println(e_1.getFirstName() + " " + e_1.getLastName() + "\'s yearly salary is $" + (e_1.getSalary()*1.1) + " with a 10% raise.\n");
	System.out.println(e_2.getFirstName() + " " + e_2.getLastName() + "\'s yearly salary is $" + (e_2.getSalary()*1.1) + " with a 10% raise. \n\n");
}
}

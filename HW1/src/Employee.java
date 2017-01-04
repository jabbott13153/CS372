
public class Employee {
	
		String FirstName = " ";
		String LastName = " ";
		double Salary = 0.0;

		public Employee(String Fn, String Ln, double S){
			setFirstName(Fn);
			setLastName(Ln);
			setSalary(S);
		}
		
		private void setSalary(double salary) 
		{
			if(Salary >= 0)
			{Salary = salary;}
		}
		public double getSalary() {return Salary;}
		
		private void setLastName(String lName){LastName = lName;}
		public String getLastName() {return LastName;}
		
		private void setFirstName(String fName){FirstName = fName;}
		public String getFirstName(){return FirstName;}
		
	}



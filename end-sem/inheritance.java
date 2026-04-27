class Employee{
	 String name;
	 long salary;
	Employee(String name,long salary){
		this.name=name;
		this.salary=salary;	
	}
}

class Manager extends Employee{
	Manager(String name, long salary){
		super(name,salary);
	}
	void displayRole(){
		System.out.println("Manager name: "+super.name);
		System.out.println("Manager salary: "+super.salary);
	}
	public static void main(String[] args){
		Manager m=new Manager("varad", 50000);
		m.displayRole();
	}
}

class Developer extends Employee{
	Developer(String name, long salary){
		super(name,salary);
	}
	void displayRole(){
		System.out.println(name);
	}
}
/*
class Main{
	public static void main(String[] args){
		Employee e=new Employee("varad",50000);
		e.displayRole();
	}
}
*/
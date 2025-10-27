
import java.util.*;
public class Main
{
	static  Scanner sc=new Scanner (System.in);
	static ArrayList<parttimeemployee> data1=new ArrayList<>();
	static ArrayList<fulltimeemployee> data2=new ArrayList<>();
	public static class employee {
		String name;
		int id;

		employee(String name,int id) {
			this.name=name;
			this.id=id;
		}

		public void display() {
			System.out.println("Name of employee : "+name);
			System.out.println("id of employee : "+id);
		}
	}
	public static class parttimeemployee extends employee {
		int hours;
		double salary;
		parttimeemployee(String name,int id,int hours,double salary) {
			super(name,id);
			this.hours=hours;
			this.salary=salary;
		}

		public void showsalary() {
			double res=hours*salary;
			System.out.println("Salary is : "+res);
		}
	}
	public static class fulltimeemployee extends employee {
		double salary;
		fulltimeemployee(String name,int id,double salary) {
			super(name,id);
			this.salary=salary;
		}

		public void showsalary() {
			System.out.println("Salary is : "+salary);
		}
	}
	public static void main(String[] args) {

		int z=1;
		while(z!=0) {
			System.out.println("Enter choice");
			System.out.println("1.parttimeemployee");
			System.out.println("2.fulltimeemployee");
			System.out.println("3.exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1-> {
					pte();
				}
			case 2-> fte();
			case 3 -> {
					System.out.println("thankyou");
					z=0;
					break;
				}
			}

		}

	}
	public static void pte() {
		int  z=1;
		while(z!=0) {
			System.out.println("Enter choice");
			System.out.println("1.add employee");
			System.out.println("2.view employeeand details");
			System.out.println("3.exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1-> {
					sc.nextLine();
					System.out.println("Enter name");
					String name=sc.nextLine();
					System.out.println("Enter id");
					int id=sc.nextInt();
					System.out.println("hours worked");
					int hours=sc.nextInt();
					System.out.println("salary per hour");
					double salary=sc.nextDouble();
					data1.add(new parttimeemployee(name,id,hours,salary));
					break;
				}
			case 2-> {
					for(int i=0; i<data1.size(); i++) {
						data1.get(i).display();
						data1.get(i).showsalary();
					}
				}
			case 3 -> {
					System.out.println("thankyou");
					z=0;
					break;
				}
			}

		}

	}
	public static void fte() {
		int  z=1;
		while(z!=0) {
			System.out.println("Enter choice");
			System.out.println("1.add employee");
			System.out.println("2.view employeeand details");
			System.out.println("3.exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1-> {
					sc.nextLine();
					System.out.println("Enter name");
					String name=sc.nextLine();
					System.out.println("Enter id");
					int id=sc.nextInt();
					System.out.println("salary");
					double salary=sc.nextDouble();
					data2.add(new fulltimeemployee(name,id,salary));
					break;
				}
			case 2-> {
					for(int i=0; i<data2.size(); i++) {
						data2.get(i).display();
						data2.get(i).showsalary();
					}
				}
			case 3 -> {
					System.out.println("thankyou");
					z=0;
					break;
				}
			}

		}

	}
}

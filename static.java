import java.util.*;
class student{
	static{
		System.out.println("hi....");
	}//this will run before main()
	String name;
	static int total;
	student(String Name){
		name=Name;
		total++;
	}
	public static void main(String args[]){
		String name;
		String sec,univName;
		int roll;
		Scanner in =new Scanner (System.in);
		System.out.println("enter the name of student");
		name=in.nextLine();
		
		student obj=new student(name);
		student obj1=new student(name);
		System.out.println(total);
	}
}

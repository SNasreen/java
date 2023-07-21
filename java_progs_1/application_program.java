 import java.util.*;
 class colleges
 {
	 void college()
	 {
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter college name");
		 String str=sc.nextLine();
		 System.out.println("\n");
	 }
 }
 class staffs extends colleges
 {
	 void staff()
	 {
		 System.out.println("Enter the Staff details");
		 Scanner sc1=new Scanner(System.in);
		 System.out.println("Enter department");
		 String str1=sc1.nextLine();
		 System.out.println("Enter the Staff id");
		 int id=sc1.nextInt();
		 System.out.println("enter the salary");
		 int sal=sc1.nextInt();
		 double gross=(int) sal*105;
		 System.out.println("the gross pay is: ");
		 System.out.println(gross);
		 System.out.println("\n");
	 }
 }
 class hods extends colleges
 {
	 void hod()
	 {
		 System.out.println("Enter the hod Details");
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("Enter department");
		 String str3=sc3.nextLine();
		 System.out.println("Enter the hod id");
		 int id=sc3.nextInt();
		 System.out.println("enter the salary");
		 int sal=sc3.nextInt();
		 double grosse=(int) sal*105;
		 System.out.println("the gross pay is: ");
		 System.out.println(grosse);
		 System.out.println("\n");
	 }
 }
 class students extends colleges
 {
	 void student()
	 {
		 System.out.println("Students details");
		 Scanner sc2=new Scanner(System.in);
		 System.out.println("Enter the Student id");
		 int id1=sc2.nextInt();
		 System.out.println("Enter department");
		 String str1=sc2.nextLine();
		 System.out.println("Enter the marks");
		 System.out.println("mark1");
		 int a=sc2.nextInt();
		 System.out.println("mark2");
		 int b=sc2.nextInt();
		 System.out.println("mark3");
		 int c=sc2.nextInt();
		 System.out.println("Average for 300 is: ");
		 int res=(a+b+c)/3;
		 System.out.println(res);
		 System.out.println("\n");
	 }
 }
 class application_program
 {
	 public static void main(String args[])
	 {
		 students obj=new students();
		 staffs ob=new staffs();
		 hods o=new hods();
		 obj.college();
		 o.hod();
		 ob.staff();
		 obj.student();
	 }
 }
	 
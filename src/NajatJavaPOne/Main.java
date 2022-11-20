package NajatJavaPOne;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.InputMismatchException;
import java.io.*;
public class Main {
	
	static void getHelpInstructions() {
		System.out.println(" -Press Number(0) to enter input. The way of (Array of object with object chaining)");
		System.out.println(" -Press Number(1) Read output Report.(Array of object with object chaining)");
		System.out.println(" -Press Number(2) to exit from program");
		System.out.println(" -Press Number(3) to enter input. The way of (one object from every class with object chaining)");
		System.out.println(" -Press Number(4) Read output Report.(One object from every class with object chaining)");
		System.out.println(" -Press Number(6) (Array List).");
		System.out.println(" -Press Number(7) to enter input (Stack). + to push data pushed from stack to file");
		System.out.println(" -Press Number(8) to read report history (Stack). + to read data which is pushed from file and display them as output in report.");
		System.out.println(" -Press Number(9) to enter input to print Duplicate Email and Unique Email. using (ArrayList and HashSet).");
		System.out.println(" -Press Number(10) to Calculate currency using HashMap.");
		System.out.println(" -Press Number(11) to Calculate multiplication factorial.");
		System.out.println(" -Press Number(12) to Calculate Fibonacci series.");
		System.out.println(" -Press Number(13) to enter input for (Inheritance) + display value using(toString) + check student age from studentAge method.");
		System.out.println(" -Press Number(14) to enter subject name, and display it. + created interface page + added in subject class implements interfaceName  ");
		System.out.println(" -Press Number(15) Finalizer/Deconstractor Method");
		System.out.println(" -Press Number(16) Factorial and Fibonacci Series using Solid Principle");
		System.out.println(" -Press Number(17) Relationship (Aggregation and Composition).");
		System.out.println(" -Press Number(18) Final keyword.");
		System.out.println(" - 2 attempts only to give mark value of Assignments, otherwise the mark will be zero");
	}
	
	static int factorial(int n) {
		if(n==1) { //base case
			return n;
		}else {
			return n * factorial(n-1);
		}
	}
	
	static int fibonacciSeries(int n) {
		if(n==0|n==1) {
			return n;
		}else {
			return fibonacciSeries(n-1)+ fibonacciSeries(n-2);
		}
	}

	public static void main(String[] args) throws Throwable {
		
Scanner s=new Scanner(System.in);
		
		//for Array of object
		School [] schoolObj=new School[2];
		Student [] stdObj=new Student[2];
		Subject [] subjObj=new Subject[2];
		Mark [] markObj=new Mark[2];
		
		// for one object
		School school1Obj=new School();
		Student std1Obj=new Student();
		Subject subj1Obj=new Subject();
		Mark mark1Obj=new Mark();
		
		Stack<String> theStack=new Stack<>();
		
		boolean isExit=true;
		boolean isFlagArrayList=true;
		boolean isFlagLogin=true;
		
		//Login using username and password:
		
		try {
		while(isFlagLogin) {
		String userName="najat";
		int password=123;
		
		System.out.println("Enter your user name: ");
		String myUserName=s.next();
		System.out.println("Enter your password: ");
		int myPassword=s.nextInt();
		
		if(userName.equals(myUserName) && password==myPassword) {
			System.out.println("Login Successfully!!");
			isFlagLogin=false;
		}else {
			System.out.println("Invalid user name or password!");
		}
		}
		}catch(InputMismatchException ee) {
			System.out.println("Error! Password can not be string. Run the program again!");
		}
		
		//place/location of file that you want to push data(object). exp: notepad.txt.
		
		FileOutputStream fileOut;
		ObjectOutputStream fout=null;
		
	try {
		fileOut=new FileOutputStream("C:\\Users\\Acer\\eclipse-workspace\\NajatJavaProjectOne\\stackDataOutput.txt");
		fout=new ObjectOutputStream(fileOut);
	}catch(IOException e1) {
		e1.printStackTrace();
	}
		//end..place of file and the way of how to push data from stack to file of notepad.txt
		
		System.out.println("***********************************");
		System.out.println("Welcome to School Management System");
		System.out.println("***********************************");
		
try {		
	do {
		System.out.println("Menu:");
		System.out.println("0:Enter input. using (Array of object with object chaining)");
		System.out.println("1:Read output Report (Array of object with object chaining)");
		System.out.println("2:Exit");
		System.out.println("3:Enter input. using (one object from every class with object chaining)"); // من كل كلاس كل معلومات في بروبرتي مال كل فاريبال مرة وحدة بس ندخل انبوت نشوف اوتبوت واحد
		System.out.println("4:Read output Report (one object from every class with object chaining)");// 1 school with students depend of user need.
		System.out.println("5:Help Instructions"); //Calling function (void)
		System.out.println("6:Array List");
		System.out.println("7:Stack. + Adding data to file of notepad.");
		System.out.println("8:Read report of stack history. (Read data from file of notepad and display here)");
		System.out.println("9:Enter input to print Duplicate Email and Unique Email. using (ArrayList for Duplicate and HashSet for Unique)");
		System.out.println("10:Calculate currency using HashMap");
		System.out.println("11:Multiplication factorial. using (Recurssion Method)");
		System.out.println("12:Fibonacci series. using (Recurssion Method)");
		System.out.println("13:Enter input for (Inheritance) using (parameter constructor with super keyword) for Student ");
		System.out.println("14:Enter subject name using (Interface) used class subject, and display it.");
		System.out.println("15:Finalizer/Deconstractor Method.");
		System.out.println("16:Factorial and fiboncci series using Solid Principle");
		System.out.println("17:Relationship (Aggregation and Composition)");
		System.out.println("18:Final keyword");
		
		System.out.println("*******************************");
		System.out.println("Enter a number from menu: ");
		int a=s.nextInt();
		
		switch(a) {
		case 0:{
			System.out.println("Enter inputs:-");
			for(int i=0;i<2;i++) 
			 {
				schoolObj[i]=new School();
				stdObj[i]=new Student();
				subjObj[i]=new Subject();
				markObj[i]=new Mark();
				
				System.out.println("Enter School id: ");
				schoolObj[i].setSchoolId(s.next());
				System.out.println("Enter School name: ");
				schoolObj[i].setSchoolName(s.next());
				System.out.println("Enter School location: ");
				schoolObj[i].setSchoolLocation(s.next());
				System.out.println("Enter name of student: ");
				stdObj[i].setStudentName(s.next());
				System.out.println("Enter no. subject: ");
				subjObj[i].setNoOfSubj(s.nextInt());
				System.out.println("Enter subject name: ");
				subjObj[i].setSubjectName(s.next());

				System.out.println("Enter mark of assignment 1: ");
				// 2 attempts only to give value of mark, otherwise the mark will be zero.
				if(markObj[i].setMarkOfAssignment1(s.nextInt())!=true) {
				System.out.println("please  enter number between 0 and 100 ");
				markObj[i].setMarkOfAssignment1(s.nextInt());
				}
				System.out.println("Enter mark of assignment 2: ");
				if(markObj[i].setMarkOfAssignment2(s.nextInt())!=true) {
				System.out.println("please  enter number between 0 and 100 ");
				markObj[i].setMarkOfAssignment1(s.nextInt());
				}
				
				System.out.println("*******************************");
			}
			break;
		}case 1:{
			System.out.println("Read output Report:-");
			for(int i=0;i<2;i++)
			{
				System.out.println("school id is: "+schoolObj[i].getSchoolId());
				System.out.println("school name is: "+schoolObj[i].getSchoolName());
				System.out.println("school location is: "+schoolObj[i].getSchoolLocation());
				System.out.println("student name is: "+stdObj[i].getStudentName());
				System.out.println("student subject name is: "+subjObj[i].getSubjectName());
				System.out.println("student mark assignment 1 is: "+markObj[i].getMarkOfAssignment1());
				System.out.println("student mark assignment 2 is: "+markObj[i].getMarkOfAssignment2());
				System.out.println("*******************************");
			}
			break;
		}case 2:{
			isExit=false;
			break;
		}case 3:{
			System.out.println("Enter input:-");
			
		/*	School school1Obj=new School();
			Student std1Obj=new Student();
			Subject subj1Obj=new Subject();
			Mark mark1Obj=new Mark(); */
			
			System.out.println("enter school id: ");
			school1Obj.setSchoolId(s.next());
			System.out.println("enter school name: ");
			school1Obj.setSchoolName(s.next());
			System.out.println("enter school location: ");
			school1Obj.setSchoolLocation(s.next());
			System.out.println("enter student name:");
			std1Obj.setStudentName(s.next());
			System.out.println("enter No. of subject:");
			subj1Obj.setNoOfSubj(s.nextInt());
			System.out.println("enter subject name:");
			subj1Obj.setSubjectName(s.next());
			
			// 2 attempts only otherwise the mark will be zero.
			System.out.println("enter mark for assignment 1:");
			if(mark1Obj.setMarkOfAssignment1(s.nextInt())!=true) {
				System.out.println("please enter mark between 0 to 100");
				mark1Obj.setMarkOfAssignment1(s.nextInt());
			}
			System.out.println("enter mark for assignment 2:");
			if(mark1Obj.setMarkOfAssignment2(s.nextInt())!=true) {
				System.out.println("please enter mark between 0 to 100");
				mark1Obj.setMarkOfAssignment2(s.nextInt());
			}
			
			//object chaining for one object
			(std1Obj).setSubject(subj1Obj);
			(subj1Obj).setMark(mark1Obj);
			
			System.out.println("*******************************");
			
			break;
		}case 4:{
			System.out.println("Read output Report:-");
			
			System.out.println("school name: "+school1Obj.getSchoolId());
			System.out.println("school name: "+school1Obj.getSchoolName());
			System.out.println("school name: "+school1Obj.getSchoolLocation());
			System.out.println("student name: "+std1Obj.getStudentName());
			System.out.println("subject name: "+subj1Obj.getNoOfSubj());
			System.out.println("subject name: "+subj1Obj.getSubjectName());
			System.out.println("mark of assignment 1: "+mark1Obj.getMarkOfAssignment1());
			System.out.println("mark of assignment 2: "+mark1Obj.getMarkOfAssignment2());
			System.out.println("*******************************");
		
			break;
		}case 5:{
			System.out.println("Help Instructions:-");
			getHelpInstructions();
			System.out.println("*******************************");
			break;
		}case 6:{
			System.out.println("Array List:-");
			
			//Array List. 1 school and student depend of user need
			ArrayList<School> theSchool=new ArrayList<>();
			
			School school2Obj=new School();
			
			System.out.println("Enter school id: ");
			school2Obj.setSchoolId(s.next());
			theSchool.add(school2Obj);

			System.out.println("Enter school name: ");
			school2Obj.setSchoolName(s.next());
			theSchool.add(school2Obj);
			
			System.out.println("Enter school location: ");
			school2Obj.setSchoolLocation(s.next());
			theSchool.add(school2Obj);
			
			ArrayList<Student> theStud=new ArrayList<>();
			ArrayList<Subject> theSubj=new ArrayList<>();
			ArrayList<Mark> theMark=new ArrayList<>();
			
			while(isFlagArrayList) {
				
			Student stud2Obj=new Student();
			Subject subj2Obj=new Subject();
			Mark mark2Obj=new Mark();

			System.out.println("Enter student name: ");
			stud2Obj.setStudentName(s.next());
			
			System.out.println("Enter student gender: ");
			stud2Obj.setStudentGender(s.next());
			theStud.add(stud2Obj);
			
			System.out.println("Enter Subject name: ");
			subj2Obj.setSubjectName(s.next());
			theSubj.add(subj2Obj);
			
			System.out.println("Enter Assignment1 Mark: ");
			mark2Obj.setMarkOfAssignment1(s.nextInt());
			
			System.out.println("Enter Assignment2 Mark: ");
			mark2Obj.setMarkOfAssignment2(s.nextInt());
			theMark.add(mark2Obj);
			
			System.out.println("0:press 0 to continue enter student details.\n1:press 1 to exit and print array list of students");
			int inputFlag=s.nextInt();
			if(inputFlag==1) {
				isFlagArrayList=false;
			}
			//school2Obj.setTheStudArrayList(theStud);
			}
			System.out.println("Array List (School)");
			
			System.out.println("School Id: "+ school2Obj.getSchoolId());
			System.out.println("School Name: "+ school2Obj.getSchoolName());
			System.out.println("School Location: "+ school2Obj.getSchoolLocation());
			System.out.println("*******************************");
			
			System.out.println("Array List (Student)");
			for(Student stu:theStud) {
				System.out.println("Student name List: "+ stu.getStudentName());
				System.out.println("Student gender List: "+ stu.getStudentGender());
				}
			System.out.println("*******************************");
			
			System.out.println("Array List (Subject)");
			for(Subject sub:theSubj) {
				System.out.println("Subject name List: "+ sub.getSubjectName());
				}
			System.out.println("*******************************");
			
			System.out.println("Array List (Mark)");
			for(Mark mrk:theMark) {
				System.out.println("Mark Assignment 1 List: "+ mrk.getMarkOfAssignment1());
				System.out.println("Mark Assignment 2 List: "+ mrk.getMarkOfAssignment2());
				}
			System.out.println("*******************************");	
			
			break;
		}case 7:{
			System.out.println("Push data into stack. used all classes properties:-");
			
		//	Stack<String> theStack=new Stack<>();
			
			System.out.println("Enter School id: ");
			String schoolId=s.next();
			theStack.push(schoolId);
			
			System.out.println("Enter School name: ");
			String schoolName=s.next();
			theStack.push(schoolName);
			
			System.out.println("Enter School location: ");
			String schoolLocation=s.next();
			theStack.push(schoolLocation);
			
			System.out.println("Enter Student name: ");
			String studentName=s.next();
			theStack.push(studentName);
			
			System.out.println("Enter Student gender: ");
			String studentGender=s.next();
			theStack.push(studentGender);
			
			System.out.println("Enter No. of Subject: ");
			String noOfSubject=s.next();
			int noOfSubj=Integer.parseInt(noOfSubject);
			theStack.push(noOfSubject);
			
			System.out.println("Enter Subject Name: ");
			String subjectName=s.next();
			theStack.push(subjectName);
			
			System.out.println("Enter mark of assignment 1: ");
			String markOfAssignment1=s.next();
			int markOfAsigt1=Integer.parseInt(markOfAssignment1);
			theStack.push(markOfAssignment1);
			
			System.out.println("Enter mark of assignment 2: ");
			String markOfAssignment2=s.next();
			int markOfAsigt2=Integer.parseInt(markOfAssignment2);
			theStack.push(markOfAssignment2);
			
			//to write data that pushed into stack to file of notepad.txt
			fout.writeObject(theStack);
			//end..to write data(object) that pushed into stack to file of notepad.txt
			System.out.println("*******************************");
			
			break;
		}case 8:{
			System.out.println("Read report for stack history:-");
			
			//Printing the data pushed into stack:
		//	System.out.println("data pushed (stack)= "+theStack);
			
			//Reading data(object) from file of notepad.txt and display the result of stack here
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\Acer\\eclipse-workspace\\NajatJavaProjectOne\\stackDataOutput.txt"));
			Stack stackObj=(Stack) in.readObject();
			System.out.println(stackObj);
			in.close();
			
			while(!theStack.isEmpty()) {
				System.out.println("Pop: (stack)= "+theStack.pop());
			}
			System.out.println("*******************************");
			break;
		}case 9:{
			System.out.println("Enter input to print Duplicate Email and Unique Email. using (ArrayList and HashSet):-");
			
			ArrayList<String> theDuplicateEmail= new ArrayList<>();
			Set<String> theUniqueEmail= new HashSet<>();
			
			boolean isFlagEmail=true;
			
			while(isFlagEmail) {
			System.out.println("Enter Email:");
			String dEmail=s.next();
			theDuplicateEmail.add(dEmail);
			
			System.out.println("O:Press zero (0) to continue enter email. \n 1:Press one (1) to exit.");
			int inputFlagEmail=s.nextInt();
			if(inputFlagEmail==1) {
				isFlagEmail=false;
			}
			}
			
			for(String dEmail:theDuplicateEmail) {
				if(theUniqueEmail.add(dEmail)==false) {
					System.out.println("Print duplicate email= "+ dEmail);
				}else {
					System.out.println("Unique email= "+ dEmail);
				}
			}
			System.out.println("*******************************");
			break;
		}case 10:{
			System.out.println("Enter input to Calculate Currency. using (HashMap):-");
			
			/*We put one hashmap inside while loop and one outside, because we want only one currency
			  printed depend of the user chose. but if we put 2 hashmaps outside while loop, will print 
			  all currencies which we entered to all student.
			 */
			
			//Map<String,Double> theCurrency = new HashMap<>();
			Map<String, Map<String,Double>> theCalculationCurrency= new HashMap <>();
			
			String currency="OMR";
			double calculate=1.0;
			boolean isFlagCurrency=true;
			
			while(isFlagCurrency) {
				
				Map<String,Double> theCurrency = new HashMap<>();
				
			System.out.println("Enter student name:");
			 String studentName=s.next();
			
			System.out.println("Enter one of these currencies (OMR,USD,THB,MVR):");
			String inputCurrency=s.next();
			
			System.out.println("Enter Amount of "+inputCurrency+" to covert it to Rial Omani:");
			double amount=s.nextDouble();
			
			if(inputCurrency.equals("OMR")) {
				currency="OMR";
				calculate=amount;
			}else if(inputCurrency.equals("USD")) {
				currency="USD";
				calculate=amount * 0.384983;
			}else if(inputCurrency.equals("THB")) {
				currency="THB";
				calculate=amount * 0.0101217;
			}else if(inputCurrency.equals("MVR")){
				currency="MVR";
				calculate=amount * 0.0249974;
			}else {
				System.out.println("It is not an option. Try again and choose one of these currencies (OMR,USD,THB,MVR) Only");
			}
			
			theCurrency.put(currency, calculate);
			theCalculationCurrency.put(studentName, theCurrency);
			
			System.out.println("0:Press zero(0) to continue enter currencies. \n 1:Press one (1) to exit. ");
			int inputNewCurrency=s.nextInt();
			if(inputNewCurrency==1) {
				isFlagCurrency=false;
			}
			}
			System.out.println(theCalculationCurrency);
			
			break;
		}case 11:{
			System.out.println("Multiplication factorial:-");
			
			System.out.println("Enter a number to calculate factorial: ");
			int f=s.nextInt();
			
			System.out.println("factorial= "+ factorial(f));
			System.out.println("*******************************");
			break;
		}case 12:{
			System.out.println("Fibonacci series:-");
			
			System.out.println("Enter a number to get the result of fibonacci series:-");
			int fib=s.nextInt();
			System.out.println("fibonacci Series= "+fibonacciSeries(fib));
			System.out.println("*******************************");
			break;
		}case 13:{
			System.out.println("Inheritance.. class student(OlderStudent,ChildStudent):-");
			
			System.out.println("Enter student name: ");
			String stdName=s.next();
			System.out.println("Enter student gender: ");
			String stdGender=s.next();
			System.out.println("Enter student age: ");
			int stdAge=s.nextInt();
			
			//define object for inheritance 
			Student stdObjIheritance=new Student(stdName,stdGender,stdAge);
			System.out.println(stdObjIheritance.toString());
			/* to check age from studentAge method and print output
			   as System.output.println(".......");
			 */
			stdObjIheritance.studentAge(stdAge);
			
			break;
		}case 14:{
			System.out.println("Interface:-");
			System.out.println("Enter subject name: ");
			String subjName=s.next();
			
			Subject subjObjInterface=new Subject();
			subjObjInterface.subjectInterfacee(subjName);
			System.out.println("*******************************");
			break;
		}case 15:{
			System.out.println("Finalizer/Deconstructor Method:-");
			
			School schoolObjFinalizer= new School();
			Student studentObjFinalizer= new Student();
			Subject subjectObjFinalizer= new Subject();
			Mark markObjFinalizer= new Mark();
			
			schoolObjFinalizer.finalize();
			studentObjFinalizer.finalize();
			subjectObjFinalizer.finalize();
			markObjFinalizer.finalize();
			System.out.println("*******************************");
			break;
		}case 16:{
			System.out.println("Factorial and Fibonacci using Solid Principle:-");
            //should create new page/class for Factorial and fibonacci
			
			Factorial factorialObj=new Factorial();
		//	FibonacciSeries fibonacciObj=new FibonacciSeries();
			
			System.out.println("Enter a number for Factorial:");
			int factorialNo=s.nextInt();
			
			System.out.println("Enter a number for Fibonacci series:");
			int fibo=s.nextInt();
			
			// both way are correct for Solid principle using define object or className.
			System.out.println("factorial= "+factorialObj.factorial(factorialNo));
			System.out.println("fibonacci series= "+FibonacciSeries.fibonacciSeries(fibo));
			System.out.println("*******************************");
			break;
		}case 17:{
System.out.println("Relationship (Aggregation and Composition):-");
			
			Department dept=new Department(18891,"IT");
			Employee Teacher=new Employee("16j1514216", 1300.5, "Najateez","Salim","Alkhatri","female","8th/june/1996",dept);
			Employee schoolSecurityGuard=new Employee("436kk2", 320.5, "Jhony","rajan","shareef","male","18th/April/1990",dept);
			
			System.out.println(Teacher.toString());
			System.out.println(schoolSecurityGuard.toString());
			System.out.println("*******************************");
			break;
		}case 18:{
            System.out.println("Final keyword:-");
			
			Admin adminFinal=new Admin(435,"AlKhatria","Najatooh","AlkhatriNajateez",98871234, "female");
			System.out.println(adminFinal.toString());
			System.out.println("*******************************");
			break;
		}default:{
			System.out.println("It is not an option,try again and enter a number from menu above.");
			System.out.println("*******************************");
			break;
		}
	  }
	}while(isExit);
	
	
	}catch(Exception e) {
		System.out.println("Error !!!!!!");
	}
	}
	

}

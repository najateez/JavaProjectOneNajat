package NajatJavaPOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {


	//Access modifiers (protected) used, because of inheritance.
	
	protected String studentName;
	protected String studentGender;
	protected int studentAge;
	
	protected Subject subject;
	
	Subject [] subjObj=new Subject[2];
	
	ArrayList<Subject> theSubj;
	
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	
	public void setStudentGender(String studentGender) {
		this.studentGender=studentGender;
	}
	
  public String getStudentName() {
		return studentName;
	}
  
  public String getStudentGender() {
		return studentGender;
	}
  
  
//for one object
  public void setSubject(Subject subject) {
		this.subject=subject;
	}
	
public Subject getSubject() {
		return subject;
	}

// for Array List
public void setTheSubjArrayList(ArrayList<Subject> theSubj) {
	this.theSubj=theSubj;
}

public ArrayList<Subject> getTheSubjArrayList(){
	return theSubj;
}

/* for Inheritance i add student age for(OlderStudent,ChildStudent) + i will use constructor +
   create Student Age METHOD + used toString to display values of properties.
*/
public void setStudentAge(int studentAge) {
	this.studentAge=studentAge;
}

public int getStudentAge() {
	return studentAge;
}

public Student(String studentName,String studentGender,int studentAge) {
	this.studentName=studentName;
	this.studentGender=studentGender;
	this.studentAge=studentAge;
}

@Override
public String toString() {
	return "Student [studentName=" + studentName + ", studentGender=" + studentGender + ", studentAge=" + studentAge
			+ "]";
}

public void studentAge(int stdAge) {
	if(stdAge >= 12 && stdAge <= 18) {
		System.out.println("You are older student");
	}else if(stdAge <= 11 && stdAge >= 5) {
		System.out.println("you are child student");
	}else {
		System.out.println("you are not school student");
	}
}

/* the benefit of this, in page (Main.java) in case 2 , i did object for one student. so 
   because of define object of it no parameter and for inheritance need parameter because of 
   parameter constructor used, so we need to write:
   public NameofClass/Student(){
   super();
   }
   to remove errors appear in program.
   and all program work fine.
 */
public Student() {
	super();
}

//for finalizer method:-

	protected void finalize() throws Throwable
	{
		try {
			System.out.println("Student has been finalized successfully");
		}catch(Throwable e) {
			throw e;
		}finally {
			super.finalize();
		}
	}



}




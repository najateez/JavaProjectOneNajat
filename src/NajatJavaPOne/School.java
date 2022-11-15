package NajatJavaPOne;

import java.util.ArrayList;
import java.util.List;

public class School {

	private	String schoolId;	
	private	String schoolName;
	private	String schoolLocation;
	private Student student;

		Student [] stdObj=new Student[2];
		
		ArrayList<Student> theStud;
		
		//for Array of object
	  public void setSchoolName(String schoolName) {
			this.schoolName=schoolName;
		}
		
	  public void setSchoolId(String schoolId) {
			this.schoolId=schoolId;
		}
		
	  public void setSchoolLocation(String schoolLocation) {
			this.schoolLocation=schoolLocation;
		}
		
	  public String getSchoolName() {
			return schoolName;
		}
	  
	  public String getSchoolId() {
			return schoolId;
		}
	  
	  public String getSchoolLocation() {
			return schoolLocation;
		}
	  
	  //for one object
	  public void setStudent(Student student) {
			this.student=student;
		}
		
	public Student getStudent() {
			return student;
		}

	//for ArrayList

	public void setTheStudArrayList(ArrayList<Student> theStud) {
		this.theStud=theStud;
	}

	public ArrayList<Student> getTheStudArrayList(){
		return theStud;
	}
	
	
	// for finalizer method:-
	
	protected void finalize() throws Throwable
	{
		try {
			System.out.println("School has been finalized successfully");
		}catch(Throwable e) {
			throw e;
		}finally {
			super.finalize();
		}
	}

	}



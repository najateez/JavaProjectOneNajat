package NajatJavaPOne;

import java.util.ArrayList;
import java.util.List;

//for class subject interface
public class Subject implements SubjectInterface{

	private	int noOfSubj;
	private	String subjectName;
	private Mark mark;
	
	Mark [] markjObj=new Mark[2];
	
	ArrayList<Mark> theMark;
	
	public void setNoOfSubj(int noOfSubj) {
		this.noOfSubj=noOfSubj;
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName=subjectName;
	}
	
  public int getNoOfSubj() {
		return noOfSubj;
	}
  
  public String getSubjectName() {
		return subjectName;
	}
  
//for one object
  public void setMark(Mark mark) {
		this.mark=mark;
	}
	
public Mark getMark() {
		return mark;
	}

//for Array List
public void setTheMarkArrayList(ArrayList<Mark> theMark) {
	this.theMark=theMark;
}

public ArrayList<Mark> getTheSubjArrayList(){
	return theMark;
}


// for interface (class subject).. 

public void subjectInterfacee(String subjectName) {
	
	System.out.println("print interface for subjact= "+ subjectName);
	
}


//for finalizer method:-

	protected void finalize() throws Throwable
	{
		try {
			System.out.println("Subject has been finalized successfully");
		}catch(Throwable e) {
			throw e;
		}finally {
			super.finalize();
		}
	}


}



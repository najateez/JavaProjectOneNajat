package NajatJavaPOne;

public class Mark {

	private	int markOfAssignment1;
	private	int markOfAssignment2;
	
	
	public boolean setMarkOfAssignment1(int markOfAssignment1) {
		if(markOfAssignment1>0 && markOfAssignment1<100) {
		this.markOfAssignment1=markOfAssignment1;
		return true;
		}else {
			return false;
		}
	}
	
	public boolean setMarkOfAssignment2(int markOfAssignment2) {
		if(markOfAssignment2>0 && markOfAssignment2<100) {
		this.markOfAssignment2=markOfAssignment2;
		return true;
	}else {
		return false;
	}
}
	
	 public int getMarkOfAssignment1() {
			return markOfAssignment1;
		}
	 
	 public int getMarkOfAssignment2() {
			return markOfAssignment2;
		}

}




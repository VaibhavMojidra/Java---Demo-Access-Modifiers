import Pkg.Human;

public class Employee extends Human{
	protected int rollNo=101;

	protected int getRollNo() {
		return rollNo;
	}

	protected void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	protected String getName() {
		return super.getName();
	}
}

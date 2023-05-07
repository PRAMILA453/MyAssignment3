package week3.Assignment4;

//METHOD OVER LOADING

public class Students {
	public void getStudentInfo() {
		System.out.println("Student details:");
	}
	public void getStudentInfo(String Name,int id) {
		System.out.println(Name + id);
	}
	public void getStudentInfo(String Email,long PhoneNumber) {
          System.out.println(Email + PhoneNumber);
	}

	
	public static void main(String[] args) {
		Students stu= new Students();
		stu.getStudentInfo("pramila", 7116);
		stu.getStudentInfo("pramilathangaraj453@gmail.com", 8883891231l);
	}
	
}

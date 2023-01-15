package department.inheritance;


public class GetStudentInfo {
	public void getStudentInfo(int id,String name) {
		System.out.println("The Student ID is: " +id);
		System.out.println("The Student NAME is: " +name);
	}
	public void getStudentInfo(long phonenum,String email) {
		System.out.println("The Student PhoneNumber is: " +phonenum);
		System.out.println("The Student Email is: " +email);
	}
	public void getStudentInfo(float percentage,String result) {
		System.out.println("The Student Percentage is: " +percentage);
		System.out.println("The Student Result is: " +result);
	}
	
	
	public static void main(String[] args) {
		GetStudentInfo get=new GetStudentInfo();
		get.getStudentInfo(4116, "Deivanai");
		get.getStudentInfo(91092199 , "deiva115@gmail.com");
		get.getStudentInfo(89.1f, "Pass with First Class");
}
}
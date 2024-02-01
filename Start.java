package jdbc;
import java.io.*;
import java.sql.*;
import com.student.manage.Student;
import com.student.manage.StudentDao;
public class Start {

	public static void main(String[] args)throws IOException {
		System.out.println("Welcome to Student Management App");
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		while(true) {
			System.out.println("press 1 to Add student");	
			System.out.println("press 2 to delete student");
			System.out.println("Press 3 to display student");
			System.out.println("Press 4 to exit app");
			
			int choice = Integer.parseInt(br.readLine());
			
			if(choice ==1 ) {
				//add...
				System.out.println("Enter student name");
				String name = br.readLine();
				
				System.out.println("Enter student Phone");
				String phone = br.readLine();
				//create student object
				Student st = new Student(name, phone) ;
				boolean answer = StudentDao.insertStudentToDB(st);
				if(answer) {
					System.out.println("Successfully added");
				}else {
					System.out.println("Something went wrong");
				}
				System.out.println(st);
			}else if(choice == 2) {
				//delete....
				System.out.println("Enter user id to remove");
				int userid = Integer.parseInt(br.readLine());
				boolean f = StudentDao.deleteStudent(userid);
				if(f) {
					System.out.println("Successfully deleted");
				}else {
					System.out.println("Something went wrong");
				}
				
			}else if(choice ==3 ) {
				//display
				StudentDao.displayStudent();
				
			}else {
				//exit app
				break;
			}
			
		}
		System.out.println("Thank you for using my application");
		System.out.println("See you again....");

	}

	

}

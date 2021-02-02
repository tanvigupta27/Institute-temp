package Management;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Institute will return total number of students
 * @author TG086294
 *
 */

public class Institute {
	private static Logger logger = LogManager.getLogger();
	String institute_name;
	List<Department>departments;
	/** 
	 * Institute class constructor
	 * @param institute_name
	 * @param departments
	 */
	Institute(String institute_name, List<Department>departments)
	{
		this.institute_name = institute_name;
		this.departments = departments;
	}
	
	/**
	 * Return count of students
	 * @return
	 */
	public int totalStudent() throws NullPointerException
	{
		logger.info("totalStudent function to get the total number of students.");
		int count = 0;
		List<Student> student_count ;

		for(Department dept : departments)
		{
			student_count = dept.getStudent();
			if(student_count==null) {
					throw new NullPointerException("No student found");
			}
			for(Student st : student_count)
				count++;
		}
		return count;
	}
}
/**
 * Department contains all the students 
 * getStudent() returns the list of students 
 * @author TG086294
 *
 */
class Department {
	private static Logger logger = LogManager.getLogger();
	String department_name;
	List<Student>students;
	/**
	 * Department class constructor 
	 * @param department_name
	 * @param students
	 */
	Department(String department_name, List<Student>students)
	{
		this.department_name = department_name;
		this.students = students;
	}
	
	List<Student> getStudent()
	{
		logger.info("getStudnet function will return the list of students");
		return students;
	}
}

class Student {
	
	String name;
	int id;
	String Dept;
	int age;
	/**
	 * Student Class constructor
	 * @param id
	 * @param name
	 * @param age
	 * @param dept
	 */
	Student(int id, String name, int age, String dept)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.Dept = dept;
	}
	
}







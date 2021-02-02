package Management;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InstituteTest {
	private static Logger logger = LogManager.getLogger();

/**
 * Happy flow test
 */
	@Test
	void test() {
		/**
		 * Student object
		 * Student array list 
		 */
		logger.info("Student Object");
		Student s1 = new Student(1001,"Tanvi Gupta", 20, "MCA");
		Student s2 = new Student(1002,"Arpit Bansal", 20, "MCA");
		Student s3 = new Student(1003,"Viren Vyas", 20, "CSE");
		Student s4 = new Student(1004,"Sakshi Gupta", 20, "CSE");
		Student s5 = new Student(1005,"Nisha Sharma", 20, "ECE");
		Student s6 = new Student(1006,"Ekta Koolwal", 20, "ECE");
		Student s7 = new Student(1007,"Shefali Goyal", 20, "ME");
		Student s8 = new Student(1008,"Ankur Garg", 20, "ME");
		List<Student> mca = new ArrayList<Student>();
		List<Student> cse = new ArrayList<Student>();
		List<Student> ece = new ArrayList<Student>();
		List<Student> me = new ArrayList<Student>();
		mca.add(s1);
		mca.add(s2);
		cse.add(s3);
		cse.add(s4);
		ece.add(s5);
		ece.add(s6);
		me.add(s7);
		me.add(s8);
		/**
		 * Department object
		 */
		logger.info("Department Object");
		Department MCA = new Department("MCA",mca);
		Department CSE = new Department("CSE", cse);
		Department ECE = new Department("ECE", ece);
		Department ME = new Department("ME",me);
		
		List<Department> dept_count = new ArrayList<Department>();
		dept_count.add(MCA);
		dept_count.add(CSE);
		dept_count.add(ECE);
		dept_count.add(ME);
		/**
		 * Institute object
		 */
		logger.info("Institute Object");
		Institute institute = new Institute("NIT Jamshedpur",dept_count);
		assertEquals(8, institute.totalStudent());
		
	}
	
	@Test
	void Failure()
	{
		 List<Student> MCA_students = null;
	        Department MCA = new Department("MCA",MCA_students);

	        List<Department> dept = new ArrayList<Department>();
	        dept.add(MCA);

	        Institute institute = new Institute("NIT", dept);
//	        assertEquals(institute.totalStudent(), 0);
	        assertThrows(NullPointerException.class,() -> institute.totalStudent(),
	        		"No student found");	
	 }
}

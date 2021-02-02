package Management;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Student> MCA_students = new ArrayList<Student>();
        Department MCA = new Department("MCA",null);

        List<Department> dept = new ArrayList<Department>();
        dept.add(MCA);

        Institute institute = new Institute("NIT", dept);
        try {
        	institute.totalStudent();
        }catch(NullPointerException e) {
        	System.out.println(e.getMessage());
        }
        

	}

}

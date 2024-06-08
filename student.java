package jDBC;
import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext; 
public class student {
	private int id;
	private String name;
	private String email;
	public void (String name, int id, string email) {
	      this.name= name;
	      this.id = id;
	      this.email = email;
	  ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	  Student student = context.getBean("student", Student.class); 
	  student.displayStudentInfo(); 
	  } 
	}
}
	public String name()
		return name;
  }
	

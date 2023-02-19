package placement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class placement {

	
	private Integer st_id;
	private String st_name;
	private String st_course;
	private int st_grad_date;
	private String st_skill;
	
	
	
	public placement()
	{
		super();
	}
	public placement(Integer st_id, String st_name, String st_course, int st_grad_date, String st_skill) {
		super();
		this.st_id = st_id;
		this.st_name = st_name;
		this.st_course = st_course;
		this.st_grad_date = st_grad_date;
		this.st_skill = st_skill;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getSt_id() {
		return st_id;
	}
	public void setSt_id(Integer st_id) {
		this.st_id = st_id;
	}
	public String getSt_name() {
		return st_name;
	}
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}
	public String getSt_course() {
		return st_course;
	}
	public void setSt_course(String st_course) {
		this.st_course = st_course;
	}
	public int getSt_grad_date() {
		return st_grad_date;
	}
	public void setSt_grad_date(int st_grad_date) {
		this.st_grad_date = st_grad_date;
	}
	public String getSt_skill() {
		return st_skill;
	}
	public void setSt_skill(String st_skill) {
		this.st_skill = st_skill;
	}
	@Override
	public String toString() {
		return "placement [st_id=" + st_id + ", st_name=" + st_name + ", st_course=" + st_course + ", st_grad_date="
				+ st_grad_date + ", st_skill=" + st_skill + "]";
	}
	

	}



package Class_Per_Table_Inheritance;



import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="manager1")
public class Manager extends Emp {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String deptname;

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
}
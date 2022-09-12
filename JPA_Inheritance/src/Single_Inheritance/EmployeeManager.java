package Single_Inheritance;




import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeManager {

	public static void main(String[] args) {
		try
		{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
				
		Emp e1=new Emp();
		e1.setEmpid(22);
		e1.setName("Sanika");
		e1.setSalary(36000);
		em.getTransaction().begin();
		em.persist(e1);
		em.getTransaction().commit();
		System.out.println("Employee record added in database....");
	
		Manager m1=new Manager();
		m1.setEmpid(20);
		m1.setName("Isha");
		m1.setSalary(88000);
		m1.setDeptname("Purchase");
		em.getTransaction().begin();
		em.persist(m1);
		em.getTransaction().commit();
		System.out.println("Manager record added in database....");
		}
		catch(Exception e)
		{
			System.out.println("Error..."+e.getMessage());
		}
	}

}

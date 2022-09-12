package Join_Table_Inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeManager {

	public static void main(String[] args) 
	{
		try
		{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		Emp e1=new Emp();
		e1.setEmpid(14);
		e1.setName("Abraar");
		e1.setSalary(35000);
		em.getTransaction().begin();
		em.persist(e1);
		em.getTransaction().commit();
		System.out.println("Employee record added in database....");
		
		Mgr m1=new Mgr();
		m1.setEmpid(18);
		m1.setName("Sara");
		m1.setSalary(70000);
		m1.setDeptname("Computer");
		em.getTransaction().begin();
		em.persist(m1);
		em.getTransaction().commit();
		System.out.println("Manager record added in database....");
		}
		catch(Exception e)
		{
			System.out.println("Error.."+e.getMessage());
		}

	}

}

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import demo.Emp;
import demo.PermEmp;
import demo.TempEmp;
import util.HibernateUtil;


public class InheritanceMappingClient {
	public static SessionFactory sf =  HibernateUtil.getSessionfactory();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insert();
		list();
			sf.close();
	}
	public static void insert(){
		
		Session session = null;
		Transaction tx = null;
		try {
			session = sf.openSession();
			tx = session.beginTransaction();
			Emp e =new Emp();
			e.setEmpno(01);
			e.setEname("First,Emp" );
			e.setSalary(10000);
			session.save(e);
			
			PermEmp permemp = new PermEmp();
			permemp.setEmpno(02);
			permemp.setEname("Second Perm" );
			permemp.setSalary(20000);
			permemp.setHra("Hra02");
			permemp.setDa("da02" );
			session.save(permemp);
			
			TempEmp tempemp = new TempEmp();
			tempemp.setEmpno(03);
			tempemp.setEname("Second Temp" );
			tempemp.setSalary(30000);
			tempemp.setOutcomp("MyComp" );
			
			session.save(tempemp);
			
			tx.commit();
			
		} catch (Exception e) {
			tx.rollback();
			System.out.println("Exception " + e);
		} finally {
			session.close();
		}
	}
	public static void list() {
		Session session = null;
		try {
			session = sf.openSession();
			Query<Emp> query  =session.createQuery("select e from Emp e");
		
			List<Emp> list = query.list();
			for (Emp emp : list) {
				System.out.println(emp);
			}
		} catch (Exception e) {

			System.out.println("Exception " + e);
		} finally {
			session.close();
		}
	}
	
}

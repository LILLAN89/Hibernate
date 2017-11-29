



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;





public class Main {
public static void main(String[] args) {
	SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
	 
	Session session = sessionFactory.openSession();
	Transaction tr = session.beginTransaction();
	Usuario user = new Usuario();
	user.setNombre("Mario");
	user.setCel("66889944");
	user.setContrasenia("12345");
	user.setCorreo("mario@mail.com");
	session.save(user);
	tr.commit();
	System.out.println("Se guardó satisfactoriamente");
	sessionFactory.close();
}
}

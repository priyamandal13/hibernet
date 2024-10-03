package in.co.rays.crud;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.rays.user.UserDTO;

public class TestSave {

	public static void main(String[] args) {

		UserDTO dto = new UserDTO();
		dto.setFirstName("aman");
		dto.setLastName("yadav");
		dto.setLoginId("aman@gmail.com");
		dto.setPassword("1232");
		dto.setDob(new Date());
		dto.setAddress("Indore");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(dto);

		tx.commit();

		session.close();

	}

}

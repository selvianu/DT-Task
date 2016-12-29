package test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.bean.Order;
import com.niit.config.AppConfig;
import com.niit.dao.impl.OrderDAO;

public class TestOrdersDAO {

	public static void main(String[] args) {
		
		ApplicationContext apx = new AnnotationConfigApplicationContext(AppConfig.class);
		OrderDAO orderDAO = apx.getBean(OrderDAO.class);
		List<Order> list = orderDAO.list();
		for (Order order : list) {
			System.out.println(order);
		}
		
	}
}

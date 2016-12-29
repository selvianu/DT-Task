package com.niit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages="com.niit")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages="com.niit")
public class AppConfig {

	/*@Bean
	public DataSource getDataSource1()
	{
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("org.h2.Driver");
		ds.setUrl("jdbc:h2:tcp://localhost/~/test");
		ds.setUsername("sa");
		ds.setPassword("");		
		return ds;
	}*/
	
	@Bean
	public DataSource getDataSource()
	{
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/doctor_db?useSSL=true");
		ds.setUsername("root");
		ds.setPassword("root");		
		return ds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean
	public SessionFactory getSessionFactory() throws Exception{
		LocalSessionFactoryBean ss = new LocalSessionFactoryBean();
		DataSource dataSource = getDataSource();
		System.out.println("Getting datasource:"+ dataSource);
		System.out.println("Getting datasource connection:"+ dataSource.getConnection());
		ss.setDataSource(dataSource);
		ss.setPackagesToScan("com.nitt");
		
		ss.setHibernateProperties(hibernateProperties());
		SessionFactory object = ss.getObject();
		System.out.println("SessionFactory :"+ object);
		return object;
	}
	
	
	private Properties hibernateProperties() {
	      Properties props =new Properties() ;
	      props.setProperty("hibernate.hbm2ddl.auto", "create-drop");
	      props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
	      props.setProperty("hibernate.show_sql", "true");
	            /*
	             * setProperty("hibernate.globally_quoted_identifiers", "true");
	         }
	      };*/
	      return props;
	   }
	
	/*@Bean
	public HibernateTransactionManager transactionManager() throws Exception{
		SessionFactory sessionFactory = getSessionFactory();
		System.out.println("Getting sessionFactory:" + sessionFactory);
		HibernateTransactionManager tx = new HibernateTransactionManager(sessionFactory);
		return tx;
	}*/
}

package cl.tcgplanet.config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import cl.tcgplanet.service.ClientService;
import cl.tcgplanet.service.ClientServiceImpl;
import cl.tcgplanet.service.HelloWorld;
import cl.tcgplanet.service.HelloWorldImpl;

@Configuration
@MapperScan("cl.tcgplanet.persistence")
public class ApplicationConfig {
	@Bean(name = "hello")
	public HelloWorld helloWorld() {
		return new HelloWorldImpl();
	}
	@Bean(name = "client")
	public ClientService clientBean() {
		return new ClientServiceImpl();
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		// org.springframework.jdbc.datasource.DriverManagerDataSource
		// DriverManagerDataSourc
		// SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
	       dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	       dataSource.setUrl("jdbc:mysql://localhost:3306/tcgplanet");
	       dataSource.setUsername("admin");
	       dataSource.setPassword("admin");
		return dataSource;
	}

//	@Bean
//	public SqlSessionFactory sqlSessionFactory() throws Exception {
//		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
//		sqlSessionFactory.setDataSource(dataSource());
//		return (SqlSessionFactory) sqlSessionFactory.getObject();
//	}

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setTypeAliasesPackage("cl.tcgplanet.domain");
        return sessionFactory;
    }

}

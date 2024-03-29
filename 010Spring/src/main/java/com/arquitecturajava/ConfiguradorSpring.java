package com.arquitecturajava;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.arquitecturajava")
@EnableAspectJAutoProxy
@PropertySource("classpath:database.properties")
@EnableTransactionManagement
public class ConfiguradorSpring {
	
	@Value("${url}")
	String url;
	@Value("${usuario}")
	String usuario;
	@Value("${password}")
	String password;
	
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		//dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl(url);
		dataSource.setUsername(usuario);
		dataSource.setPassword(password);

		return dataSource;
	}
	
	// si que habia que declararla a detalle como 
	// la plantilla jdbc se asocia a un datasource
	@Bean
	public JdbcTemplate asignarPlantilla() {
		return new JdbcTemplate(dataSource());
	}
	//configura el gestor transaccional operaciones at�micas
	@Bean
	public PlatformTransactionManager txManager() {
		return new DataSourceTransactionManager(dataSource());
	}
	
}

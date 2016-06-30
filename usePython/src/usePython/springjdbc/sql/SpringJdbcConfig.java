package usePython.springjdbc.sql;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration  
@ComponentScan("usePython.springjdbc.sql")  
public class SpringJdbcConfig {
    @Bean  
    public DataSource mysqlDataSource() {  
        DriverManagerDataSource dataSource = new DriverManagerDataSource();  
        //dataSource.setDriverClassName("com.mysql.jdbc.Driver");  
        //dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");  
        //dataSource.setUsername("guest_user");  
        //dataSource.setPassword("guest_password");  
        dataSource.setDriverClassName("org.postgresql.Driver");  
        dataSource.setUrl("jdbc:postgresql://localhost:14875/pydb0");  
        dataSource.setUsername("postgres");  
        dataSource.setPassword("ttxs123321");   
        return dataSource;  
    } 
}

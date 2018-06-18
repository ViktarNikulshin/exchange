package com.vik.exchange.config;

import java.util.Properties;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;


//
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = "com.vik.exchange")
@EnableJpaRepositories(basePackages={"com.vik.exchange.repository"})
public class HibernateConfig {
//    
    @Bean
    public DriverManagerDataSource  dateSource (){
        DriverManagerDataSource  dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/exchange?verifyServerCertificate=false&useSSL=false&requireSSL=false&useLegacyDatetimeCode=false&amp&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("12345");
        return dataSource;
    }
     @Bean
    public HibernateJpaVendorAdapter jpaVendorAdapter(){
        
        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setGenerateDdl(true);
        jpaVendorAdapter.setShowSql(true);
        return jpaVendorAdapter;
    }
   @Bean
            LocalContainerEntityManagerFactoryBean entityManagerFactory() {
                LocalContainerEntityManagerFactoryBean emFactory = new LocalContainerEntityManagerFactoryBean();
                emFactory.setDataSource(dateSource());
                emFactory.setPersistenceProviderClass(HibernatePersistenceProvider.class);
                emFactory.setJpaVendorAdapter(jpaVendorAdapter());
                Properties properties = new Properties();
                properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
                emFactory.setJpaProperties(properties);
                emFactory.setPackagesToScan("com.vik.exchange.model");
        return emFactory;
    }
@Bean
             JpaTransactionManager transactionManager() {
                JpaTransactionManager transactionManager = new JpaTransactionManager();
                transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return transactionManager;
    }
}

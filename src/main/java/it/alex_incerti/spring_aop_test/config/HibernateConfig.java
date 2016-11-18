package it.alex_incerti.spring_aop_test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class HibernateConfig {
	// private static final String[] modelEntitiesPackages = {
	// "it.alexincerti.botapplication.model" };
	//
	// @Value("${DATABASE_URL}")
	// private String databaseUrl;
	//
	// @Bean
	// public DataSource getDataSource() {
	// // final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
	// // dsLookup.setResourceRef(true);
	// // DataSource dataSource = dsLookup.getDataSource("jdbc/vlm");
	// // return dataSource;
	// //
	// BasicDataSource ds = new BasicDataSource();
	// ds.setDriverClassName("org.postgresql.Driver");
	// // StringBuilder jdbcUrlBuilder = new
	// // StringBuilder("jdbc:postgresql://");
	// // jdbcUrlBuilder.append("localhost").append(":");
	// // jdbcUrlBuilder.append("5432").append("/");
	// // jdbcUrlBuilder.append("vlm_db");
	// // postgres://euei:euei@localhost:5432/euei_fifa
	// StringBuilder url = new StringBuilder();
	// url.append("postgresql://");
	// databaseUrl = databaseUrl.replace("postgres://", "");
	// String[] split1 = databaseUrl.split(":");
	// String[] split2 = split1[1].split("@");
	// url.append(split2[1] + ":" + split1[2]);
	// ds.setUrl("jdbc:" + url.toString());
	// ds.setUsername(split1[0]);
	// ds.setPassword(split2[0]);
	// ds.setInitialSize(5);
	// ds.setMaxTotal(10);
	// return ds;
	// }
	//
	// @Bean
	// public FactoryBean<SessionFactory> getSessionFactoryBean() {
	// LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
	// sf.setDataSource(getDataSource());
	// sf.setPackagesToScan(modelEntitiesPackages);
	// sf.setHibernateProperties(getHibernateProperties());
	// return sf;
	// }
	//
	// @Bean
	// public PlatformTransactionManager getTransactionManager() {
	// try {
	// HibernateTransactionManager tx = new HibernateTransactionManager();
	// FactoryBean<SessionFactory> sf = getSessionFactoryBean();
	// tx.setSessionFactory(sf.getObject());
	// return tx;
	// } catch (Exception e) {
	// throw new RuntimeException(e);
	// }
	// }
	//
	// // @Override
	// // public PlatformTransactionManager annotationDrivenTransactionManager()
	// {
	// // return getTransactionManager();
	// // }
	//
	// private Properties getHibernateProperties() {
	// Properties properties = new Properties();
	// properties.setProperty("hibernate.hbm2ddl.auto", "update");
	// properties.setProperty("hibernate.connection.release_mode",
	// "after_transaction");
	// properties.setProperty("hibernate.max_fetch_depth", "3");
	// properties.setProperty("default_batch_fetch_size", "16");
	// properties.setProperty("hibernate.order_updates.hbm2ddl.auto", "true");
	// properties.setProperty("hibernate.use_sql_comments", "false");
	// properties.setProperty("hibernate.show_sql", "false");
	// properties.setProperty("hibernate.format_sql", "true");
	// properties.setProperty("hibernate.dialect",
	// "org.hibernate.dialect.PostgreSQLDialect");
	// return properties;
	// }

}

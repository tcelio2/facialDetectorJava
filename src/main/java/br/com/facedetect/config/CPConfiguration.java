//package br.com.facedetect.config;
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//import java.io.PrintWriter;
//import java.util.Properties;
//
//@Configuration
//public class CPConfiguration {
//
//    @Bean
//    @ConfigurationProperties("spring.datasource")
//    public DataSource customDataSource() {
//        //return DataSourceBuilder.create().build();
//        Properties props = new Properties();
//
//        props.setProperty("dataSourceClassName", "org.postgresql.ds.PGSimpleDataSource");
//        props.setProperty("dataSource.user", "postgres");
//        props.setProperty("dataSource.password", "1234");
//        props.setProperty("dataSource.databaseName", "escola");
//        props.put("dataSource.logWriter", new PrintWriter(System.out));
//
//        HikariConfig config = new HikariConfig(props);
//        HikariDataSource ds = new HikariDataSource(config);
//        return ds;
//    }
//}
//
//

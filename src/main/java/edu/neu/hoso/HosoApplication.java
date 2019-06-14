package edu.neu.hoso;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("edu.neu.hoso.model")
public class HosoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HosoApplication.class, args);
    }

}

package xyz.foolcat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "xyz.foolcat.mapper")
public class FoolCatSpringApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(FoolCatSpringApplication.class, args);
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {

	}


}

package lorapp.supervision;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="lorapp.db.repo")
@EntityScan(basePackages="lorapp.db.entity")
public class LoraDataMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoraDataMonitorApplication.class, args);
	}
}

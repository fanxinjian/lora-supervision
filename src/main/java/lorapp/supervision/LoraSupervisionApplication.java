package lorapp.supervision;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages={"lorapp.db.repo", "lorapp.db.supervision.repo"})
@EntityScan(basePackages={"lorapp.db.entity", "lorapp.db.supervision.enity"})
public class LoraSupervisionApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoraSupervisionApplication.class, args);
	}
}

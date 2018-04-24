package cm.main;

import cm.config.CassandraConfig;
import cm.service.ClaimRevisionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication

@EnableCassandraRepositories("cm/repository")
@ComponentScan(basePackageClasses = {CassandraConfig.class, ClaimRevisionManager.class})
public class ClaimManagerApp implements CommandLineRunner {
    @PostConstruct
    private void started() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    @Autowired
    private ClaimRevisionManager manager;

    public void run(String... args) throws Exception {
        manager.doWork();
    }

    public static void main(String[] args) {
        SpringApplication.run(ClaimManagerApp.class, args).close();
    }
}

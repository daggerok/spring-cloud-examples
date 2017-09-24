package daggerok;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@Slf4j
@EnableTask
@SpringBootApplication
public class SpringCloudTaskApplication {

  @Bean
  public CommandLineRunner task(final RabbitProperties props) {

    return args -> log.warn("\nwho-hoo!\nrabbit props:\nhost: '{}', port: '{}'\n",
                            props.determineHost(), props.determinePort());
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudTaskApplication.class, args);
  }
}

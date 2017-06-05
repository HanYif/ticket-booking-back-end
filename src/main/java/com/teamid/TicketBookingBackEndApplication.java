package com.teamid;

import com.teamid.repository.CinemaRepository;
import com.teamid.repository.MovieRepository;
import com.teamid.repository.ScheduleRepository;
import com.teamid.repository.TicketRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;


@SpringBootApplication
@EnableRedisHttpSession
public class TicketBookingBackEndApplication {

    private Logger logger = LoggerFactory.getLogger(this.getClass());



	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(TicketBookingBackEndApplication.class);
		app.setWebEnvironment(true);
		app.run(args);
	}

	@Bean
	public CommandLineRunner init(CinemaRepository cinemaRepository,
								  MovieRepository movieRepository,
								  ScheduleRepository scheduleRepository,
								  TicketRepository ticketRepository) {
		return args -> {

//			DataUtils.addTestData(cinemaRepository, movieRepository, scheduleRepository, ticketRepository);

        };
	}

}

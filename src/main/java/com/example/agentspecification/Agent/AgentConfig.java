package com.example.agentspecification.Agent;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AgentConfig {
    @Bean
    CommandLineRunner commandLineRunner(AgentRepository repository) {
        return args -> {
            Agent sam = new Agent(
                    "AGT123",
                    Agent.Title.Mr,
                    "hello",
                    "middle",
                    "last",
                    12,
                    12,
                    "hello@gmail.com",
                    1234,
                    "abcd",
                    "abcd",
                    "abd",
                    "abcd",
                    Agent.Region.Oromia,
                    1,
                    0.15,
                    Agent.Rate.Tier1,
                    "abcd",
                    "abcd"
            );
            repository.saveAll(List.of(sam));
        };
    }
}

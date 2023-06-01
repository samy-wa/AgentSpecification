package com.example.agentspecification.Agent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AgentRepository
        extends JpaRepository<Agent, Long> {
    @Query("SELECT a FROM Agent a WHERE a.AgentNumber = ?1")
    Optional<Agent> findAgentByAgentNumber(String AgentNumber);

    @Query("SELECT a FROM Agent a WHERE a.id = ?1")
    Agent findByAgentId(Long agentId);
}

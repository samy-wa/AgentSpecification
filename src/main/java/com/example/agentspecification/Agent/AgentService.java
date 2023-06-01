package com.example.agentspecification.Agent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class AgentService {
    private final AgentRepository agentRepository;

    @Autowired
    public AgentService(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }

    @GetMapping
    public List<Agent> getAgents() {
        return agentRepository.findAll();
    }

    @PostMapping
    public Agent addNewAgents(Agent agent) {

        Optional<Agent> optionalAgent = agentRepository.findAgentByAgentNumber(agent.getAgentNumber());
        if (optionalAgent.isPresent()) {
            throw new IllegalStateException("Agent Number is taken");
        }
        return agentRepository.save(agent);
    }

    @GetMapping
    public Agent getAgent(Long agentId) {
        boolean exists = agentRepository.existsById(agentId);
        if(!exists) {
            throw  new IllegalStateException("Agent with id " + agentId + " does not exists");
        }
        return  agentRepository.findByAgentId(agentId);
    }
}

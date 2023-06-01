package com.example.agentspecification.Agent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/agent")
public class AgentController {
    private final AgentService agentService;

    @Autowired
    public AgentController(AgentService agentService) {
        this.agentService = agentService;
    }

    @GetMapping
    public List<Agent> getAgents(){
        return agentService.getAgents();
    }

    @PostMapping
    public Agent addAgent(@RequestBody Agent agent) {
        return agentService.addNewAgents(agent);
    }
}

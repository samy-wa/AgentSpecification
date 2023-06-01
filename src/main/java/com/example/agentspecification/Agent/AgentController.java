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

    @GetMapping(path = "{agentId}")
    public Agent getAgentById(@PathVariable("agentId") Long agentId){
        return agentService.getAgent(agentId);
    }

    @PostMapping
    public Agent addAgent(@RequestBody Agent agent) {
        return agentService.addNewAgents(agent);
    }
}

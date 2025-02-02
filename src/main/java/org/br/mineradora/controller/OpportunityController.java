package org.br.mineradora.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.br.mineradora.dto.OpportunityDTO;
import org.br.mineradora.service.OpportunityService;

import java.util.List;

@Path("/api/opportunity")
public class OpportunityController {
    @Inject
    OpportunityService opportunityService;

    @GET
    @Path("/data")
    public List<OpportunityDTO> generateReport() {
        return opportunityService.generateOpportunityData();
    }
}

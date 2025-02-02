package org.br.mineradora.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
public class OpportunityDTO {

    private Long proposalId;
    private String customer;
    private BigDecimal priceTonne;
    private BigDecimal lastDollarQuotation;
}

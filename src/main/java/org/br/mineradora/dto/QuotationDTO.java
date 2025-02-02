package org.br.mineradora.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Builder
@Data
@AllArgsConstructor
public class QuotationDTO {

    private Date date;
    private BigDecimal currencyPrice;
}

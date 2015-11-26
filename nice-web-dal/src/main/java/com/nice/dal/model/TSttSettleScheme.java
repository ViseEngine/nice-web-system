package com.nice.dal.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class TSttSettleScheme {
    private Long schemeId;

    private String schemeName;

    private String trsCode;

    private String settleTypeId;

    private BigDecimal settlePeriod;

    private String workFlag;

    private String stat;

    private String auditId;

    private Date auditDate;

    private String memo;
}
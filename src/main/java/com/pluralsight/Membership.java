package com.pluralsight;

import java.math.BigDecimal;

public class Membership {
    private String memberName;
    private int months;
    private BigDecimal baseRate;

    public Membership(String memberName, int months, BigDecimal baseRate) {
        this.memberName = memberName;
        this.months = months;
        this.baseRate = baseRate;
    }

    public BigDecimal getMonthlyPrice() {
        return baseRate;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getMonths() {
        return months;
    }

    public BigDecimal getSignUpFee() {
        return new BigDecimal("49.00");
    }

    public BigDecimal getContractTotal() {
        return getMonthlyPrice().multiply(BigDecimal.valueOf(months)).add(getSignUpFee());
    }
}

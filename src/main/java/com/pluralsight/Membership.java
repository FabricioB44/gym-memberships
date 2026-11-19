package com.pluralsight;

import java.math.BigDecimal;

public abstract class Membership {
    private String memberName;
    private int months;
    private BigDecimal baseRate;

    public Membership(String memberName, int months, BigDecimal baseRate) {
        this.memberName = memberName;
        this.months = months;
        this.baseRate = baseRate;
    }

    // Abstract methods cannot have a body
    public abstract BigDecimal getMonthlyPrice();

    public BigDecimal getBaseRate() {
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

    public String toString() {
        return String.format(
                "Membership | %s | %d Months",
                memberName,
                months
        );
    }
}

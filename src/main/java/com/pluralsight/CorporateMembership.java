package com.pluralsight;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CorporateMembership extends Membership {
    private BigDecimal employerShare;

    CorporateMembership(String memberName, int months, BigDecimal baseRate, BigDecimal employerShare) {
        super(memberName, months, baseRate);
        this.employerShare = employerShare;
    }

    @Override
    public BigDecimal getMonthlyPrice() {
        return getBaseRate()
                .subtract(getBaseRate().multiply(employerShare))
                .setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal getSignUpFee() {
        return new BigDecimal("0.00");
    }

    @Override
    public String toString() {
        return String.format(
                "Corporate | %s | %d Months | employee share: %s",
                super.getMemberName(),
                super.getMonths(),
                employerShare
        );
    }
}

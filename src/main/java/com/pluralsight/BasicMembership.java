package com.pluralsight;

import java.math.BigDecimal;

public class BasicMembership extends Membership {
    private boolean offPeakOnly;

    public BasicMembership(String memberName, int months, BigDecimal baseRate, boolean offPeakOnly) {
        super(memberName, months, baseRate);
        this.offPeakOnly = offPeakOnly;
    }

    public boolean getIsOffPeakOnly() {
        return offPeakOnly;
    }

    public void setIsOffPeakOnly(boolean offPeakOnly) {
        this.offPeakOnly = offPeakOnly;
    }

    @Override
    public BigDecimal getMonthlyPrice() {
        if (offPeakOnly) {
            return super.getMonthlyPrice().subtract(new BigDecimal("5.00"));
        }

        return super.getMonthlyPrice();
    }
}

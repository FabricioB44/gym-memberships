package com.pluralsight;

import java.math.BigDecimal;

public class PremiumMembership extends Membership {
    private int guestPasses;

    public PremiumMembership(String memberName, int months, BigDecimal baseRate, int guestPasses) {
        super(memberName, months, baseRate);
        this.guestPasses = guestPasses;
    }

    @Override
    public BigDecimal getMonthlyPrice() {
            return super.getMonthlyPrice().add(new BigDecimal("18.50"));
    }

    public void useGuestPass() {
        if (guestPasses == 0) {
            System.out.println(getMemberName() + " has no guest passes left.");
        } else {
            guestPasses -= 1;
            System.out.println(getMemberName() + " used a guest pass. Passes left: " + guestPasses);
        }
    }
}

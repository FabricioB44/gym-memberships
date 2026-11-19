package com.pluralsight;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FamilyMembership extends Membership{
    private int extraMembers;

    FamilyMembership(String memberName, int months, BigDecimal baseRate, int extraMembers) {
        super(memberName, months, baseRate);
        this.extraMembers = extraMembers;
    }

    public int getExtraMembers() {
        return extraMembers;
    }

    public void setExtraMembers(int extraMembers) {
        this.extraMembers = extraMembers;
    }

    @Override
    public BigDecimal getMonthlyPrice() {
        BigDecimal totalPrice = super.getMonthlyPrice();
        for (int i = 0; i < extraMembers; i++) {
            totalPrice = totalPrice.add(new BigDecimal("12.50"));
        }
        if (extraMembers >= 3) {
            totalPrice = totalPrice.multiply(new BigDecimal("0.90"));
        }

        return totalPrice.setScale(2, RoundingMode.HALF_UP);
    }
}

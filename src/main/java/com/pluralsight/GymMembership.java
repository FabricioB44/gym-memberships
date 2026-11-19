package com.pluralsight;

import java.math.BigDecimal;

public class GymMembership {
    public static void main(String[] args) {
        Membership membership = new Membership("Henry Clark", 3, new BigDecimal("30.00"));
        BasicMembership membership2 = new BasicMembership("Alice Johnson", 6, new BigDecimal("30.00"), true);
        PremiumMembership membership3 = new PremiumMembership("Carol White", 12, new BigDecimal("30.00"), 1);
        PremiumMembership membership4 = new PremiumMembership("Frank Miller", 3, new BigDecimal("30.00"), 1);
        System.out.println("=== Gym Memberships ===");
        System.out.println(membership);
        System.out.println(membership2);
        membership3.useGuestPass();
        membership3.useGuestPass();
    }
}

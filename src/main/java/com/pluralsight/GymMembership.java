package com.pluralsight;

import java.math.BigDecimal;

public class GymMembership {
    public static void main(String[] args) {
        Membership membership = new Membership("Henry Clark", 3, new BigDecimal("30.00"));
        BasicMembership membership2 = new BasicMembership("Alice Johnson", 6, new BigDecimal("30.00"), true);
        PremiumMembership membership3 = new PremiumMembership("Carol White", 12, new BigDecimal("30.00"), 2);
        PremiumMembership membership4 = new PremiumMembership("Frank Miller", 3, new BigDecimal("30.00"), 0);
        FamilyMembership membership5 = new FamilyMembership("Grace Lee", 12, new BigDecimal("30.00"), 3);
        FamilyMembership membership6 = new FamilyMembership("Emma Wilson", 12, new BigDecimal("30.00"), 1);
        System.out.println("=== Gym Memberships ===");
        System.out.println(membership);
        System.out.println(membership2);
        membership3.useGuestPass();
        membership4.useGuestPass();
        System.out.println(membership5);
        System.out.println(membership6);
    }
}

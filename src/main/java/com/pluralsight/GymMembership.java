package com.pluralsight;

import java.math.BigDecimal;

public class GymMembership {
    public static void main(String[] args) {
        Membership membership = new Membership("Henry Clark", 3, new BigDecimal("30.00"));
        Membership membership2 = new BasicMembership("Alice Johnson", 6, new BigDecimal("30.00"), true);
        System.out.println("=== Gym Memberships ===");
        System.out.println(membership);
        System.out.println(membership2);
    }
}

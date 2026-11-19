package com.pluralsight;

import java.math.BigDecimal;

public class GymMembership {
    public static void main(String[] args) {
        Membership membership = new Membership("Henry Clark", 3, new BigDecimal("30.00"));
        System.out.println("=== Gym Memberships ===");
        System.out.println(membership);
    }
}

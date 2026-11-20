package com.pluralsight;

import java.lang.reflect.Member;
import java.math.BigDecimal;
import java.util.ArrayList;

public class GymMembership {
    public static void main(String[] args) {
        ArrayList<Membership> memberships = new ArrayList<>();
        // 'Membership' is abstract; cannot be instantiated
        // memberships.add(new Membership("Henry Clark", 3, new BigDecimal("30.00")));
        memberships.add(new BasicMembership("Alice Johnson", 6, new BigDecimal("30.00"), true));
        memberships.add(new BasicMembership("Bob Smith", 2, new BigDecimal("27.50"), false));
        memberships.add(new PremiumMembership("Carol White", 12, new BigDecimal("30.00"), 2));
        memberships.add(new PremiumMembership("Frank Miller", 3, new BigDecimal("30.00"), 0));
        memberships.add(new FamilyMembership("Grace Lee", 12, new BigDecimal("30.00"), 3));
        memberships.add(new FamilyMembership("Emma Wilson", 6, new BigDecimal("30.00"), 1));
        memberships.add(new CorporateMembership("Olivia Martin", 12, new BigDecimal("30.00"), new BigDecimal("0.40")));

        int totalMemberships = 0;
        BigDecimal montlyIncome = BigDecimal.ZERO;
        BigDecimal allContracts = BigDecimal.ZERO;
        System.out.println("\n=== Gym Memberships ===");
        for (Membership membership : memberships) {
            System.out.println(membership.toString());
            printCosts(membership);
            totalMemberships++;
            montlyIncome = montlyIncome.add(membership.getMonthlyPrice());
            allContracts = allContracts.add(membership.getContractTotal());
        }

        System.out.println("\n=== Totals ===");
        System.out.println("Memberships: " + totalMemberships);
        System.out.println("Monthly Income: " + montlyIncome);
        System.out.println("All contracts: " + allContracts);

        System.out.println("\n=== Front desk notes ===");
        for (Membership membership : memberships) {
            if (membership instanceof BasicMembership) {
                if (((BasicMembership) membership).getIsOffPeakOnly()) {
                    System.out.println(membership.getMemberName() + ": Entry between 10:00 and 16:00 only");
                }
            }
            if (membership instanceof PremiumMembership) {
                ((PremiumMembership) membership).useGuestPass();
            }
            if (membership instanceof FamilyMembership) {
                int printedKeys = 1 + ((FamilyMembership) membership).getExtraMembers();
                System.out.println(membership.getMemberName() + ": Print " + printedKeys + " key cards");
            }
        }

        System.out.println("\n=== Kinds ===");
        for (Membership membership : memberships) {
            System.out.println(membership.getMemberName() + ": " + membership.getClass().getSimpleName()
            );
        }

    }

    public static void printCosts(Membership membership) {
        System.out.printf(
                "   Monthly price: $%s, sign up fee: $%s, contract total: $%s%n",
                membership.getMonthlyPrice(),
                membership.getSignUpFee(),
                membership.getContractTotal()
        );
    }
}

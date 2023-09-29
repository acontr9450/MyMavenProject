package com.example;

/**
 * Simple interest equation used to calculate compound interest
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double principal = 1000;
        double interestRate = 0.005;
        int months = 6;
        double compoundPrincipal = principal;
        for(int i = 0; i < months; i++){
            compoundPrincipal += compoundPrincipal * interestRate;
            System.out.println("Compound: " + compoundPrincipal);
        }

        System.out.println("The new balance after " + months + " months of " + interestRate + " interest on $" 
            + principal + " = $" +String.format("%.2f", compoundPrincipal));
        
    }
}

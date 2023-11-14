package com.pluralsight.finance;

import pluralsight.*;

import java.util.Scanner;

public class FinanceApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter portfolio name: ");
        String portfolioName = scanner.nextLine();

        System.out.print("Enter owner name: ");
        String ownerName = scanner.nextLine();

        Portfolio portfolio = new Portfolio(portfolioName, ownerName);

        // Prompt user to add assets
        while (true) {
            System.out.println("Enter asset type (BankAccount, Jewelry, Gold, House, CreditCard) or 'exit' to finish:");
            String assetType = scanner.nextLine();

            if ("exit".equalsIgnoreCase(assetType)) {
                break;
            }

            System.out.print("Enter asset name: ");
            String assetName = scanner.nextLine();

            if ("BankAccount".equalsIgnoreCase(assetType)) {
                System.out.print("Enter account number: ");
                int accountNumber = scanner.nextInt();
                System.out.print("Enter balance: ");
                double balance = scanner.nextDouble();
                scanner.nextLine();
                portfolio.add(new BankAccount(accountNumber, assetName, balance));
            } else if ("Jewelry".equalsIgnoreCase(assetType)) {
                System.out.print("Enter karat: ");
                double karat = scanner.nextDouble();
                scanner.nextLine();
                portfolio.add(new Jewelry(assetName, karat));
            } else if ("Gold".equalsIgnoreCase(assetType)) {
                System.out.print("Enter weight: ");
                double weight = scanner.nextDouble();
                scanner.nextLine();
                portfolio.add(new Gold(weight));
            } else if ("House".equalsIgnoreCase(assetType)) {
                System.out.print("Enter year built: ");
                int yearBuilt = scanner.nextInt();
                System.out.print("Enter square feet: ");
                int squareFeet = scanner.nextInt();
                System.out.print("Enter number of bedrooms: ");
                int bedrooms = scanner.nextInt();
                scanner.nextLine();
                portfolio.add(new House(yearBuilt, squareFeet, bedrooms));
            } else if ("CreditCard".equalsIgnoreCase(assetType)) {
                System.out.print("Enter account number: ");
                int accountNumber = scanner.nextInt();
                System.out.print("Enter balance: ");
                double balance = scanner.nextDouble();
                scanner.nextLine();
                portfolio.add(new CreditCard(accountNumber, assetName, balance));
            }
        }

        
        // Display portfolio information
        System.out.println("Portfolio Name: " + portfolioName);
        System.out.println("Owner: " + ownerName);
        System.out.println("Total Portfolio Value: $" + portfolio.getValue());

        Valuable mostValuable = portfolio.getMostValuable();
        if (mostValuable != null) {
            System.out.println("Most Valuable Asset: " + mostValuable.getClass().getSimpleName());
        }

        Valuable leastValuable = portfolio.getLeastValuable();
        if (leastValuable != null) {
            System.out.println("Least Valuable Asset: " + leastValuable.getClass().getSimpleName());
        }
    }
}

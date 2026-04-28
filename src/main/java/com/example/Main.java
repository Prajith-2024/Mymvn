package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main entry point for the application
 */
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Starting Sample Maven Project");

        Calculator calculator = new Calculator();

        // Perform some calculations
        int sum = calculator.add(10, 5);
        logger.info("10 + 5 = {}", sum);

        int difference = calculator.subtract(10, 5);
        logger.info("10 - 5 = {}", difference);

        int product = calculator.multiply(10, 5);
        logger.info("10 * 5 = {}", product);

        double quotient = calculator.divide(10, 5);
        logger.info("10 / 5 = {}", quotient);

        logger.info("Application completed successfully");
    }
}

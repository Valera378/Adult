package org.itstep.task01;


public class Employee {
    private String fullName;
    private String paymentType;
    private double payment;

    public Employee(String fullName, String paymentType, double payment) {
        this.fullName = fullName;
        this.paymentType = paymentType;
        this.payment = payment;
    }

    public double getPaymentWithTax() {
        return payment;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public double getPayment() {
        return payment;
    }

    public String setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return paymentType;
    }

    @Override
    public String toString() {
        return String.format("%-8s | %-12s | %.1f грн", fullName, paymentType, payment);
    }


}

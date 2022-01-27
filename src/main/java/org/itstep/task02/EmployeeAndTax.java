package org.itstep.task02;

import org.itstep.task01.Employee;

public class EmployeeAndTax extends Employee {
    private double tax;
    // private double PaymentWithTax;

    public EmployeeAndTax(String fullName, String paymentType, double payment) {
        super(fullName, paymentType, payment);
        this.tax=tax;
    }
        public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String setPaymentType(String paymentType) {

        if (paymentType.equals("сдельная")) {
            tax = 15;
        } else {
            tax = 20;
        }

        return paymentType;
    }

    public double getPaymentWithTax() {

     return getPayment() - (getPayment() * tax / 100);

    }

    @Override
    public String toString() {

        setPaymentType(getPaymentType());

        return String.format("%-8s | %-9s | %-11s | %.1f", getFullName(), getTax(), getPayment(), getPaymentWithTax());

    }

}

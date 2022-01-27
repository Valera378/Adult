package org.itstep.task03;

import org.itstep.task02.EmployeeAndTax;

public class EmployeeAndChild extends EmployeeAndTax {
    boolean hasChild;

    public EmployeeAndChild(String fullName, String paymentType, double payment) {
        super(fullName, paymentType, payment);
    }

    public EmployeeAndChild(String fullName, String paymentType, double payment, boolean hasChild) {
        super(fullName, paymentType, payment);
        this.hasChild = hasChild;
    }

    public boolean hasChild() {

        return hasChild;
    }

    public boolean isHasChild() {

        return hasChild;
    }

    public void setHasChild(boolean hasChild) {
        this.hasChild = hasChild;
    }

    public String setPaymentType(String paymentType) {
        if (paymentType.equals("сдельная")) {
            setTax(15);
        } else {
            setTax(20);
        }
        if (isHasChild() == false) {
            double tax = getTax() + 5;
            setTax(tax);
        } else {
            getTax();
        }
        return paymentType;
    }

    @Override
    public String toString() {
        setPaymentType(getPaymentType());
        return String.format("%-8s | %-9s | %-11s | %-10s", getFullName(), getTax(), getPayment(), getPaymentWithTax(),
                Exchange(getPaymentType()));
    }

    private Object Exchange(String paymentType) {

        return paymentType;
    }

}

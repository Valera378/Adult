package org.itstep.task05;

import org.itstep.task04.EmployeeAndTugrik;
public class EmployeeAndOffshore extends EmployeeAndTugrik {

    private boolean inOffshore;

    public EmployeeAndOffshore(String fullName, String paymentType, double payment) {
          super(fullName, paymentType, payment);
    }

    public EmployeeAndOffshore(String fullName, String paymentType, double payment, boolean hasChild) {
          super(fullName, paymentType, payment, hasChild);

    }

    public EmployeeAndOffshore(String fullName, String paymentType, double payment, boolean hasChild,
                               boolean inOffshore) {
        super(fullName, paymentType, payment, hasChild);
        this.inOffshore = inOffshore;
    }

    public boolean isInOffshore() {
        return inOffshore;
    }

    public void setInOffshore(boolean inOffshore) {
        this.inOffshore = inOffshore;
    }

    public String setPaymentType(String paymentType) {

        if (inOffshore) {
            setTax(0);
        } else {


            if (paymentType.equals("почасовая")) {
                setTax(20);
            } else {
                setTax(15);
            }

            if (isHasChild() == false) {
                double tax = getTax() + 5;
                setTax(tax);
            } else {
                getTax();
            }
        }
        return paymentType;
    }
    @Override
    public String toString(){
        setPaymentType(getPaymentType());
        return String.format("%-8s | %-9s | %-10s | %-10s", getFullName(),getTax(),getPayment(),
                Exchange(getPaymentType()));
    }
}
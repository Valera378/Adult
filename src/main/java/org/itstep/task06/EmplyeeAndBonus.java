package org.itstep.task06;

import org.itstep.task05.EmployeeAndOffshore;

public class EmplyeeAndBonus extends EmployeeAndOffshore {
    private int workHours;

   // public EmplyeeAndBonus(String fullName, String paymentType, double payment ) {
   //     super(fullName, paymentType, payment);

   // }
    public EmplyeeAndBonus(String fullName, String paymentType, double payment,  int workHours) {
        super(fullName, paymentType, payment );
        this.workHours=workHours;
    }



     public EmplyeeAndBonus(String fullName, String paymentType, double payment,boolean inOffshore,
                          int workHours) {
        super(fullName, paymentType, payment ,  inOffshore);
        this.workHours=workHours;
    }



    public String Exchange (String tugrikExchange){
        setTugrickExchange(8);

        if ((isInOffshore()==false)&&(workHours>200)){
            setPayment(getPayment()*1.2);
        }
        double paymentTugrik= (int)((getPaymentWithTax() / 2) / 8);

        if (getPaymentType().equals("почасовая")){
            return (getPaymentWithTax()) /2 + "/" + paymentTugrik;
        }else {
            return getPaymentWithTax()+ "";
        }
    }
    @Override
    public String toString(){
        setPaymentType(getPaymentType());

        return String.format("%-8s | %-9s | %-10s | %-10s ", getFullName(),getTax(),getPayment(),
                Exchange(getPaymentType()));
    }

    private void setPayment(double v) {
    }


}

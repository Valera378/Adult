package org.itstep.task04;

import org.itstep.task03.EmployeeAndChild;


public class EmployeeAndTugrik extends EmployeeAndChild {
    private int TugrikExchange;


    public EmployeeAndTugrik(String fullName, String paymentType, double payment,boolean hasChild) {
        super(fullName, paymentType, payment,hasChild);
    }
    public EmployeeAndTugrik (String fullName,String paymentType,double payment){
        super(fullName,paymentType,payment);
    }

    public void setTugrikExchange(int tugrikExchange) {
        int TugrikExchange= tugrikExchange;
    }

    public int getTugrikExchange() {
        return TugrikExchange;
    }
    public String Exchange(String tugrikExchange){
        TugrikExchange = 8;
        int paymentTugrik=(int)((getPaymentWithTax()/2))/TugrikExchange;
        if(getPaymentType().equals("почасовая")){
            return (getPaymentWithTax())/2+"/"+paymentTugrik;
        }else {
            return getPaymentWithTax()+ "";
        }
    }
    @Override
    public String toString(){
        setPaymentType(getPaymentType());
        return String.format("%-8s | %-9s | %-10s | %-10s", getFullName(),getTax(),getPayment(),
                Exchange(getPaymentType()));
    }

    public void setTugrickExchange(int i) {
    }
}

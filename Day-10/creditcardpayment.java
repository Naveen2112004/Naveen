interface paymentgateway {
    boolean processpayment(double amount);
    String getTeansactionId(String transactionid);
class creditcardpayment implements paymentgateway {
    public boolean processpayment(double amount) {
        System.out.println("Processing Credit Card payment: $" + amount);
        return true;
    }
    public String getTeansactionId(String transactionid) {
        return "Credit Card Transaction ID: " + transactionid;
    }
}
class UPIpayment implements paymentgateway {
    public boolean processpayment(double amount) {
        System.out.println("Processing UPI payment: $" + amount);
        return true;
    }
    public String getTeansactionId(String transactionid) {
        return "UPI Transaction ID: " + transactionid;
    }
}
    public static void main(String[] args) {
        paymentgateway credit = new creditcardpayment();
        paymentgateway upi = new UPIpayment();
        credit.processpayment(250.75);
        System.out.println(credit.getTeansactionId("CC12345XYZ"));
        System.out.println();
        upi.processpayment(120.00);
        System.out.println(upi.getTeansactionId("UPI9988LMN"));
    }
}

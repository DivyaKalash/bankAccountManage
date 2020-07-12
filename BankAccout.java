package com.TheK;

public class BankAccout {

    public String customerName;
    public long accountNumber;
    public double accountBalance;
    public String customerEmailId;
    public long CustomerPhoneNumber;

    public BankAccout(String customerName, long accountNumber, double accountBalance, String customerEmailId, long customerPhoneNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerEmailId = customerEmailId;
        CustomerPhoneNumber = customerPhoneNumber;
    }

    public void depositAmount(double deposit){
        this.accountBalance += deposit;

        System.out.println("Money deposited = "+deposit+". Total Balance = " +this.accountBalance);
    }

    public void withdrawAmount(double withdraw){
        if(this.accountBalance > withdraw){
            this.accountBalance -= withdraw;
            System.out.println("Money Withdrew = "+withdraw+". Available balance = "+this.accountBalance);
        }else{
            System.out.println("Invalid balance.");
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerEmailId() {
        return customerEmailId;
    }

    public void setCustomerEmailId(String customerEmailId) {
        this.customerEmailId = customerEmailId;
    }

    public long getCustomerPhoneNumber() {
        return CustomerPhoneNumber;
    }

    public void setCustomerPhoneNumber(long customerPhoneNumber) {
        CustomerPhoneNumber = customerPhoneNumber;
    }
}

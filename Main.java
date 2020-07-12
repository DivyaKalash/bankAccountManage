package com.TheK;

public class Main {

    public static void main(String[] args) {

        BankAccout bankAccount = new BankAccout("Kalash",123456789l,508.87,"TheeK@oop.com",7488114934l);
        BankAccout bankAccount1= new BankAccout("Abhishek",4456456567l,569.78,"Rabhi@oop.com",3456666666l);

        System.out.println(bankAccount.getCustomerName());
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getCustomerEmailId());
        System.out.println(bankAccount.getCustomerPhoneNumber());
        System.out.println(bankAccount.getAccountBalance());
        bankAccount.depositAmount(678.86);
        bankAccount.withdrawAmount(876.45);

//        bankAccount1.depositAmount(765.98);
//        bankAccount1.withdrawAmount(1000.76);
    }
}

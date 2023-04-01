package com.viettel.test.OCA11.chuong11Encapsulation.protectedaccessmodifiers.com.mybank.hr;

import com.viettel.test.OCA11.chuong11Encapsulation.protectedaccessmodifiers.com.mybank.accts.Account;
import com.viettel.test.OCA11.chuong11Encapsulation.protectedaccessmodifiers.com.mybank.newhr.NewHRAccount;

class Outer{

}


public class HRAccount extends Account {
    public class Inner3 {

    }
    private class Inner1{

    }
    protected class Inner2 {

    }
    class Inner4 {

    }
    public static void main(String[] args) {
        //Account account = new Account();
        //account.acctId = "123";
        HRAccount hrAccount = new HRAccount();
        hrAccount.acctId = "123";

        NewHRAccount newHRAccount = new NewHRAccount();
        newHRAccount.acctId = "567";// HRAccount own truong acctId cua NewHRAccount
        //newHRAccount.name = "";// HRAccount not own truong acctId cua NewHRAccount

    }
}

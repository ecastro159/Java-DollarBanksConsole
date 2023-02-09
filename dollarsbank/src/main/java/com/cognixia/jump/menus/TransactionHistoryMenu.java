package com.cognixia.jump.menus;
import java.util.List;

import com.cognixia.jump.DAO.TransactionDAOClass;
import com.cognixia.jump.model.AccountTransaction;

public class TransactionHistoryMenu {
    TransactionDAOClass history = new TransactionDAOClass();
    AccountTransaction accountHisotry = new AccountTransaction();
    public void history(int userID){
        System.out.println("List of last 5 Transactions: ");
        List<AccountTransaction> list  = history.getLastFiveTransaction(userID);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


            
    }
}

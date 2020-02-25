package sample;

import java.util.ArrayList;

public class AccountList {
    private ArrayList<UserAccount> accountArrayList = new ArrayList<UserAccount>();

    public void addAccount(UserAccount account) {
        for (int i = 0; i < accountArrayList.size(); i++) {
//            if (accountArrayList.get(i).getUserName() > account.getUserName()) {
//
//            }
        }
    }

    public boolean accountAlreadyExists(UserAccount account) {
        for (int i = 0; i < accountArrayList.size(); i++) {
            if (account.equals(accountArrayList.get(i))) {
                return true;
            }
        }
        return false;
    }
}

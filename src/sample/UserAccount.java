package sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class UserAccount {
    private UUID userID;
    private String userName;
    private String password;
    private String email;
    private int blackMatter;
    private int userLevel;
    private Boolean userVIP;

    public UserAccount() {
        this.userID = generateUserID();
        this.userName = "User";
        this.password = "Pass";
        this.email = "Email";
        this.blackMatter = 0;
        this.userLevel = 0;
        this.userVIP = false;
    }

    UserAccount(String userName, String password, String email, int blackMatter, int userLevel, boolean userVIP) {
        //this.userID = userID;   // is it necessary?
        this.userID = generateUserID();
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.blackMatter = blackMatter;
        this.userLevel = userLevel;
        this.userVIP = userVIP;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBlackMatter(int blackMatter) {
        this.blackMatter = blackMatter;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }

    public void setUserVIP(boolean userVIP) {
        this.userVIP = userVIP;
    }

    public UUID getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getBlackMatter() {
        return blackMatter;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public Boolean getUserVIP() {
        return userVIP;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        UserAccount that = (UserAccount) o;
//        return blackMatter == that.blackMatter &&
//                userLevel == that.userLevel &&
//                userName.equals(that.userName) &&
//                password.equals(that.password) &&
//                email.equals(that.email) &&
//                userVIP.equals(that.userVIP);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(userName, password, email, blackMatter, userLevel, userVIP);
//    }
//
//    public boolean isBigger(UserAccount account) {
//        int minLength = Math.min(userName.length(), account.userName.length());
//        boolean lengthEquals;
//        if (userName.length() == account.userName.length()) {
//            lengthEquals = true;
//        } else {
//            lengthEquals = false;
//        }
//
//        for (int i = 0; i < minLength; i++) {
//            if (userName[i] > account.userName[i]) {    // ??
//
//            }
//        }
//    }


    @Override
    public String toString() {
//        System.out.println(userID);
//
//        System.out.println(userName);
//        System.out.println(password);
//        System.out.println(email);
//        System.out.println(blackMatter);
//        System.out.println(userVIP);
        String str = "\nUser ID: " + userID + "\nUserName: " + userName + "\nPassword: " + password + "\nEmail: " + email + "\nBlack Matter: " + blackMatter + "\nIs VIP: " + userVIP;
        return str;
    }


    private UUID generateUserID() {
        return UUID.randomUUID();
    }
}

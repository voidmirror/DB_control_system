package sample;

import java.util.Objects;

public class UserAccount {
    //private Long userID;
    private String userName;
    private String password;
    private String email;
    private int blackMatter;
    private int userLevel;
    private Boolean userVIP;

    UserAccount(String userName, String password, String email, int blackMatter, int userLevel, Boolean userVIP) {
        //this.userID = userID;   // is it necessary?
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.blackMatter = blackMatter;
        this.userLevel = userLevel;
        this.userVIP = userVIP;
    }

//    public void setUserID(Long userID) {
//        this.userID = userID;
//    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAccount that = (UserAccount) o;
        return blackMatter == that.blackMatter &&
                userLevel == that.userLevel &&
                userName.equals(that.userName) &&
                password.equals(that.password) &&
                email.equals(that.email) &&
                userVIP.equals(that.userVIP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, password, email, blackMatter, userLevel, userVIP);
    }

    public boolean isBigger(UserAccount account) {
        int minLength = Math.min(userName.length(), account.userName.length());
        boolean lengthEquals;
        if (userName.length() == account.userName.length()) {
            lengthEquals = true;
        } else {
            lengthEquals = false;
        }

        for (int i = 0; i < minLength; i++) {
            if (userName[i] > account.userName[i]) {    // ??

            }
        }
    }
}

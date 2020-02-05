package sample;

public class UserAccount {
    private Long userID;
    private String userName;
    private String password;
    private String email;
    private int blackMatter;
    private int userLevel;
    private Boolean userVIP;

    UserAccount(Long userID, String userName, String password, String email, int blackMatter, int userLevel, Boolean userVIP) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.blackMatter = blackMatter;
        this.userLevel = userLevel;
        this.userVIP = userVIP;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
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
}

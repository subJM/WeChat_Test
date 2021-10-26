package kr.or.mrhi.wechat.Data;

public class UserAuthData {
    private String userid; //프라이머리키
    private String password;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "UserAuthData{" +
                "userid='" + userid + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

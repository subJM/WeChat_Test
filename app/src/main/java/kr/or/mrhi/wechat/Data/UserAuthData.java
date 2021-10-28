package kr.or.mrhi.wechat.Data;

import java.util.ArrayList;

public class UserAuthData {
    private String userId; //프라이머리키
    private String password;

    public UserAuthData(){

    }

    public UserAuthData(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }



    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
                "userid='" + userId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

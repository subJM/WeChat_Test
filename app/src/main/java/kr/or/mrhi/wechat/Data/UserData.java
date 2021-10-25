package kr.or.mrhi.wechat.Data;

import java.util.ArrayList;

public class UserData {
    private String userid; //프라이머리키
    private String password;
    private String name;
    private String phoneNumber;
    private String age;
    private String address;
    private String photoUrl;
    private String firstJoin; //처음가입한날짜
    private String friends; // 친구목록
    private String getWrited; //작성한 게시판 아이디

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getFirstJoin() {
        return firstJoin;
    }

    public void setFirstJoin(String firstJoin) {
        this.firstJoin = firstJoin;
    }

    public String getFriends() {
        return friends;
    }

    public void setFriends(String friends) {
        this.friends = friends;
    }

    public String getGetWrited() {
        return getWrited;
    }

    public void setGetWrited(String getWrited) {
        this.getWrited = getWrited;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "userid='" + userid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

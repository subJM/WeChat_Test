package kr.or.mrhi.wechat.Data;

import java.util.ArrayList;

public class UserInfoData {
    private String firstJoin; //처음가입한날짜
    private String name;
    private String phoneNumber;
    private String age;
    private String address;

    public UserInfoData(){

    }

    public UserInfoData(String firstJoin, String name,  String phoneNumber, String age, String address) {
        this.firstJoin = firstJoin;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstJoin() {
        return firstJoin;
    }

    public void setFirstJoin(String firstJoin) {
        this.firstJoin = firstJoin;
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

}

package kr.or.mrhi.wechat.Data;

public class UserAuthData {
    private String userId; //프라이머리키
    private String password;
    private String firstJoin; //처음가입한날짜
    private String name;
    private String phoneNumber;
    private String age;
    private String address;
    private String nickName;


    public UserAuthData(){

    }

    public UserAuthData(String userId, String password, String firstJoin, String name, String phoneNumber, String age, String address, String nickName) {
        this.userId = userId;
        this.password = password;
        this.firstJoin = firstJoin;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.address = address;
        this.nickName = nickName;
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

    public String getFirstJoin() {
        return firstJoin;
    }

    public void setFirstJoin(String firstJoin) {
        this.firstJoin = firstJoin;
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "UserAuthData{" +
                "userid='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", firstJoin='" + firstJoin + '\'' +
                '}';
    }
}

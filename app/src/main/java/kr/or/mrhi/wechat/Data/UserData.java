package kr.or.mrhi.wechat.Data;

import java.util.ArrayList;

public class UserData {
    private String userId; //프라이머리키
    private String nickName;
    private String photoUrl;
    private ArrayList<String> friends; // 친구목록
    private ArrayList<BoardData> writed; //작성한 게시판 프라이머리키
    private ArrayList<Reply> messege; //주고받은 쪽지함 프라이머리키

    public UserData(){

    }

    public UserData(String userId,String nickName) {
        this.userId = userId;
        this.nickName = nickName;
    }

    public UserData(String userId,String nickName,String photoUrl) {
        this.userId = userId;
        this.nickName = nickName;
        this.photoUrl = photoUrl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public ArrayList<String> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<String> friends) {
        this.friends = friends;
    }

    public ArrayList<BoardData> getWrited() {
        return writed;
    }

    public void setWrited(ArrayList<BoardData> writed) {
        this.writed = writed;
    }

    public ArrayList<Reply> getMessege() {
        return messege;
    }

    public void setMessege(ArrayList<Reply> messege) {
        this.messege = messege;
    }
}

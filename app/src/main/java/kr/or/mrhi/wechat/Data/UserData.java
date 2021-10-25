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
    private String getFriends; // 친구목록
    private String firstJoin;
    private ArrayList<BoardData> getWrited; //작성한 게시판 가져오기
    //리플


}

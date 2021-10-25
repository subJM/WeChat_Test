package kr.or.mrhi.wechat.Data;

import java.util.ArrayList;

public class BoardData {
    private String writeId; // 게시판 프라이머리키
    private String PhotoUrl;
    private String date; //작성날짜
    private String textWrite; // 본문 내용
    private String favorite;
    private ArrayList<reply> getReply;//리플 가져오기

}

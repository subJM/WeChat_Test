package kr.or.mrhi.wechat.Data;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BoardData {
    private int writeId; // 게시판 프라이머리키
    private String PhotoUrl;
    private String date; //작성날짜
    private String textWrite; // 본문 내용
    private int favorite;
    private ArrayList<Reply> getReply;//리플 아이디 가져오기

}

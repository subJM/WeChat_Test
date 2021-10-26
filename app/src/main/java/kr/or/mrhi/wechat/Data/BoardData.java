package kr.or.mrhi.wechat.Data;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BoardData {
    private String userId; //작성자
    private int writeId; // 게시판 프라이머리키
    private String date; //작성날짜
    private String textWrite; // 본문 내용
    private String photoUrl;
    private int favorite;
    private ArrayList<Reply> getReply;//리플 아이디 가져오기

    public BoardData(){
    }

    public BoardData(String userId, int writeId, String date, String textWrite, String photoUrl, int favorite) {
        this.userId = userId;
        this.writeId = writeId;
        this.date = date;
        this.textWrite = textWrite;
        this.photoUrl = photoUrl;
        this.favorite = favorite;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getWriteId() {
        return writeId;
    }

    public void setWriteId(int writeId) {
        this.writeId = writeId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTextWrite() {
        return textWrite;
    }

    public void setTextWrite(String textWrite) {
        this.textWrite = textWrite;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public int getFavorite() {
        return favorite;
    }

    public void setFavorite(int favorite) {
        this.favorite = favorite;
    }
}

package kr.or.mrhi.wechat.Data;

public class Reply {
    private String userId; //프라이머리키
    private String writeId;
    private String nickName; //작성자
    private String date; //작성 날짜
    private String TextWrite; //본문내용
    private int favorite;

    public Reply() {
    }

    public Reply(String userId,String writeId, String nickName, String date, String textWrite) {
        this.userId = userId;
        this.writeId = writeId;
        this.nickName = nickName;
        this.date = date;
        this.TextWrite = textWrite;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWriteId() {
        return writeId;
    }

    public void setWriteId(String writeId) {
        this.writeId = writeId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTextWrite() {
        return TextWrite;
    }

    public void setTextWrite(String textWrite) {
        TextWrite = textWrite;
    }

    public int getFavorite() {
        return favorite;
    }

    public void setFavorite(int favorite) {
        this.favorite = favorite;
    }
}

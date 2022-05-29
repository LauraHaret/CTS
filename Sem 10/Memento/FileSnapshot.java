public class FileSnapshot {

    private String content;
    private String mesaj;

    public FileSnapshot(String content,String mesaj) {
        this.content = content;
        this.mesaj=mesaj;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

}
public class EBook extends Book {
    private String format;

    public EBook(String author, String name, int id, String format) {
        super(author, name, id);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("format is :" + format);
    }
}

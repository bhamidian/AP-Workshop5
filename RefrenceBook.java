public class RefrenceBook extends Book{
    private boolean RefrenceSection;

    public RefrenceBook(String author, String name, int id, boolean refrenceSection) {
        super(author, name, id);
        RefrenceSection = refrenceSection;
    }

    public boolean isRefrenceSection() {
        return RefrenceSection;
    }

    public void setRefrenceSection(boolean refrenceSection) {
        RefrenceSection = refrenceSection;
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("RefrenceSection is" + RefrenceSection);
    }
}

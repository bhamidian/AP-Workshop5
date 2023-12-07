public class Book {
    private String author;
    private String name;
    private int id;

    public Book(String author, String name, int id) {
        this.author = author;
        this.name = name;
        this.id = id;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void displayinfo(){
        System.out.println("Book ID" + id);
        System.out.println("Author is " + author);
        System.out.println("Name is" + name);

    }
}

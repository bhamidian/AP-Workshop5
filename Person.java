public class Person {
    private String name;
    private int contactinfo;

    public Person(String name, int contactinfo) {
        this.name = name;
        this.contactinfo = contactinfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(int contactinfo) {
        this.contactinfo = contactinfo;
    }
    public void displayinfo(String name, int contactinfo){
        System.out.println("name and contactinfo are" + name + contactinfo);
    }
    public boolean borrowBook(Library library, Book book) {
        if (library.removeBook(book)) {
            borrowedBook = book;
            System.out.println(name + " borrowed the book: " + book.getName());
            return true;
        } else {
            System.out.println("Book not available for borrowing.");
            return false;
        }
    }
    public void returnBook(Library library) {
        if (borrowedBook != null) {
            library.addBookToLibrary(borrowedBook);
            System.out.println(name + " returned the book: " + borrowedBook.getName());
            borrowedBook = null;
        } else {
            System.out.println("No book to return.");
        }
    }
    public void buyBook(Library library, Book book) {
        library.removeBook(book);
        System.out.println(name + " bought the book: " + book.getName());
    }

}

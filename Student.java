public class Student extends Person {
    private int studentID;

    public Student(String name, String contactInfo, int studentID) {
        super(name, contactInfo);
        this.studentID = studentID;
    }

    @Override
    public boolean borrowBook(Library library, Book book) {
        if (book instanceof ReferenceBook) {
            System.out.println("Students cannot borrow reference books.");
            return false;
        } else {
            return super.borrowBook(library, book);
        }
    }

    @Override
    public void returnBook(Library library) {
        super.returnBook(library);
    }

    @Override
    public void buyBook(Library library, Book book) {
        if (book instanceof ReferenceBook) {
            System.out.println("Students cannot buy reference books.");
        } else {
            super.buyBook(library, book);
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentID);
    }
}

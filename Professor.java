public class Professor extends Person {
    private int employeeID;

    public Professor(String name, String contactInfo, int employeeID) {
        super(name, contactInfo);
        this.employeeID = employeeID;
    }

    @Override
    public boolean borrowBook(Library library, Book book) {
        if (book instanceof EBook) {
            System.out.println("Professors cannot borrow EBooks.");
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
        if (book instanceof EBook) {
            System.out.println("Professors cannot buy EBooks.");
        } else {
            super.buyBook(library, book);
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeID);
    }
}

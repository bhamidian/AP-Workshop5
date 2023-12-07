public class Library {
    private Arraylist<Book> books;
    private Arraylist<Person> people;


    public Arraylist<Book> getBooks() {
        return books;
    }

    public void setBooks(Arraylist<Book> books) {
        this.books = books;
    }

    public Arraylist<Person> getPeople() {
        return people;
    }

    public void setPeople(Arraylist<Person> people) {
        this.people = people;
    }

    public Library(Arraylist<Book> books, Arraylist<Person> people) {
        this.books = books;
        this.people = people;
    }
    public Book addBookToLibrary(int id,String name,String author){
        Book book = new Book(id,name,author);
        books.add(book);
        return books;
    }
    public EBook addEBookToLibrary(String format){
        Book ebook = new Book(format);
        books.add(ebook);
        return books;
    }
    public RefrenceSection addRefrenceBooktoLibrary(RefrenceSection){
        Book refrencesection = new Book(RefrenceSection);
        books.add(refrencesection);
        return books;
    }
    public student addStudent(String name,String contactInfo,String studentId){
        Person student = new Person(String name,String contactInfo,String studentId);
        people.add(student);
        return people;
    }
    public Professor addProfessor(String name,String contactInfo,String employeeID){
        Person Professor = new(String name,String contactInfo,String employeeID);
        people.add(Professor);
        return people;
    }
    public void addBook(Book nameofthebook){
        books.add(nameofthebook);

    }
    public void removeBook(Book nameofthebook){
        books.remove(nameofthebook);
    }
    public void displayAllBooks() {
        System.out.println("List of Books in the Library:");
        for (Book book : books) {
            book.displayInfo(book.getId(),book.getName(),book.getAuther());
            System.out.println("------------------------------");
        }
    }
    public double calculateTotalLibraryValue() {
        double totalValue = 0.0;
        for (Book book : books) {
            totalValue += 896;
        }
        return totalValue;
    }


}

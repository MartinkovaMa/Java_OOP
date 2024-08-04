package Homework00P;

public class Book {
    private String title;
    private String author;
    private int id;
    private int popularity; //počet výpujček

    public Book(String title, String author,int id) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.popularity = 0;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public int getPopularity() {
        return popularity;
    }

    public String getAuthor() {
        return author;

  }
    // Method to increase popularity by 1 for each loan
    public void loanBook() {
        popularity++;
    }

    // Define the equals method based on the id attribute
    public boolean equals(Book book) {
        return this.id == book.getId();
}

    public void borrowBook() {
    }

    public void returnBook() {
    }
}

package models;

public class Author {

    private String firstName;
    private String lastName;
    private String bookNo1;
    private String bookNo2;
    private String bookNo3;
    private String bookNo4;
    private String bookNo5;
    private int id;

    public Author(String firstName, String lastName, String bookNo1, String bookNo2, String bookNo3, String bookNo4, String bookNo5) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookNo1 = bookNo1;
        this.bookNo2 = bookNo2;
        this.bookNo3 = bookNo3;
        this.bookNo4 = bookNo4;
        this.bookNo5 = bookNo5;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBookNo1() {
        return bookNo1;
    }

    public String getBookNo2() {
        return bookNo2;
    }

    public String getBookNo3() {
        return bookNo3;
    }

    public String getBookNo4() {
        return bookNo4;
    }

    public String getBookNo5() {
        return bookNo5;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBookNo1(String bookNo1) {
        this.bookNo1 = bookNo1;
    }

    public void setBookNo2(String bookNo2) {
        this.bookNo2 = bookNo2;
    }

    public void setBookNo3(String bookNo3) {
        this.bookNo3 = bookNo3;
    }

    public void setBookNo4(String bookNo4) {
        this.bookNo4 = bookNo4;
    }

    public void setBookNo5(String bookNo5) {
        this.bookNo5 = bookNo5;
    }

    public void setId(int id) {
        this.id = id;
    }
}

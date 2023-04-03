package Homework12;

public class Book {
    String name;
    Author writer;
    int publisher;

    public Book(String name, Author writer, int publication) {
        this.name = name;
        this.writer=writer;
        this.publisher = publication;

    }
    public String getName(){return name;}
    public int getpublisher(){return publisher;}

    public void setName(String name){this.name=name;}
    public void setPublisher(int publisher){this.publisher=publisher;}

    public Author getWriter(){return writer;}
    public void setWriter(Author writer){this.writer=writer;}


}

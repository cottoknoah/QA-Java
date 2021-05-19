package com.qa.helloworld;

public class Book {

    //instance variables
    public String title;
    public String author;
    public int year;
    public String publisher;
    public double price;
    public boolean isFavorite;

    // Constructor
    public Book(String title,String author,int year,String publisher,double price, boolean isFavorite)
    {   this.title=title;
        this.author=author;
        this.year=year;
        this.publisher=publisher;
        this.price=price;
        this.isFavorite=isFavorite;
    }

    // Default Constructor -- constructor that takes in no arguments
    public Book()
    {   this.title= "Eragon";
        this.author= "C.P.";
        this.year=2002;
        this.publisher="Steve Jobs";
        this.price=24.99;
        this.isFavorite=isFavorite();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public String toString() {
        return "This book details are: " + title + ", " + author + ", " + year + ", " + publisher + ", " + price + ", " + isFavorite;
    }

    public void read(Book item) {
         // item.open(); // has to open the book
        // if() // its open, read book
        System.out.println(this.title + " reads the book titled: " + item.title);
    }

}


package com.qa.helloworld;

public class Book {

    public String title;
    public String author;
    public int year;
    public String publisher;
    public double price;

    // Constructor
    public Book(String title,String author,int year,String publisher,double price)
    {   this.title=title;
        this.author=author;
        this.year=year;
        this.publisher=publisher;
        this.price=price;
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

    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }

}


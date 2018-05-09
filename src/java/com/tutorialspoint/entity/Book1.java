/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author tiago.lucas
 */
@Entity
@Table(name="book1")
public class Book1 implements Serializable{
    
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="book_id")
    private int book_id;
    
    @Column(name="name")
    private String name;
    
    private Set<Author> authors;
    
    public Book1(){
        
    }
    
    public Book1(int id, String name){
        this.book_id = id;
        this.name = name;
    }

    @Id
    public int getBook_Id() {
        return book_id;
    }

    public void setBook_Id(int id) {
        this.book_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}
    , fetch = FetchType.EAGER)
    @JoinTable(name = "book_author",
            joinColumns = {@JoinColumn(name="book_id")},
            inverseJoinColumns = {@JoinColumn(name = "author_id")})
    public Set<Author> getAuthors(){
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
    
}

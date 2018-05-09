/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.stateless;

import com.tutorialspoint.entity.Book1;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author tiago.lucas
 */
@Remote
public interface LibraryPersistentEntityRelationshipsRemote {
    void addBook(Book1 book);
    List<Book1> getBooks();
}

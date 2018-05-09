/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.stateless;

import com.tutorialspoint.entity.Book1;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tiago.lucas
 */
@Stateless
public class LibraryPersistentEntityRelationships implements LibraryPersistentEntityRelationshipsRemote {

    @PersistenceContext(unitName="LibraryPersistentEntityRelationshipsPU")
    private EntityManager entityManager;
    
    public void addBook(Book1 book) {
        entityManager.persist(book);
    }

    public List<Book1> getBooks() {
        return entityManager.createQuery("From Book1").getResultList();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}

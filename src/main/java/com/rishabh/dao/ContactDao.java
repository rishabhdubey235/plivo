package com.rishabh.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.rishabh.models.Contact;

@RepositoryRestResource(collectionResourceRel = "contact", path = "contact")
public interface ContactDao extends PagingAndSortingRepository<Contact, Long> {

    @RestResource(path = "email", rel = "email")
    public Page<Contact> findByEmail(@Param("email") String email, Pageable page);
    @RestResource(path = "name", rel = "name")
    public Page<Contact> findByName(@Param("name") String name, Pageable page);

}

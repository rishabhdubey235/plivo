package com.rishabh;

import com.rishabh.dao.ContactDao;
import com.rishabh.models.Contact;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlivoContactApplicationTests {
    
    @Autowired
    private ContactDao dao;
    
    private Contact savedContact;
    private String email = "r@gmail,com";
    
    @Before
    public void init() {
        Contact contact = new Contact("98765434567", "rish", email);
        savedContact = dao.save(contact);
    }

	@Test
	public void searchEmailTest_success() {
	    Pageable page = new PageRequest(0, 1);
        Page<Contact> dbResult = dao.findByEmail(email, page );
        Assert.assertEquals(savedContact.toString(), dbResult.getContent().get(0).toString());
        Assert.assertEquals(email, dbResult.getContent().get(0).getEmail());
	}
	
	@After
	public void destroy() {
	    dao.delete(savedContact);
	}

}

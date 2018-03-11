package com.rishabh.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Entity
@Data
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "email" }))
public class Contact {

    @Id
    @GeneratedValue
    private long id;
    @Column
    private String number;
    @Column
    private String name;
    @Column
    private String email;

    public Contact(String number, String name, String email) {
        super();
        this.number = number;
        this.name = name;
        this.email = email;
    }

    public Contact() {
        super();
    }

	public String getEmail() {
		return this.email;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", number=" + number + ", name=" + name + ", email=" + email + "]";
	}
	
	

}

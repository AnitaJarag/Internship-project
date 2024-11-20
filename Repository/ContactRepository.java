package com.project.internship.Repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.internship.model.Contact;

@Repository
@Qualifier("contRepo")
public interface ContactRepository extends JpaRepository<Contact,Long>{

}

package com.project.internship.Repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.internship.model.Apply;

@Repository
@Qualifier("apRepo")
public interface ApplyRepository extends JpaRepository<Apply,Long> {

}

package com.project.internship.Repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.internship.model.AdminLogin;

@Repository
@Qualifier("admRepo")
public interface AdminLoginRepository extends JpaRepository<AdminLogin,Long>
{
	@Query(nativeQuery = true,value = "select * from register where emailid=:emailid and password=:password")
	AdminLogin findByEmailIdAndPassword(@Param("emailid")String emailid,@Param("password")String password);
}

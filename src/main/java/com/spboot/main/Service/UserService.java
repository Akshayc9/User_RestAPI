package com.spboot.main.Service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spboot.main.Entity.User;

@Repository
public interface UserService extends JpaRepository<User, Long>{
	List<User> findByempRole(String empRole);
}

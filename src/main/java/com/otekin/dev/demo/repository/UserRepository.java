package com.otekin.dev.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.otekin.dev.demo.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
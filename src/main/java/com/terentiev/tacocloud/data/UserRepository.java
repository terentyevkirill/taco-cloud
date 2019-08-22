package com.terentiev.tacocloud.data;

import com.terentiev.tacocloud.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}

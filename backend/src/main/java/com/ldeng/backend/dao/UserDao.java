package com.ldeng.backend.dao;

import com.ldeng.backend.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by caglarturkurka on 7.10.2016.
 */
@Repository
public interface UserDao extends CrudRepository<User,Long> {
    User save(User user);

}

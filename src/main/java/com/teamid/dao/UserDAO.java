package com.teamid.dao;

import com.teamid.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Skye on 2017/6/3.
 */
@Repository
public interface UserDAO {

    boolean add(User user);

    User findUserById(long id);

    User findUserByPhone(String phone);

}

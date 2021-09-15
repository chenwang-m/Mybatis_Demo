package com.codingfuture.mapper;

import com.codingfuture.entity.User;

public interface UserMapper {
    //User findUserWithItemByUserId(Integer id);
    User findDetailAllByUserId(Integer id);
}

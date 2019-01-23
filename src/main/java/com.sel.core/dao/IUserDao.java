package com.sel.core.dao;

import com.sel.core.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {

    @Select(value = "SELECT * FROM t_user WHERE account = #{account}")
    User getUserByAccount(String account);
}

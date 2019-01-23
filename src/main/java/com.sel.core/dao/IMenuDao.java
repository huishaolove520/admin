package com.sel.core.dao;

import com.sel.core.entity.Menu;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IMenuDao {

    @Select(value = "SELECT COUNT(DISTINCT(name)) FROM t_menu")
    int getMenuCount();

    @Select(value = "SELECT * FROM t_menu")
    List<Menu> getAllMenu();
}

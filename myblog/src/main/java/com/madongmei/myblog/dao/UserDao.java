package com.madongmei.myblog.dao;

import com.madongmei.myblog.model.User;
import org.apache.ibatis.annotations.*;

/**
 * Created by laxe on 2018/1/3.
 */
@Mapper
public interface UserDao {
    String TABLE_NAME=" user ";
    String INSERT_FIELDS=" name, password, salt, headurl, role ";
    String SELECT_FIEDLS=" id, " + INSERT_FIELDS;

    @Insert({"insert into",TABLE_NAME,"(",INSERT_FIELDS,") values (#{name},#{password},#{salt},#{headurl},#{role})"})
    public void insertUser(User user);

    @Select({"select",SELECT_FIEDLS,"from",TABLE_NAME,"where id=#{id}"})
    public User selectById(int id);

    @Select({"select",SELECT_FIEDLS,"from",TABLE_NAME,"where name=#{name}"})
    public User selectByName(@Param("name") String name);

    @Delete({"delete from",TABLE_NAME,"where id=#{id}"})
    public void deleteById(int id);
}

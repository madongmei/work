package com.madongmei.myblog.dao;

import com.madongmei.myblog.model.LoginTicket;
import org.apache.ibatis.annotations.*;

/**
 * Created by laxe on 2018/1/3.
 */
@Mapper
public interface LoginTicketDao {
    String TABLE_NAME=" loginticket ";
    String INSRT_FIELDS=" userId, ticket, expired, status ";
    String SELECT_FIELDS=" id, " + INSRT_FIELDS;

    @Insert({"insert into",TABLE_NAME,"(",INSRT_FIELDS,") values (#{userId},#{ticket},#{expired},#{status})"})
    public void insertLoginTicket(LoginTicket loginTicket);

    @Select({"select",SELECT_FIELDS,"from",TABLE_NAME,"where id=#{id}"})
    public LoginTicket selectById(int id);

    @Select({"select",SELECT_FIELDS,"from",TABLE_NAME,"where tacket=#{ticket}"})
    public LoginTicket selectByTicket(String ticket);

    @Update({"update",TABLE_NAME,"set status=#{status} where ticket=#{ticket}"})
    public void updateStatus(@Param("ticket") String ticket,@Param("status") int status);

    @Delete({"delete from",TABLE_NAME,"where id=#{id}"})
    public void deleteById(int id);
}

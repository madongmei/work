package com.madongmei.myblog.dao;

import com.madongmei.myblog.model.Article;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by laxe on 2018/1/3.
 */

@Mapper
public interface ArticleDao {

    String TABLE_NAME=" article ";
    String INSERT_FIELDS=" title, describes, content, createdDate, commentCount, category";
    String SELECT_FIELDS=" id" + INSERT_FIELDS;

    @Insert({"insert into",TABLE_NAME,"(",INSERT_FIELDS,") values (#{title},#{describes}," +
            "#{content},#{createdDate},#{commentCount},#{category}"})
    public int insertArticle(Article article);


    @Select({"select",SELECT_FIELDS,"from",TABLE_NAME,"where id=#{id}"})
    public Article selectById(int id);

    @Select({"select",SELECT_FIELDS,"from",TABLE_NAME,"order by id desc limit #{offset},#{limit}"})
    public List<Article> selectLatestArticles(@Param("offset") int offset, @Param("limit") int limit);

    @Select({"select",SELECT_FIELDS,"from",TABLE_NAME,"where category=#{category} order by id desc limit #{offset},#{limit}"})
    public List<Article> selectArticlesByCategory(@Param("category") String category, @Param("offset") int offset, @Param("limit") int limit);

    @Select({"select count(id) from",TABLE_NAME,"where category=#{category}"})
    public int getArticleCountBycategory(@Param("category") String category);

    @Select({"select count(id) from",TABLE_NAME})
    public int getArticleCount();

    @Update({"update",TABLE_NAME,"set commentCount=#{commentCount} where questionId=#{questionId}"})
    public void updateCommentCount(@Param("questionId") int questionId,@Param("commentCount") int commentCount);

    @Delete({"delete from",TABLE_NAME,"where id=#{id}"})
    public void deleteById(int Id);
}

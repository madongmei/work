package com.madongmei.myblog.service;

import com.madongmei.myblog.dao.ArticleDao;
import com.madongmei.myblog.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by laxe on 2018/1/3.
 */
@Service
public class ArticleService {

    @Autowired
    private ArticleDao articleDao;

    public int addArticle(Article article){
        return articleDao.insertArticle(article);
    }

    public Article getArticleById(int id){
        return articleDao.selectById(id);
    }

    public int getArticleCount(){
        return articleDao.getArticleCount();
    }

    public int getArticleCountByCategory(String category){
        return articleDao.getArticleCountBycategory(category);
    }

    public List<Article> getLatestArticles(int offset,int limit){
        return articleDao.selectLatestArticles(offset,limit);
    }

    public List<Article> getArticlesByCategory(String category,int offset,int limit){
        return articleDao.selectArticlesByCategory(category,offset,limit);
    }

    public void updateCommentCount(int id,int count){
        articleDao.updateCommentCount(id,count);
    }
}

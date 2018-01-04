package com.madongmei.myblog.controller;

import com.madongmei.myblog.model.Article;
import com.madongmei.myblog.service.ArticleService;
import com.madongmei.myblog.util.MyBlogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * Created by laxe on 2018/1/3.
 */
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    public String addArticle(@RequestParam("title")String title,@RequestParam("category")String category,
                             @RequestParam("tag")String tag,@RequestParam("describes")String describes,
                             @RequestParam("content")String content){
        Article article=new Article();
        article.setTitle(title);
        article.setDescribes(describes);
        article.setCreatedDate(new Date());
        article.setCommentCount(0);
        article.setContent(MyBlogUtil.transfer(content));
        article.setCategory(category);

        int articleId=articleService.addArticle(article);
        return "redirect:/";
    }
}

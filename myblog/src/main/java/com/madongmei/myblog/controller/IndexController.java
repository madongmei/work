package com.madongmei.myblog.controller;

import com.madongmei.myblog.model.Article;
import com.madongmei.myblog.service.ArticleService;
import com.madongmei.myblog.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.ObjectView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by laxe on 2018/1/3.
 */
public class IndexController {

    @Autowired
    private UserService userService;

    @Autowired
    private ArticleService articleService;


    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/login")
    public String login(Model model, HttpServletResponse response, @RequestParam String username, @RequestParam String password,
                        @RequestParam(value = "next", required = false) String next) {
        Map<String, String> map = userService.login(username, password);
        if (map.containsKey("ticket")) {
            Cookie cookie = new Cookie("ticket", map.get("ticket"));
            cookie.setPath("/");
            response.addCookie(cookie);

            if (StringUtils.isBlank(next)) {
                return "redirect:" + next;
            }
            return "redirect:/";
        } else {
            model.addAttribute("msg", map.get("msg"));
            return "login";
        }
    }

    @RequestMapping("/register")
    public String register(Model model, HttpServletResponse response, @RequestParam String username,
                           @RequestParam String password, @RequestParam(value = "next", required = false) String next) {
        Map<String, String> map = userService.register(username, password);
        if (map.containsKey("ticket")) {
            Cookie cookie = new Cookie("ticket", map.get("ticket"));
            cookie.setPath("/");
            response.addCookie(cookie);
            if (StringUtils.isNotBlank(next))
                return "redirect:" + next;
            else
                return "redirect:/";
        } else {
            model.addAttribute("msg", map.get("msg"));
            return "login";
        }
    }

    @RequestMapping(path = {"/", "/index"})
    public String index(Model model) {
        List<ViewObject> ovs = new ArrayList<>();
        List<Article> articles = articleService.getLatestArticles(0, 4);
        for (Article article : articles) {
            ViewObject ov = new ViewObject();
            ov.set("article", article);
            ovs.add(ov);
        }

        ViewObject pagination = new ViewObject();
        int count = articleService.getArticleCount();
        User user = hostHolder.getUser();
        if (user==null||"admin".equals(user.getRole())){
            model.addAttribute("create",1);
        }else {
            model.addAttribute("create",0);
        }
        pagination.set("current",1);
        pagination.set("nextPage",2);
        pagination.set("lastPage",count/4+1);
        model.addAttribute("pagination",pagination);

        return "index";
    }
}






}

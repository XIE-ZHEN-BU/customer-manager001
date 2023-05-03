package com.xie.controller;

import com.xie.pojo.Books;
import com.xie.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller层调用service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部的书籍，并且返回到书籍的展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        //这里要调用的是业务层的方法 service层写好的
        List<Books> list=bookService.queryAllBook();
        model.addAttribute("list",list);

        return "allBook";
    }
    //跳转到 增加书籍的页面
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "addBook";
    }
    //添加书籍的方法
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBook="+books);
        bookService.addBook(books);
        //跳回到controller写的第一个请求，查询全部书籍
        return "redirect:/book/allBook";//重定向到@RequestMapping("/book")这个请求
    }

    //跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdatePaper(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("Qbook",books);

        return "updateBook";
    }
    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("updateBook=>"+books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";

    }
    //删除书籍
    @RequestMapping("/deleteBook/{bookID}")

    public String deleteBook(@PathVariable("bookID") int id){
        bookService.deleteBookById(id);

        return "redirect:/book/allBook";
    }
    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        Books books = bookService.queryBookByName(queryBookName);
        System.err.println("queryBookName=>"+books);
        List<Books> list=new ArrayList<Books>();
        list.add(books);

        if(books==null){
            list=bookService.queryAllBook();
            model.addAttribute("err","未查到");
        }

        model.addAttribute("list",list);
        return "/allBook";

    }


}

package com.xie.service;

import com.xie.dao.BookMapper;
import com.xie.pojo.Books;

import java.util.List;
//要重写
//先用类名 调用声明方法
//然后 创建Set方法 用THIS关键字实例化 对象
public class BookServiceImpl implements BookService{
    //service层调用dao层 组合DAO
    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper){
        this.bookMapper=bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    @Override
    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}

//业务层service 是调用DAO层的方法 并且去实现他
//现在service层还都是单精度方法所以看着和dao层一样
//实际上service每个方法可能会调用多个dao层方法来实现功能

//这里 到目前为止 都只是 Mybatis的内容 还没有用到 SPRING的注解

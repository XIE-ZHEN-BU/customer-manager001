package com.xie.service;

import com.xie.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    //接口一般是 增删改查的 接口
    //返回类型 + 方法名 + 查询的输入的参数类型
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById( int id);

    //修改一本书
    int updateBook(Books books);


    //查询一本书
    Books queryBookById( int id);

    //查询全部的书
    List<Books> queryAllBook();

    //根据书名查询书
    Books queryBookByName( String bookName);
}

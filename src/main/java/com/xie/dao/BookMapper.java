package com.xie.dao;

import com.xie.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //接口一般是 增删改查的 接口
    //返回类型 + 方法名 + 查询的输入的参数类型
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(@Param("bookId") int id);

    //修改一本书
    int updateBook(Books books);


    //根据ID查询一本书
    Books queryBookById(@Param("bookId") int id);

    //查询全部的书
    List<Books> queryAllBook();

    //根据书名查询书
    Books queryBookByName(@Param("bookName") String bookName);
}

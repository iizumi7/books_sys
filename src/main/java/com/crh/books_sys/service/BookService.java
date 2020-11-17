package com.crh.books_sys.service;

import com.crh.books_sys.entity.Book;

import java.util.List;

/**
 * (Book)表服务接口
 *
 * @author makejava
 * @since 2020-11-15 11:26:01
 */
public interface BookService {

    List<Book> getAllBooks();

    /**
     * 通过ID查询单条数据
     *
     * @param bid 主键
     * @return 实例对象
     */
    Book queryById(Integer bid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Book> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param book 实例对象
     * @return 实例对象
     */
    Integer insert(Book book);

    /**
     * 修改数据
     *
     * @param book 实例对象
     * @return 实例对象
     */
    Book update(Book book);

    /**
     * 通过主键删除数据
     *
     * @param bid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer bid);

}
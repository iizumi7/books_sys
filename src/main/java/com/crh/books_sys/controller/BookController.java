package com.crh.books_sys.controller;

import com.crh.books_sys.entity.Book;
import com.crh.books_sys.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * (Book)表控制层
 *
 * @author makejava
 * @since 2020-11-15 11:26:02
 */
@Controller
@RequestMapping("book")
public class BookController {
    /**
     * 服务对象
     */
    @Resource
    private BookService bookService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Book selectOne(Integer id) {
        return this.bookService.queryById(id);
    }

    @RequestMapping("getAllBooks")
    public ModelAndView getAllBooks(){
        ModelAndView model=new ModelAndView();

        List<Book> allBooks = bookService.getAllBooks();
        model.addObject("allBooks",allBooks)
                .setViewName("show.html");

        return model;
    }

    @RequestMapping("addBook")
    public ModelAndView addBook(String name,String author,String publish,Double price){
        ModelAndView model=new ModelAndView();

        Book book=new Book(null,name,author,publish,price,new Date());
        Integer insert = bookService.insert(book);
        model.setViewName("forward:/book/getAllBooks");

        return model;
    }

    @RequestMapping("deleteBook/{bid}")
    public String deleteBook(@PathVariable Integer bid){

        boolean b = bookService.deleteById(bid);

        return "forward:/book/getAllBooks";

    }

}
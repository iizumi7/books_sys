package com.crh.books_sys.service.impl;

import com.alibaba.excel.metadata.BaseRowModel;
import com.crh.books_sys.dao.BookDao;
import com.crh.books_sys.entity.Book;
import com.crh.books_sys.excel.ExcelUtil;
import com.crh.books_sys.service.ExcelService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service
public class ExcelServiceImpl implements ExcelService {

    @Resource
    BookDao bookDao;

    @Override
    public void exportBooksExcel(HttpServletResponse response) {

        List<Book> allBooks = bookDao.getAllBooks();
        ExcelUtil.writeExcel(response,allBooks,"books","book",new Book());

    }

    @Override
    public List<Object> importBooksExcel(MultipartFile excel, BaseRowModel model) {

        List<Object> list = ExcelUtil.readExcel(excel, model);
        bookDao.insertBatch(list);

        return list;
    }


}

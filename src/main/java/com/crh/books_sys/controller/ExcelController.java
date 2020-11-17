package com.crh.books_sys.controller;

import com.crh.books_sys.entity.Book;
import com.crh.books_sys.service.ExcelService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("excel")
public class ExcelController {

    @Resource
    ExcelService excelService;

    @RequestMapping("export")
    public void writeExcel(HttpServletResponse response) {

        excelService.exportBooksExcel(response);

    }

    @RequestMapping("import")
    public String readExcel(@RequestParam("excel") MultipartFile excel){
        List<Object> list = excelService.importBooksExcel(excel, new Book());
//        System.out.println();

        return "forward:/book/getAllBooks";
    }

}

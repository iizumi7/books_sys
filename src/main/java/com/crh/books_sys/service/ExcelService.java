package com.crh.books_sys.service;

import com.alibaba.excel.metadata.BaseRowModel;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface ExcelService {

    void exportBooksExcel(HttpServletResponse response);

    List<Object> importBooksExcel(MultipartFile excel, BaseRowModel model);

}

package com.inn.cafe.service;

import com.inn.cafe.POJO.Category;
import com.inn.cafe.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface CategoryService {
    ResponseEntity<String> addNewCategory(Map<String, String> requestMap);

    ResponseEntity<List<Category>> getALlCategory(String filterValue);

    ResponseEntity<String> updateCategory(Map<String, String> requestMap);
}

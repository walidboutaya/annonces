package dz.mantouri.annonces.controller;

import dz.mantouri.annonces.service.CategoriesService;
import dz.mantouri.annonces.service.CategoriesService.ShownCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoriesController {

    @Autowired
    private CategoriesService categoriesService;

    @GetMapping("/categories")
    public List<ShownCategory> getCategories() {
        return categoriesService.getCategories();
    }
}

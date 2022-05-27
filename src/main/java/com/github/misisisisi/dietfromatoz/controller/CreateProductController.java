package com.github.misisisisi.dietfromatoz.controller;

import com.github.misisisisi.dietfromatoz.model.ProductEntity;
import com.github.misisisisi.dietfromatoz.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("/addProduct")
@RequiredArgsConstructor
public class CreateProductController {

    private final ProductService productService;

    @GetMapping
    public String addNewProduct(Model model) {
        model.addAttribute("createProductForm", new CreateProductForm());
        return "product/add";
    }

    @PostMapping
    public String processView(@ModelAttribute("createProductForm") @Valid CreateProductForm createProductForm, BindingResult result) {
        if (result.hasErrors()) {
            return "product/add";
        } else {
            productService.saveProduct(createProductForm);
            return "product/added";
        }
    }
}
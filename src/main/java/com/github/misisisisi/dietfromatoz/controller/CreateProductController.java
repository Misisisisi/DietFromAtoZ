package com.github.misisisisi.dietfromatoz.controller;

import com.github.misisisisi.dietfromatoz.model.ProductEntity;
import com.github.misisisisi.dietfromatoz.model.UserEntity;
import com.github.misisisisi.dietfromatoz.repository.UserRepository;
import com.github.misisisisi.dietfromatoz.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
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
    private final UserRepository userRepository;

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
            UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
            org.springframework.security.core.userdetails.UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            UserEntity username = userRepository.findUserByUsername(userDetails.getUsername());

            productService.saveProduct(createProductForm, username);
            return "product/added";
        }
    }
}
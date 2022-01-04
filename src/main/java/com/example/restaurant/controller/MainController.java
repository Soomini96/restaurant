package com.example.restaurant.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final ReviewController controller;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/list")
    public String reviewList(HttpServletRequest request) {
        return controller.getReviews(request);
    }

    @GetMapping("/reviewWrite")
    public String reviewWrite(){
        return "review/reviewWrite";
    }

    @GetMapping("/reviewView")
    public String reviewView(@RequestParam int no, HttpServletRequest request){
        return controller.getReview(no, request);
    }
    @GetMapping("/reviewDelete")
    public String reviewDelete(HttpServletRequest request){
        return controller.deleteReview(request);
    }
    @GetMapping("/reviewUpdatePage")
    public String reviewUpdatePage(HttpServletRequest request){
        return controller.reviewUpdatePage(request);
    }

    @PostMapping("/update")
    public String reviewUpdate(@RequestParam Map<String,String> formdata, HttpServletRequest request){
        return controller.reviewUpdate(formdata, request);
    }
}

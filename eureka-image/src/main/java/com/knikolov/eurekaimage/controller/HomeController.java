package com.knikolov.eurekaimage.controller;

import com.knikolov.eurekaimage.enitities.Image;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping("/images")
    public List<Image> getImages() {
        return Arrays.asList(
            new Image(1, "Title 1", "link1"),
            new Image(2, "Title 2", "link2"),
            new Image(3, "Title 3", "link3")
        );
    }

}

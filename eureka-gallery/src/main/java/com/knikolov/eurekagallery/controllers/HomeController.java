package com.knikolov.eurekagallery.controllers;

import com.knikolov.eurekagallery.entities.Gallery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Environment environment;

    @RequestMapping("/")
    public String home() {
        return "Gallery Service at port:" + environment.getProperty("local.server.port");
    }

    @RequestMapping("/{id}")
    public Gallery getGallery(@PathVariable int id) {
        Gallery gallery = new Gallery();
        gallery.setId(id);

        List<Object>images = restTemplate.getForObject("http://image-service/images", List.class);
        gallery.setImages(images);

        return gallery;
    }

    @RequestMapping("/admin")
    public String getAdmin() {
        return "Admin at port" + environment.getProperty("local.server.port");
    }

}

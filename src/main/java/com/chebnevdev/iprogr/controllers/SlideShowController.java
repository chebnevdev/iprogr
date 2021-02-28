package com.chebnevdev.iprogr.controllers;

import com.chebnevdev.iprogr.data.PexelsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.thymeleaf.util.StringUtils;

import java.io.IOException;
import java.util.stream.Collectors;


@Controller
public class SlideShowController {

    @Value("${pexels.api.key}")
    String pexelsApiKey;

    @GetMapping({"/slideshow/{category}", "/slideshow"})
    public String slideShow(
            Model model,
            @PathVariable(name = "category", required = false) String category
    ) throws IOException {

        System.out.println("Got called with category: " + category);

        category = StringUtils.isEmpty(category) ? "cats" : category;

        ObjectMapper mapper = new ObjectMapper();

        try (CloseableHttpClient client = HttpClients.createDefault()) {

            HttpGet request = new HttpGet("https://api.pexels.com/v1/search?query=" + category + "&per_page=5");
            request.addHeader("Authorization", pexelsApiKey);

            var response = client.execute(request, httpResponse ->
                    mapper.readValue(httpResponse.getEntity().getContent(), PexelsResponse.class));

            var imageUrls = response.getPhotos().stream().map(photo -> photo.getSrc().getLarge()).collect(Collectors.toList());

            model.addAttribute("imageUrls", imageUrls);
        }

        return "slideshow";
    }
}

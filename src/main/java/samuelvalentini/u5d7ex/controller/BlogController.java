package samuelvalentini.u5d7ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import samuelvalentini.u5d7ex.Blog;
import samuelvalentini.u5d7ex.service.BlogService;

import java.util.List;

@RestController
@RequestMapping("/blogPosts")
public class BlogController {
    private BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping
    public List<Blog> findAll() {
        return this.blogService.findAll();
    }

}

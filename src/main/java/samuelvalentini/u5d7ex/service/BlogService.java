package samuelvalentini.u5d7ex.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import samuelvalentini.u5d7ex.Blog;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class BlogService {
    private List<Blog> blogsDB = new ArrayList<>();

    public List<Blog> findAll() {
        return blogsDB;
    }
}

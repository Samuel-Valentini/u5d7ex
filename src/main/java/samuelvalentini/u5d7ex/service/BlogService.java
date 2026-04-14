package samuelvalentini.u5d7ex.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import samuelvalentini.u5d7ex.Blog;
import samuelvalentini.u5d7ex.exception.NotFoundException;
import samuelvalentini.u5d7ex.playload.BlogPlayload;
import samuelvalentini.u5d7ex.playload.UpdateBlogPlayload;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class BlogService {
    private List<Blog> blogsDB = new ArrayList<>();

    public List<Blog> findAll() {
        return blogsDB;
    }

    public Blog findById(long blogId) {
        Blog found = null;
        for (Blog blog : blogsDB) {
            if (blog.getId() == blogId) {
                found = blog;
            }
            ;
        }
        if (found == null) throw new NotFoundException(String.valueOf(blogId));
        return found;
    }

    public Blog saveNewBlog(BlogPlayload blogPlayload) {
        Blog blog = new Blog(blogPlayload.getCategoria(), blogPlayload.getTitolo(), blogPlayload.getContenuto());
        this.blogsDB.add(blog);
        return blog;
    }

    public Blog findByIdAndUpdate(long blogId, UpdateBlogPlayload updateBlogPlayload) {
        Blog found = null;
        for (Blog blog : blogsDB) {
            if (blog.getId() == blogId) {
                found = blog;
                found.setCategoria(updateBlogPlayload.getCategoria());
                found.setTitolo(updateBlogPlayload.getTitolo());
                found.setContenuto(updateBlogPlayload.getContenuto());
                found.setCover(updateBlogPlayload.getCover());
                found.setTempoDiLettura(updateBlogPlayload.getTempoDiLettura());
            }

        }
        if (found == null) throw new NotFoundException(String.valueOf(blogId));
        return found;
    }

    public void deleteBlog(long blogId) {
        Blog found = null;
        for (Blog blog : blogsDB) {
            if (blog.getId() == blogId) {
                found = blog;
            }
            ;
        }
        if (found == null) throw new NotFoundException(String.valueOf(blogId));
        this.blogsDB.remove(found);
    }

}

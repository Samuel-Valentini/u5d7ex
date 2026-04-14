package samuelvalentini.u5d7ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import samuelvalentini.u5d7ex.enumeration.Categoria;
import samuelvalentini.u5d7ex.playload.BlogPlayload;
import samuelvalentini.u5d7ex.service.BlogService;

@SpringBootApplication
public class U5d7exApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(U5d7exApplication.class, args);

        BlogPlayload blog1 = new BlogPlayload(Categoria.GOSSIP, "primo post", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        BlogPlayload blog2 = new BlogPlayload(Categoria.GOSSIP, "secondo post", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        BlogPlayload blog3 = new BlogPlayload(Categoria.GOSSIP, "secondo post", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        BlogService blogService = ctx.getBean(BlogService.class);
        blogService.saveNewBlog(blog1);
        blogService.saveNewBlog(blog2);
        blogService.saveNewBlog(blog3);
		

    }

}

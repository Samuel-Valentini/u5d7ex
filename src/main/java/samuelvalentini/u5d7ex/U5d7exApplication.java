package samuelvalentini.u5d7ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import samuelvalentini.u5d7ex.enumeration.Categoria;
import samuelvalentini.u5d7ex.playload.AutorePlayload;
import samuelvalentini.u5d7ex.playload.BlogPlayload;
import samuelvalentini.u5d7ex.service.AutoreService;
import samuelvalentini.u5d7ex.service.BlogService;

import java.time.LocalDate;

@SpringBootApplication
public class U5d7exApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(U5d7exApplication.class, args);

        BlogPlayload blog1 = new BlogPlayload(Categoria.GOSSIP, "primo post", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        BlogPlayload blog2 = new BlogPlayload(Categoria.GOSSIP, "secondo post", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        BlogPlayload blog3 = new BlogPlayload(Categoria.GOSSIP, "terzo post", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        BlogService blogService = ctx.getBean(BlogService.class);
        blogService.saveNewBlog(blog1);
        blogService.saveNewBlog(blog2);
        blogService.saveNewBlog(blog3);

        AutorePlayload autore1 = new AutorePlayload("Gino", "Fini", "ciao@ciao.it", LocalDate.now().minusYears(22));
        AutorePlayload autore2 = new AutorePlayload("Gino2", "Fini2", "ciao@ciao.it", LocalDate.now().minusYears(32));
        AutorePlayload autore3 = new AutorePlayload("Gino3", "Fini3", "ciao@ciao.it", LocalDate.now().minusYears(42));

        AutoreService autoreService = ctx.getBean(AutoreService.class);
        autoreService.saveNewAutore(autore1);
        autoreService.saveNewAutore(autore2);
        autoreService.saveNewAutore(autore3);
    }

}

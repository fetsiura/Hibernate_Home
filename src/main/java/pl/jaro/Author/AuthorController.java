package pl.jaro.Author;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.jaro.Article.Article;
import pl.jaro.Article.ArticleDao;

import java.util.Objects;

@Controller
@RequestMapping("/articles")
public class AuthorController {

    private AuthorDao authorDao;

    public AuthorController(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String get(@PathVariable Long id){

       return authorDao.find(id)
               .map( Objects::toString)
               .orElse("author not exist");
    }


    @PostMapping
    public void create(@RequestBody Author author){

        authorDao.save(author);
    }

    @PostMapping("/{id}/{name}")
    @ResponseBody
    public void update(@PathVariable Long id,
                       @PathVariable String name){
        Author author = authorDao.find(id).orElseThrow(RuntimeException::new);
        author.setName(name);
        authorDao.merge(author);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void delete (@PathVariable Long id){

        authorDao.delete(id);
    }
}

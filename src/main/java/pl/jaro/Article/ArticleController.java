package pl.jaro.Article;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
@RequestMapping("/articles")
public class ArticleController {

    private ArticleDao articleDao;

    public ArticleController(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String get(@PathVariable Long id){

       return articleDao.find(id)
               .map( Objects::toString)
               .orElse("article not exist");
    }


    @PostMapping
    public void create(@RequestBody Article article){

        articleDao.save(article);
    }

    @PostMapping("/{id}/{title}")
    @ResponseBody
    public void update(@PathVariable Long id,
                       @PathVariable String title){

        Article article = articleDao.find(id).orElseThrow(RuntimeException::new);
        article.setTitle(title);
        articleDao.merge(article);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void delete (@PathVariable Long id){

        articleDao.delete(id);
    }
}

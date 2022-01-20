package pl.jaro.Category;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.jaro.Author.Author;
import pl.jaro.Author.AuthorDao;

import java.util.Objects;

@Controller
@RequestMapping("/articles")
public class CategoryController {

    private CategoryDao categoryDao;

    public CategoryController(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String get(@PathVariable Long id){

       return categoryDao.find(id)
               .map( Objects::toString)
               .orElse("author not exist");
    }


    @PostMapping
    public void create(@RequestBody Category category){

        categoryDao.save(category);
    }

    @PostMapping("/{id}/{name}")
    @ResponseBody
    public void update(@PathVariable Long id,
                       @PathVariable String description){
        Category category = categoryDao.find(id).orElseThrow(RuntimeException::new);
        category.setDescription(description);
        categoryDao.merge(category);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void delete (@PathVariable Long id){

        categoryDao.delete(id);
    }
}

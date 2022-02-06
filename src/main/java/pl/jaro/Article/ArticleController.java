package pl.jaro.Article;

import org.dom4j.rule.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.jaro.Author.Author;
import pl.jaro.Author.AuthorRepository;
import pl.jaro.Category.Category;
import pl.jaro.Category.CategoryRepository;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleRepository articleRepository;
    private final AuthorRepository authorRepository;
    private final CategoryRepository categoryRepository;

    public ArticleController(ArticleRepository articleRepository, AuthorRepository authorRepository, CategoryRepository categoryRepository) {
        this.articleRepository = articleRepository;
        this.authorRepository = authorRepository;
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/form")
    public String getForm(Model model){
        model.addAttribute("article",new Article());
        return "/article/create";

    }


    @PostMapping("/form")
    public String createProcess(@Valid Article article, BindingResult result){

        if(result.hasErrors()){
            return "/article/create";
        }
        articleRepository.save(article);
        return "redirect:/articles";
    }

    @GetMapping("/edit/{id}")
    public String getEditForm(@PathVariable Long id,Model model){

        model.addAttribute("article",articleRepository.findByIdWithCategories(id).orElseThrow());
        return "/article/edit";
    }

    @PostMapping("/update")
    public String update(@Valid Article article,
                         BindingResult result){
        if(result.hasErrors()){
            return "/article/edit";
        }

        articleRepository.save(article);
        return "redirect:/articles";

    }

    @GetMapping("/delete/{id}")
    public String delete (@PathVariable Long id){
        articleRepository.deleteById(id);
        return"redirect:/articles";
    }

    @GetMapping
    public String findAll(Model model){
        model.addAttribute("articles",articleRepository.findAll());
        return "/article/articlesPage";
    }

    @ModelAttribute("authors")
    List<Author> authors(){
        return authorRepository.findAll();
    }
    @ModelAttribute("categories")
    List<Category> categories(){
        return categoryRepository.findAll();
    }
}

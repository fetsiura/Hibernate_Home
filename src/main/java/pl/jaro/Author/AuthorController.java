package pl.jaro.Author;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.jaro.Article.Article;
import pl.jaro.Article.ArticleRepository;
import pl.jaro.Category.CategoryRepository;

import javax.validation.Valid;
import java.util.Objects;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/authors")
public class AuthorController {

    private final ArticleRepository articleRepository;
    private final AuthorRepository authorRepository;
    private final CategoryRepository categoryRepository;

    public AuthorController(ArticleRepository articleRepository, AuthorRepository authorRepository, CategoryRepository categoryRepository) {
        this.articleRepository = articleRepository;
        this.authorRepository = authorRepository;
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/form")
    public String getForm(Model model){
        model.addAttribute("author",new Author());
        return "/author/create";

    }


    @PostMapping("/form")
    public String createProcess(@Valid Author author, BindingResult result){

        if(result.hasErrors()){
            return "/author/create";
        }
        authorRepository.save(author);
        return "redirect:/authors";
    }

    @GetMapping("/edit/{id}")
    public String getEditForm(@PathVariable Long id,Model model){

        model.addAttribute("author",authorRepository.findById(id).orElseThrow());
        return "/author/edit";
    }

    @PostMapping("/update")
    public String update(@Valid Author author,
                         BindingResult result){
        if(result.hasErrors()){
            return "/author/edit";
        }

        authorRepository.save(author);
        return "redirect:/authors";

    }

    @GetMapping("/delete/{id}")
    public String delete (@PathVariable Long id){
        authorRepository.deleteById(id);
        return"redirect:/authors";
    }

    @GetMapping
    public String findAll(Model model){
        model.addAttribute("authors",authorRepository.findAll());
        return "/author/authorsPage";
    }
}

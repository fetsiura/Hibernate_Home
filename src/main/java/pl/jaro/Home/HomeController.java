package pl.jaro.Home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.jaro.Article.ArticleDao;
import pl.jaro.Category.Category;
import pl.jaro.Category.CategoryDao;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    private final ArticleDao articleDao;
    private final CategoryDao categoryDao;

    public HomeController(ArticleDao articleDao, CategoryDao categoryDao) {
        this.articleDao = articleDao;
        this.categoryDao = categoryDao;
    }

    @GetMapping
    public String home (Model model){
        model.addAttribute("articles",articleDao.getLastFive());
        return "/home";
    }


    @ModelAttribute("categories")
    public List<Category> categories(){
        return categoryDao.findAll();
    }
}

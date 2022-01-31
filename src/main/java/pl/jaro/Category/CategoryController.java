package pl.jaro.Category;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.jaro.Author.Author;
import pl.jaro.Author.AuthorDao;
import pl.jaro.common.Confirm;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/categories")
@Slf4j
public class CategoryController {

    private final CategoryDao categoryDao;
    private final Confirm confirm;

    public CategoryController(CategoryDao categoryDao, Confirm confirm) {
        this.categoryDao = categoryDao;
        this.confirm = confirm;
    }

    @GetMapping
    public String findAll(Model model){
        model.addAttribute("categories",categoryDao.findAll());

        return "/category/categoriesPage";
    }


    @GetMapping("/form")
    public String getCreateForm(Model model){
        model.addAttribute("category",new Category());
        return "/category/create";
    }

    @PostMapping("/form")
    public String create(Category category){
        categoryDao.save(category);
        return "redirect:/categories";
    }

    @GetMapping("/edit/{id}")
    public String getEditForm(@PathVariable("id") Long id,
                              Model model){
        model.addAttribute("category",categoryDao.find(id).orElseThrow());
        return "/category/edit";
    }

    @PostMapping("/update")
    public String update(Category category){
        categoryDao.merge(category);
        return "redirect:/categories";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        int check = confirm.check();
        if(check==0){

            try {
                categoryDao.delete(id);

            }catch (Exception e){
                log.error("Nie można usunąć kategorii ... Bo TAK ... ");
                return "redirect:/categories";

            }
        }
        return "redirect:/categories";
    }
}

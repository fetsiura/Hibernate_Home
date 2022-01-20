package pl.jaro.Category;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.jaro.Author.Author;
import pl.jaro.common.GenericDao;
@Transactional
@Repository
public class CategoryDao extends GenericDao<Category> {

    CategoryDao(){
        super(Category.class);
    }
}

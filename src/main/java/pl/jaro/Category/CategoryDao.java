package pl.jaro.Category;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.jaro.Article.Article;
import pl.jaro.common.GenericDao;

import javax.persistence.Query;
import java.util.List;

@Repository
public class CategoryDao extends GenericDao<Category> {

    CategoryDao(){
        super(Category.class);
    }

    @Transactional(readOnly = true)
    public List<Category> findAll (){

        Query query = entityManager.createQuery("select c from categories c");

        return query.getResultList();
    }
}

package pl.jaro.Article;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.jaro.common.GenericDao;

import javax.persistence.Query;
import java.util.List;

@Repository
public class ArticleDao extends GenericDao<Article> {

    ArticleDao(){
        super(Article.class);
    }

    @Transactional(readOnly = true)
    public List<Article> findAll (){

        Query query = entityManager.createQuery("select a from articles a");

        return query.getResultList();
    }
}

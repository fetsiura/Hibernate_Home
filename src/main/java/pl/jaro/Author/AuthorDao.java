package pl.jaro.Author;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.jaro.Article.Article;
import pl.jaro.common.GenericDao;

import javax.persistence.Query;
import java.util.List;

@Repository
public class AuthorDao extends GenericDao<Author> {

    AuthorDao(){
        super(Author.class);
    }

    @Transactional(readOnly = true)
    public List<Author> findAll (){

        Query query = entityManager.createQuery("select a from authors a");

        return query.getResultList();
    }
}

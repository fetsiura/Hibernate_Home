package pl.jaro.Author;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.jaro.Article.Article;
import pl.jaro.common.GenericDao;
@Transactional
@Repository
public class AuthorDao extends GenericDao<Author> {

    AuthorDao(){
        super(Author.class);
    }
}

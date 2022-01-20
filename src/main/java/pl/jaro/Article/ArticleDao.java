package pl.jaro.Article;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.jaro.common.GenericDao;

@Transactional
@Repository
public class ArticleDao extends GenericDao<Article> {

    ArticleDao(){
        super(Article.class);
    }
}

package pl.jaro.Article;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.jaro.common.GenericDao;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

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

    @Transactional(readOnly = true)
    public List<Article> getLastFive(){
        Query query = entityManager.createQuery("select a from articles a order by a.created desc");
        query.setMaxResults(5);
        return query.getResultList();
    }

    @Transactional(readOnly = true)
    public Optional<Article> findAllWithCategories (Long id){

        Query query = entityManager.createQuery("select a from articles a JOIN FETCH a.categories c where a.id= :id");
        query.setParameter("id",id);

        try {
            Article article =(Article) query.getSingleResult();
            return Optional.of(article);
        } catch (NoResultException ex){
            return Optional.empty();
        }

    }
}

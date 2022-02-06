package pl.jaro.Article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    @Query(value = "SELECT a FROM articles a JOIN FETCH a.categories c where a.id = :id")
    Optional<Article> findByIdWithCategories(@Param("id") Long id);
}

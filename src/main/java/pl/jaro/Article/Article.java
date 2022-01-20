package pl.jaro.Article;


import lombok.Data;
import lombok.NoArgsConstructor;
import pl.jaro.Author.Author;
import pl.jaro.Category;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200)
    private String title;

    @ManyToOne
    private Author author;

    @OneToMany
    private List<Category> categories = new ArrayList<>();

    private String content;


    private LocalDateTime created;
    @PrePersist
    public void prePersist(){
        created = LocalDateTime.now();
    }

    private LocalDateTime updated;
    @PreUpdate
    public void preUpdate(){
        updated = LocalDateTime.now();
    }


}
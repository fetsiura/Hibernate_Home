package pl.jaro.Article;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.jaro.Author.Author;
import pl.jaro.Category.Category;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "articles")
@Getter
@Setter
@NoArgsConstructor
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(max = 200)
//    @Column(length = 200)
    private String title;

    @ManyToOne
    private Author author;

    @Size(min = 1)
    @OneToMany
    private List<Category> categories = new ArrayList<>();

    @NotNull
    @Size(min = 5)
    private String content;

    private Boolean draft;

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

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}

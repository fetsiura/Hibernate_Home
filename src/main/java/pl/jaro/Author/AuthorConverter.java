package pl.jaro.Author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class AuthorConverter implements Converter<String,Author> {

    @Autowired
    private  AuthorRepository authorRepository;
    @Override
    public Author convert(String source){
        return authorRepository.findById(Long.parseLong(source)).orElseThrow();
    }

}

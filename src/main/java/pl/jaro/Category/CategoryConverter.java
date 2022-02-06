package pl.jaro.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class CategoryConverter implements Converter<String,Category> {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Category convert(String source){
        return categoryRepository.findById(Long.parseLong(source)).orElseThrow();
    }


}

package dz.mantouri.annonces.service;

import dz.mantouri.annonces.model.SubCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static dz.mantouri.annonces.model.SubCategory.values;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

@Service
public class CategoriesService {

    public List<ShownCategory> getCategories() {
        Map<String, List<SubCategory>> categories = Stream.of(values())
                .collect(groupingBy(SubCategory::getCategory));

        List<ShownCategory> collect = categories.entrySet().stream()
                .map(entry ->
                        new ShownCategory(entry.getKey(), entry.getValue().stream()
                                .map(sub -> new ShownSubCategory(sub.getLabel(), sub.name())).collect(toList())))
                .collect(toList());

        return collect;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ShownCategory {
        private String label;
        private List<ShownSubCategory> subCategories;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ShownSubCategory {
        private String label;
        private String name;
    }
}

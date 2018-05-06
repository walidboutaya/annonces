package dz.mantouri.annonces.repository;

import dz.mantouri.annonces.model.Annonce;
import dz.mantouri.annonces.model.SubCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import static java.util.Objects.nonNull;

@Repository
public class AnnounceSearchRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Annonce> findAll(String title, String wilaya, Double minPrice, Double maxPrice, SubCategory subCategory) {
        Query query = new Query();

        if(nonNull(title)) {
            query.addCriteria(Criteria.where("title").regex(title));
        }
        if(nonNull(wilaya)) {
            query.addCriteria(Criteria.where("address.wilaya").is(wilaya));
        }
        if(nonNull(minPrice)) {
            query.addCriteria(Criteria.where("price").gte(minPrice));
        }
        if(nonNull(maxPrice)) {
            query.addCriteria(Criteria.where("price").lte(minPrice));
        }
        if(nonNull(subCategory)) {
            query.addCriteria(Criteria.where("subCategory").is(subCategory));
        }
        return this.mongoTemplate.find(query, Annonce.class);
    }
}

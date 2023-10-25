package com.example.SpringJobListingBackMongo.repository;

import com.example.SpringJobListingBackMongo.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {

}

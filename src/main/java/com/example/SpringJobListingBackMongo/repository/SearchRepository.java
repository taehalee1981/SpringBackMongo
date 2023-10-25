package com.example.SpringJobListingBackMongo.repository;

import com.example.SpringJobListingBackMongo.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}

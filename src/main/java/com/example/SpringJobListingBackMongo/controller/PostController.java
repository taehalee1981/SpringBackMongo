package com.example.SpringJobListingBackMongo.controller;

import com.example.SpringJobListingBackMongo.repository.PostRepository;
import com.example.SpringJobListingBackMongo.model.Post;
import com.example.SpringJobListingBackMongo.repository.SearchRepository;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    PostRepository repo;
    SearchRepository srepo;

    public PostController(PostRepository repo, SearchRepository srepo) {
        this.repo = repo;
        this.srepo = srepo;
    }

    @RequestMapping({"/"})
    public String redirect() throws IOException {
        return "Working";

    }

    @GetMapping("/posts")
    public List<Post> getAllPosts() throws Exception {
        List<Post> resultado = null;
        try {
            resultado = repo.findAll();
        } catch (Exception e) {
            System.out.println("ERRO NO GETALLPOSTS");
        }

        return resultado;
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post) {
        Post resultado = null;
        try {
            resultado = repo.save(post);
        } catch (Exception e) {
            System.out.println("ERRO NO SAVE");
        }

        return resultado;
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text) throws Exception {
        List<Post> resultado = null;
        try {
            resultado = srepo.findByText(text);
        } catch (Exception e) {
            System.out.println("ERRO NO SEARCH");
        }

        return resultado;
    }
}
package com.example.demo.repository;


import com.example.demo.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Post;
import com.example.demo.model.User;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByCategories(Categorie categorie);
    List<Post> findByUser(User user);
}

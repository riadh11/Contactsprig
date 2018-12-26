package com.letstartcoding.springbootretstapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.letstartcoding.springbootretstapi.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
Post findById(Long id);
//List<Post> findByTagId(Long id);
}
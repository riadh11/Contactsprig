package com.letstartcoding.springbootretstapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.letstartcoding.springbootretstapi.model.Post;
import com.letstartcoding.springbootretstapi.repository.PostRepository;
import com.letstartcoding.springbootretstapi.repository.TagRepository;

@RestController
public class PostController {
	@Autowired
    private TagRepository tagRepository;

    @Autowired
    private PostRepository postRepository;
    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
    @GetMapping("/posts/{id}")
    public Post getPost(@PathVariable Long id) {
        return postRepository.findOne(id);
    }
    /*@GetMapping("/posts")
    public Page<Post> getAllPosts(Pageable pageable) {
        return postRepository.findAll(pageable);
    }*/

    @PostMapping("/posts")
    public Post createPost(@RequestBody Post post) {
        return postRepository.save(post);
    }

    @PutMapping("/posts/{postId}")
    public Post updatePost(@PathVariable Long postId, @RequestBody Post postRequest) {
        /*return postRepository.findOne(postId).map(post -> {
            post.setTitle(postRequest.getTitle());
            post.setDescription(postRequest.getDescription());
            post.setContent(postRequest.getContent());
            return postRepository.save(post);
        }).orElseThrow(() -> new ResourceNotFoundException("PostId " + postId + " not found"));*/
    	Post p=postRepository.findOne(postId);
    	p=postRequest;
    	return postRepository.save(p);
    	
    }


    @DeleteMapping("/posts/{postId}")
    public void deletePost(@PathVariable Long postId) {
        /*return postRepository.findById(postId).map(post -> {
            postRepository.delete(post);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("PostId " + postId + " not found"));*/
    	Post post  =postRepository.findById(postId);
         postRepository.delete(post);
    }

}
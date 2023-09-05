package by.ex.restfull_api_users_posts.controller;

import by.ex.restfull_api_users_posts.entity.PostEntity;
import by.ex.restfull_api_users_posts.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;
    @PostMapping("/addPost")
    public String addPost(@RequestBody PostEntity postEntity){
        postService.addPost(postEntity);
        return postEntity.toString();
    }
    @GetMapping
    public List<PostEntity> getAllPosts(){
        return postService.getAllPosts();
    }
    @GetMapping("/getPostsUser/{id}")
    public List<PostEntity> getPostsByUserId(@PathVariable Long id){
        return postService.getAllPosts().stream().filter(p -> p.getUserEntity().getId() == id).toList();
    }
}

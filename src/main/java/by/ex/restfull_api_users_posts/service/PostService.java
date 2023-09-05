package by.ex.restfull_api_users_posts.service;

import by.ex.restfull_api_users_posts.entity.PostEntity;
import by.ex.restfull_api_users_posts.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void addPost(PostEntity postEntity){
        postRepository.save(postEntity);
    }

    public List<PostEntity> getAllPosts(){
        return postRepository.findAll();
    }

    public Optional<PostEntity> getPostById(Long id){
        return postRepository.findById(id);
    }

    public void removePostById(Long id){
        postRepository.deleteById(id);
    }


}

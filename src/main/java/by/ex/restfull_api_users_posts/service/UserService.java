package by.ex.restfull_api_users_posts.service;

import by.ex.restfull_api_users_posts.entity.PostEntity;
import by.ex.restfull_api_users_posts.entity.UserEntity;
import by.ex.restfull_api_users_posts.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(UserEntity userEntity){
        userRepository.save(userEntity);
    }

    public Optional<UserEntity> getById(Long id){
        return userRepository.findById(id);
    }

    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }
}

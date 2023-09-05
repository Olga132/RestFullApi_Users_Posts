package by.ex.restfull_api_users_posts.repository;

import by.ex.restfull_api_users_posts.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {
}

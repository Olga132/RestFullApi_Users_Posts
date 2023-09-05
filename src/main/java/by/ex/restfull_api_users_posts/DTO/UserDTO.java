package by.ex.restfull_api_users_posts.DTO;

import java.util.List;

public record UserDTO (
        long id,
        String nickname,
        String email,
        List<PostDTO> postDTOList){

}

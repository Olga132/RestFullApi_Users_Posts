package by.ex.restfull_api_users_posts.mapper;

import by.ex.restfull_api_users_posts.DTO.UserDTO;
import by.ex.restfull_api_users_posts.entity.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class UserMapper implements mapperObject<UserDTO,UserEntity>{

    private final ModelMapper mapper;

    @Autowired
    public UserMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public UserDTO mapToDTO(UserEntity userEntity) {
        return Objects.isNull(userEntity) ? null : mapper.map(userEntity, UserDTO.class);
    }

    @Override
    public UserEntity mapToEntity(UserDTO userDTO) {
        return Objects.isNull(userDTO) ? null : mapper.map(userDTO, UserEntity.class);
    }
}

package by.ex.restfull_api_users_posts.mapper;

import by.ex.restfull_api_users_posts.DTO.PostDTO;
import by.ex.restfull_api_users_posts.entity.PostEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class PostMapper implements mapperObject<PostDTO, PostEntity> {

    private final ModelMapper mapper;

    @Autowired
    public PostMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public PostDTO mapToDTO(PostEntity entity) {
        return Objects.isNull(entity) ? null : mapper.map(entity, PostDTO.class);
    }

    @Override
    public PostEntity mapToEntity(PostDTO dto) {
        return Objects.isNull(dto) ? null : mapper.map(dto, PostEntity.class);
    }
}

package by.ex.restfull_api_users_posts.mapper;

public interface mapperObject<D,E> {

    D mapToDTO(E entity);

    E mapToEntity(D dto);
}

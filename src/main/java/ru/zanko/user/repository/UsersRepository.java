package ru.zanko.user.repository;

import ru.zanko.user.entity.User;

import java.util.List;

public interface UsersRepository {

    void save(User user);

    void updateUser(User user);

    void deleteById(Long userId);

    User findById(Long userId);

    List<User> findAll();

}

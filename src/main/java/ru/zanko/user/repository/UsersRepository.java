package ru.zanko.user.repository;

import ru.zanko.user.model.User;

import java.util.List;

public interface UsersRepository {

    void save(User user);

    void updateUser(User user);

    void deleteById(Long userId);

    List<User> findAll();

    User findById(Long userId);
}

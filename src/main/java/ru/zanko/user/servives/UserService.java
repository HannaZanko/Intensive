package ru.zanko.user.servives;

import ru.zanko.user.dto.UserForm;
import ru.zanko.user.entity.User;

import java.util.List;

public interface UserService {
    void createUser(UserForm form);

    void updateUser(User user);

    void deleteById(Long userId);

    Boolean isDeleteUser(Long userId);

    User findById(Long userId);

    List<User> getAll();
}

package pl.jedynak.Service;

import pl.jedynak.Domain.User;

public interface UserService {
    public User findUserByEmail(String email);

    public void saveUser(User user);
}
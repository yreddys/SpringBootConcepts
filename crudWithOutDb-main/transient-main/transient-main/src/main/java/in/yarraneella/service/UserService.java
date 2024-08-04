package in.yarraneella.service;

import in.yarraneella.entity.User;

public interface UserService {

	User getUser(Long id);

	User saveUser(User user);

}

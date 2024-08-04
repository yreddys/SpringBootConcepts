package in.yarraneella.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.yarraneella.entity.User;
import in.yarraneella.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User getUser(Long id) {

		return userRepository.findById(id);
	}

	@Override
	public User saveUser(User user) {

		return userRepository.save(user);
	}

}

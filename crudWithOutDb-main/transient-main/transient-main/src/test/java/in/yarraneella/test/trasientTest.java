package in.yarraneella.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import in.yarraneella.entity.User;
import in.yarraneella.repository.UserRepository;
import in.yarraneella.service.UserServiceImpl;

@ExtendWith(MockitoExtension.class)
public class trasientTest {
	@Mock
	private UserRepository repository;

	@InjectMocks
	private UserServiceImpl service;

	private User user;

	@BeforeEach
	void setUp() {
		user = new User();
		user.setId(1L);
		user.setAge(10);
		user.setUsername("Reddy");
		user.setPassword("123");
	}

	@Test
	void saveuser() {

		when(repository.save(user)).thenReturn(user);
		User saveduser = service.saveUser(user);
		assertEquals(user.getAge(), saveduser.getAge());
		verify(repository).save(user);
	}

	@Test
	void getuser() {

		when(repository.findById(1L)).thenReturn(user);
		User retrievedUser = service.getUser(1L);
		assertEquals(user, retrievedUser);
	}
}

package com.examserver;

import com.examserver.model.Role;
import com.examserver.model.User;
import com.examserver.model.UserRole;
import com.examserver.repository.UserRepository;
import com.examserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.print.attribute.HashAttributeSet;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamserverApplication {

	@Autowired
	private static  UserService userService;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ExamserverApplication.class, args);

		System.out.println("Starting Code...");

////		User user = new User();
////
////		user.setId(1L);
////		user.setFirstName("Sachin");
////		user.setLastName("Jadhav");
////		user.setUserName("sachin");
////		user.setPassword("sach");
////		user.setEmail("sach@gmail.com");
////		user.setProfile("default.png");
//
////		Role role = new Role();
////		role.setRoleId(44L);
////		role.setRoleName("ADMIN");
////
////		Set<UserRole> userRoleSet = new HashSet<>();
////
////		UserRole userRole = new UserRole();
////		userRole.setRole(role);
////		userRole.setUser(user);
////
////		userRoleSet.add(userRole);
//		System.out.println("User is:"+user);
//
//		userService.createUser(user);
//
//		System.out.println("User is:"+user);
//		System.out.println("Role si :"+userRoleSet);
	}

}

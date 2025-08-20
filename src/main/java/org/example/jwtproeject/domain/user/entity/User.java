package org.example.jwtproeject.domain.user.entity;

import org.example.jwtproeject.domain.user.enums.UserRole;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String email;

	private String password;

	@Enumerated
	private UserRole role;

	public User(String email, String password, UserRole role) {
		this.email = email;
		this.password = password;
		this.role = role;
	}
}

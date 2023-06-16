package com.example.imple.user.model;

import com.example.standard.model.Modelable;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@Builder
public class UserDTO implements Modelable<User>{

	@NotBlank
	String id;
	@NotBlank
	String password;
	String role;
	
	@Override
	public User getModel() {
		return User.builder()
				   .id(id.trim())
				   .password(password.trim())
				   .role(role.trim())
				   .build();
	}
	
	

	
}

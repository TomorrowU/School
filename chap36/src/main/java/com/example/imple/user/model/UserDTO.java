package com.example.imple.user.model;

import java.util.Objects;

import com.example.standard.model.Modelable;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@Builder
public class UserDTO implements Modelable<User> {
	 
	@NotNull
	 String id;
	@NotNull
	 String password;
	
	@Builder.Default
	 String role ="USER";
	 
	@Override
	
	public User getModel() {
		
		
		return User.builder()
				   .id(id.trim())
				   .password(password.trim())
				   .role(role.trim())
				   .build();
		
	}

	
}

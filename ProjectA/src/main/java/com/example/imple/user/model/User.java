package com.example.imple.user.model;

import com.example.standard.model.Modelable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@Builder
public class User {
	
	@NonNull String id;
	@NonNull String password;
			 String role;
	
	
}

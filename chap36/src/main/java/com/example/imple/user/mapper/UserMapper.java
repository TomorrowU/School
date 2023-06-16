package com.example.imple.user.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.imple.user.model.User;
import com.example.imple.user.model.UserDTO;

@Mapper
public interface UserMapper {
	
	
	
	@Select("""
			select * from users
			where id = #{id}
			""")
	UserDTO selectById(String id);
	
	
	@Insert("""
			insert into users
			values (
				#{u.id		,jdbcType=VARCHAR},
				#{u.password,jdbcType=VARCHAR},
				#{u.role	,jdbcType=VARCHAR}
			)
			""")
	int insertUser(@Param("u") User user);
		
	
	
	
	
}

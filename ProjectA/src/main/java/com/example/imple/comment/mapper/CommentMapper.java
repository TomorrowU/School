package com.example.imple.comment.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.imple.comment.model.Comment;

@Mapper
public interface CommentMapper {
	
	 @Select("""
	 		select count(*) from boardComment
	 		""")
	 public int commentCount() throws Exception;
	 
	 @Select("""
	 		SELECT * FROM boardComment
	 		""")
	 public List<Comment> commentList() throws Exception;
	 
	 // 댓글 작성
	 @Insert("""
	 		insert into boardComment values
	 		(#{c.cno},#{c.bno},#{c.content},#{c.writer},SYSDATE
	 		)
	 		""")
	 public int commentInsert(@Param("c") Comment comment) throws Exception;
	    
	 @Update("""
	 		  UPDATE boardCOMMENT
            SET
            CONTENT = #{content}
            WHERE CNO = #{cno}
	 		""")
	 public int commentUpdate(Comment comment) throws Exception;
	 
	 @Delete("""
	 		delete from comment where cno=${cno}
	 		""")
	 public int commentDelete(int cno) throws Exception;

}

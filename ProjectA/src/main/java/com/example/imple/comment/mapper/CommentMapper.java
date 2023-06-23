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
	 		where bno = #{bno}
	 		order by cno
	 		""")
	 public List<Comment> commentList(int bno);
	 
	 
	 
	 // 댓글 작성
	 @Insert("""
	 		insert into boardComment values
	 		(boardComment_seq.NEXTVAL,#{c.bno},#{c.content},#{c.writer},SYSDATE
	 		)
	 		""")
	 public int commentInsert(@Param("c") Comment comment) throws Exception;
	    
	 @Update("""
	 		  UPDATE boardCOMMENT
            SET
            CONTENT = #{content}
            WHERE CNO = #{cno}
	 		""")
	 public int commentUpdate(Comment comment)  ;
	 
	 @Delete("""
	 		delete from boardComment where cno=${cno}
	 		""")
	 public int commentDelete(int cno)  ;

}

package com.example.imple.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.imple.board.model.Board;
import com.example.imple.board.model.BoardDTO;

@Mapper
public interface BoardMapper {
	
	@Select("""
			select count(*) from board
			""")
	public int boardCount();
	
	@Select("""
			select * from board
			order by bno	
			""")
	List<Board> boardList();
	
	
	@Select("""
			select * from board
			where bno=#{bno}
			""")
    public Board boardDetail(int bno) throws Exception;
    
	
	@Insert("""
			 INSERT INTO
        BOARD (BNO, SUBJECT,CONTENT,WRITER,reg_date)
        VALUES(#{b.bno},#{b.subject},#{b.content},#{b.writer},SYSDATE)
			""")
    public void boardInsert(@Param("b") Board board) throws Exception;
    
    
	
    public void boardUpdate(Board board);
    
    @Delete("""
    		delete board where bno =#{bno}
    		""")
    public void boardDelete(int bno) throws Exception;
	
}

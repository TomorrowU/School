package com.example.imple.board.model;

import java.sql.Date;

import com.example.standard.model.Modelable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@Builder
public class BoardDTO implements Modelable<Board>{
	
	  private int bno;
	  private String subject;
	  private String content;
	  private String writer;
	  private Date regDate;
	@Override
	public Board getModel() {
		
		
		return Board.builder()
					.bno(bno)
					.subject(subject)
					.content(content)
					.writer(writer)
					.regDate(regDate)
					.build();
	}

	  
	  
}

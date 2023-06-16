package com.example.imple.board.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor(staticName = "of")
@Builder
public class Board {
	
	  private int bno;
	  private String subject;
	  private String content;
	  private String writer;
	  private Date regDate;

	  
	  
}

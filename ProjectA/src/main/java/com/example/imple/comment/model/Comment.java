package com.example.imple.comment.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@Builder
public class Comment {
	  
	  private int cno;
	  private int bno;
	  private String content;
	  private String writer;
	  private Date regDate;
	  
}

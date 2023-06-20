package com.example.imple.comment.model;

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
public class CommentDTO implements Modelable<Comment>{
	  
	  private int cno;
	  private int bno;
	  private String content;
	  private String writer;
	  private Date regDate;
	@Override
	public Comment getModel() {
		return Comment.builder()
				      .cno(cno)
				      .bno(bno)
				      .content(content.trim())
				      .writer(writer.trim())
				      .regDate(regDate)
					  .build();
	}

	  
	  
}

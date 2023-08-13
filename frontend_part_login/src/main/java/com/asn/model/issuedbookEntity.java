package com.asn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="issuedbooktable")
public class issuedbookEntity {
	@SequenceGenerator(name = "mySeqGenissue", sequenceName = "seqdigitissue", initialValue = 1000)
	 @Id
@GeneratedValue(generator = "mySeqGenissue")
	 private Integer user_id;
	private String email;
	private Integer book_id;
	private String bookname;
	private String bookauthor;
	private String bookcategory;
	private Integer bookcnt;
	private Integer bookedition;
	private byte[] bookimage;

}

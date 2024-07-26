package com.library.Entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
//import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "tbl_books",
uniqueConstraints = @UniqueConstraint(
		name="book_Name",
		columnNames = "book_Name"
		)
)

public class Books {
	@Id
	@SequenceGenerator(
			name="books_sequence",
			sequenceName="books_sequence",
			allocationSize=1
			)
	@GeneratedValue(
			strategy= GenerationType.SEQUENCE,
			generator="books_sequence"
			)
	
	private Long book_Id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="book_detail_id")
	private BookDetails bookDetails;
	
	//________________________________________
	private String book_Name;
	private Date created_Date=new Date();
	private String created_By;
	


	

	public Books(Long book_Id, BookDetails tbl_book_details, String book_Name, Date created_Date, String created_By) {
	super();
	this.book_Id = book_Id;
	this.bookDetails = tbl_book_details;
	this.book_Name = book_Name;
	this.created_Date = created_Date;
	this.created_By = created_By;
}
	public BookDetails getBookDetails() {
		return bookDetails;
	}
	public void setBookDetails(BookDetails bookDetails) {
		this.bookDetails = bookDetails;
	}
	public Long getBook_Id() {
		return book_Id;
	}

	public void setBook_Id(Long book_Id) {
		this.book_Id = book_Id;
	}

	public String getBook_Name() {
		return book_Name;
	}


	public void setBook_Name(String book_Name) {
		this.book_Name = book_Name;
	}

	public Date getCreated_Date() {
		return created_Date;
	}

	public void setCreated_Date(Date created_Date) {
		this.created_Date = created_Date;
	}

	public String getCreated_By() {
		return created_By;
	}

	public void setCreated_By(String created_By) {
		this.created_By = created_By;
	}
	@Override
	public String toString() {
		return "Books [book_Id=" + book_Id + ", bookDetails=" + bookDetails + ", book_Name=" + book_Name
				+ ", created_Date=" + created_Date + ", created_By=" + created_By + "]";
	}
	
//
//	public BookDetails getBook_details() {
//		return book_details;
//	}
//
//	public void setBook_details(BookDetails book_details) {
//		this.book_details = book_details;
//	}
//	
	
}

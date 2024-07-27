package com.library.Entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_book_details")
public class BookDetails {
	@Id
	@SequenceGenerator(
			name="b_details_sequence",
			sequenceName="b_details_sequence",
			allocationSize=1
			)
	@GeneratedValue(
			strategy= GenerationType.SEQUENCE,
			generator="b_details_sequence"
			)
	@Column(name = "bookDetails_id")
	private Long bookDetails_id;		//Primary key

	//@ColumnDefault(value="available")//available or unavailable
	@Column(name = "book_Status")
	private String book_Status; 
	
	@Column(name = "Issued_by")
	private String Issued_by; //Book issued by name
	
	@Column(name = "Issue_date")
	private Date Issue_date;	//book issued date

	
	public Long getBookDetails_id() {
		return bookDetails_id;
	}
	public void setBookDetails_id(Long bookDetails_id) {
		this.bookDetails_id = bookDetails_id;
	}
	
//	public Books getBook_Id() {
//		return book_Id;
//	}
//	public void setBook_Id(Books book_Id) {
//		this.book_Id = book_Id;
//	}

	private Date Release_date;   //when will book be released
	
	public BookDetails() {}
	
	public BookDetails(Long bookDetails_id, String book_Status, String issued_by, Date issue_date, Date release_date) {
	//super();
	this.bookDetails_id = bookDetails_id;
	this.book_Status = book_Status;
	Issued_by = issued_by;
	Issue_date = issue_date;
	Release_date = release_date;
}
	public String getBook_Status() {
		return book_Status;
	}
	public void setBook_Status(String book_Status) {
		this.book_Status = book_Status;
	}
	public String getIssued_by() {
		return Issued_by;
	}
	public void setIssued_by(String issued_by) {
		Issued_by = issued_by;
	}
	public Date getIssue_date() {
		return Issue_date;
	}
	public void setIssue_date(Date issue_date) {
		Issue_date = issue_date;
	}
	public Date getRelease_date() {
		return Release_date;
	}
	public void setRelease_date(Date release_date) {
		Release_date = release_date;
	}
	
}

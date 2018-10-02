package com.fsd.model;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "book")
public class Book implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3023485266952687333L;
	@Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;	
	
	@Column(name = "book_title")
    private String title;	
	
	@Column(name = "book_price")
    private float price;	
	
	@Column(name = "volume")
    private long volume;	
	    
    @Column(name = "publish_date")
	private Date publishDate;	
    
    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="subject_id", nullable=true)
	private Subject subject; 
    
    @Transient
    private String publishDateStr;
    @Transient
    private String subjectId;
    
	public Book() {
		super();
    }
 
    
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
  
    public float getPrice() {
        return price;
    }
 
    public void setPrice(float price) {
        this.price = price;
    }

	public long getVolume() {
		return volume;
	}

	public void setVolume(long volume) {
		this.volume = volume;
	}
	
	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String toString(){
		return "Book Title:".concat(title);
	}


	public String getPublishDateStr() {
		return publishDateStr;
	}


	public void setPublishDateStr(String publishDateStr) {
		this.publishDateStr = publishDateStr;
	}


	public String getSubjectId() {
		return subjectId;
	}


	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

}

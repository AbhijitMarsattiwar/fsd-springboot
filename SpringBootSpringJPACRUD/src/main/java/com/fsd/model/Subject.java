package com.fsd.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8526005194293099566L;
	
	@Column(name = "subject_title")
	private String subtitle;	
	
	@Id
    @Column(name = "subject_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long subjectId;	
	
	@Column(name = "duration_in_hrs")
    private int durationInHours;
	
	@OneToMany(mappedBy="subject", cascade = CascadeType.ALL)
    private Set<Book> references;    
    
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}
	public int getDurationInHours() {
		return durationInHours;
	}
	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}
	public Set<Book> getReferences() {
		return references;
	}
	public void setReferences(Set<Book> references) {
		this.references = references;
	}    
	
	public String toString(){
		return "Subject Title:".concat(subtitle);
	}
}

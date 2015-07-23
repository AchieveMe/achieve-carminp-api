package it.achiev.carminp.core.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Alberto Cerqueira
 * @since 0.1
 */
@Entity
@Table(name = "TBL_PHRASE")
public class Phrase implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "author_id", nullable = false, unique = true, length = 60)
	private Author author;
	
	@Column(name = "text", nullable = false, unique = true, length = 60)
	private String text;
	
	protected Phrase() {}

	public Phrase(Author author, String text) {
		super();
		this.author = author;
		this.text = text;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phrase other = (Phrase) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Phrase [author=" + author + ", text=" + text + "]";
	}
}
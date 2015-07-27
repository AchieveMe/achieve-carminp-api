package it.achiev.carminp.core.domain.entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Valid;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Alberto Cerqueira
 * @since 1.0-alpha
 */
@Entity
@Table(name = "TBL_PHRASE", schema = "carminp")
public class Phrase implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "phrase_id", columnDefinition = "UUID", insertable = false, updatable = false)
	private UUID idPhrase;
	
	@Valid
	@ManyToOne(optional = false)
	@JoinColumn(name = "author_name", nullable = false)
	private Author author;
	
	@Column(name = "phrase_phrase", nullable = false, unique = true, length = 244)
	private String phrase;
	
	protected Phrase() {}

	public Phrase(Author author, String phrase) {
		super();
		this.author = author;
		this.phrase = phrase;
	}

	public UUID getIdPhrase() {
		return idPhrase;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getPhrase() {
		return phrase;
	}

	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPhrase == null) ? 0 : idPhrase.hashCode());
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
		if (idPhrase == null) {
			if (other.idPhrase != null)
				return false;
		} else if (!idPhrase.equals(other.idPhrase))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Phrase [idPhrase=" + idPhrase + ", author=" + author + ", phrase=" + phrase + "]";
	}
}
package it.achiev.carminp.core.domain.entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author GAN
 * @since 0.1
 */
@Entity
@Table(name = "TBL_AUTHOR")
public class Author implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "author_id", columnDefinition = "UUID", insertable = false, updatable = false)
	private UUID idAuthor;
	
	@Column(name = "author_name", nullable = false, unique = true, length = 60)
	private String nameAuthor;

	protected Author() {}

	public Author(String nameAuthor) {
		super();
		this.nameAuthor = nameAuthor;
	}

	public UUID getIdAuthor() {
		return idAuthor;
	}

	public String getNameAuthor() {
		return nameAuthor;
	}

	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAuthor == null) ? 0 : idAuthor.hashCode());
		result = prime * result + ((nameAuthor == null) ? 0 : nameAuthor.hashCode());
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
		Author other = (Author) obj;
		if (idAuthor == null) {
			if (other.idAuthor != null)
				return false;
		} else if (!idAuthor.equals(other.idAuthor))
			return false;
		if (nameAuthor == null) {
			if (other.nameAuthor != null)
				return false;
		} else if (!nameAuthor.equals(other.nameAuthor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Author [idAuthor=" + idAuthor + ", nameAuthor=" + nameAuthor + "]";
	}
	
}
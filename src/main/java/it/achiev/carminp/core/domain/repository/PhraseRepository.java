package it.achiev.carminp.core.domain.repository;

import it.achiev.carminp.core.domain.entity.Author;
import it.achiev.carminp.core.domain.entity.Phrase;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Alberto Cerqueira
 * @since 1.0-alpha
 */
@RepositoryRestResource(path = "phrase")
public interface PhraseRepository extends PagingAndSortingRepository<Phrase, UUID> {
	
	List<Phrase> findByAuthor(@Param("author_name") Author authorName);

}
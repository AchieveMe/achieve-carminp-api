package it.achiev.carminp.core.domain.repository;

import it.achiev.carminp.core.domain.entity.Author;
import it.achiev.carminp.core.domain.entity.Phrase;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Alberto Cerqueira
 * @since 0.1
 */
@RepositoryRestResource(path = "phrase")
public interface PhraseRepository extends PagingAndSortingRepository<Phrase, UUID> {
	
	Phrase findByAuthor(@Param("authorId") Author idAuthor);

}
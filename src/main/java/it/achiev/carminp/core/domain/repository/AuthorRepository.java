package it.achiev.carminp.core.domain.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import it.achiev.carminp.core.domain.entity.Author;

/**
 * @author GAN
 * @since 0.1
 */
@RepositoryRestResource(path = "author")
public interface AuthorRepository extends PagingAndSortingRepository<Author, UUID> {
	
	Optional<Author> findByNameAuthor(@Param("nameAuthor") String nameAuthor);
	
	List<Author> findByPhrases(@SuppressWarnings("rawtypes") @Param("phrases")List phrases);

}
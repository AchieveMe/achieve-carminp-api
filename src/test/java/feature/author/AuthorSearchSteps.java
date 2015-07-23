package feature.author;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import java.util.LinkedList;
import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import it.achiev.carminp.core.domain.entity.Author;

/**
 * @author GAN
 * @since 1.0-alpha
 */
public class AuthorSearchSteps {
	
	private List<Author> authors = new LinkedList<>();
	
	private Author author;
	private Author authorAssertion;
	
	@Given("^an author with the name \"(.*?)\"$")
	public void an_author_with_the_name(String authorName) {
		author = new Author(authorName);
		
		authors.add(author);
	}

	@When("^user search for the author with the name \"(.*?)\"$")
	public void user_search_for_the_author_with_the_name(String authorName) {
		//FIXME Use Stream API to do it
		
		for (Author authorFromList : authors) {
			if(authorFromList.getNameAuthor().contains(authorName)) {
				authorAssertion = new Author(authorFromList.getNameAuthor());
			}
		}
	}

	@Then("^user get the author name$")
	public void user_get_the_author_name() {
		assertThat(authorAssertion.getNameAuthor(), is(equalTo(author.getNameAuthor())));
	}

	@Then("^only one author$")
	public void only_one_author() {
		assertThat(authors.size(), is(equalTo(1)));
	}
}
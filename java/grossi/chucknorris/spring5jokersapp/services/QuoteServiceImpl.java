package grossi.chucknorris.spring5jokersapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class QuoteServiceImpl implements QuoteService {
	
	private final ChuckNorrisQuotes chuckNorrisQuote;

	public QuoteServiceImpl() {
		
		this.chuckNorrisQuote = new ChuckNorrisQuotes(); 
	}
	
	public String getQuote() {
		return chuckNorrisQuote.getRandomQuote();
	}
	
	

}

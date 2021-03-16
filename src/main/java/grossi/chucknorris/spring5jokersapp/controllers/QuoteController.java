package grossi.chucknorris.spring5jokersapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import grossi.chucknorris.spring5jokersapp.services.QuoteService;

@Controller
public class QuoteController {
	
	private final QuoteService quoteService;

	public QuoteController(QuoteService quoteService) {

		this.quoteService = quoteService;
	}
	
	@GetMapping("/")
	public String getChuckNorrisQuote(Model model) {
		String quote = quoteService.getQuote();
		model.addAttribute("quote", quote);
		return "index";
	}
	
	

}

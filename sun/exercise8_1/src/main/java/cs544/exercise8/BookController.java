package cs544.exercise8;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {

	@Autowired
	private IBookDao bookDao;

	@RequestMapping("/")
	public String redirectRoot() {
		return "redirect:/books";

	}

	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public String getBooks(Model model) {
		List<Book> books = bookDao.getAll();
		model.addAttribute("books", books);
		return "bookList";

	}

	@RequestMapping(value = "/addBook", method = RequestMethod.POST)
	public String addBook(Model model, @Valid Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "addBook";
		}
		bookDao.add(book);
		return "redirect:/bookList";
	}

	@GetMapping(value = "/addBook")
	public String addBook(Book book) {
		return "addBook";
	}

	@RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
	public String getBook(Model model, @PathVariable int id) {
		model.addAttribute("book", bookDao.get(id));
		return "bookDetail";
	}

	@RequestMapping(value = "/books/{id}", method = RequestMethod.POST)
	public String update(Book book, @PathVariable int id) {
		bookDao.update(id, book);
		return "redirect:/books";
	}

	@RequestMapping(value = "books/delete", method = RequestMethod.POST)
	public String delete(int bookId) {
		bookDao.delete(bookId);
		return "redirect:/books";
	}
}

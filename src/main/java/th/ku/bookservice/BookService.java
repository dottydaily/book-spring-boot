package th.ku.bookservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/book"})
public class BookService {

    @Autowired
    private BookDaoImp repository;

    @GetMapping
    public List<Book> findAll() {
        return repository.findAll();
    }
}

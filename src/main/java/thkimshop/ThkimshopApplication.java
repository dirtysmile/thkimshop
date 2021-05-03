package thkimshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import thkimshop.domain.item.Book;
import thkimshop.domain.item.Item;

@SpringBootApplication
public class ThkimshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThkimshopApplication.class, args);

		Hello d = new Hello();
		d.setData("aaa");

		Book book = new Book();

		System.out.println(d.getData());

		System.out.println("test");
	}

}

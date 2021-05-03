package thkimshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThkimshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThkimshopApplication.class, args);

		Hello d = new Hello();
		d.setData("aaa");

		System.out.println(d.getData());

		System.out.println("test");
	}

}

package thkimshop.domain;

import lombok.Getter;
import lombok.Setter;
import thkimshop.domain.item.Item;

import javax.persistence.*;

@Entity
@Getter @Setter
public class OrderItem {
    @Id @GeneratedValue
    private Long orderItemId;
    private int price;
    private int count;

    @ManyToOne
    @JoinColumn(name="orderId")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "itemId")
    private Item item;
}

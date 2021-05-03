package thkimshop.domain;

import lombok.Getter;
import lombok.Setter;
import thkimshop.domain.item.Item;

import javax.persistence.*;

@Entity
@Getter @Setter
public class OrderItem {
    @Id @GeneratedValue

    @Column(name="order_item_id")
    private Long id;
    private int price;
    private int count;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="orderId")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "itemId")
    private Item item;


    protected OrderItem() {

    }

    // 생성 메서드
    public static OrderItem createOrderItem(Item item, int price, int count){
        OrderItem orderItem = new OrderItem();
        orderItem.setItem(item);
        orderItem.setPrice(price);
        orderItem.setCount(count);

        item.removeStock(count);
        return orderItem;
    }

    //비지니스 로직
    public void cancel() {
        getItem().addStock(count);
    }

    public int getTotalPrice() {
        return getPrice() * getCount();
    }
}

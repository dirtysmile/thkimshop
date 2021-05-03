package thkimshop.domain.item;

import lombok.Getter;
import lombok.Setter;
import thkimshop.exception.NotEnoughStockException;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "dtype")
@Getter @Setter
public abstract  class Item {
    @Id @GeneratedValue
    @Column(name ="item_id")
    private Long id;
    private String name;
    private int price;
    private int stockQuantity;

    public void addStock(int quantity){
        this.stockQuantity += quantity;
    }

    public void removeStock(int quantity){
            int restStock = this.stockQuantity - quantity;
            if(restStock<0){
                throw new NotEnoughStockException("need more stock");
            }
            this.stockQuantity = restStock;
    }
}

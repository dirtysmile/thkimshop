package thkimshop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "dtype")
@Getter @Setter
public abstract  class Item {
    @Id @GeneratedValue
    private Long itemId;
    private String name;
    private int price;
    private int stockQuantity;
}

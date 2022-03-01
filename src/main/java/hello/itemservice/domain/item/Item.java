package hello.itemservice.domain.item;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class Item {

    //    @NotNull(groups = UpdateCheck.class) //수정 요구사항 추가
    @NotNull
    private Long id;

    //    @NotBlank(groups = {SaveCheck.class, UpdateCheck.class})
    @NotBlank
    private String itemName;

    @NotNull
    private Integer price;

    @Max(value = 9999)
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}

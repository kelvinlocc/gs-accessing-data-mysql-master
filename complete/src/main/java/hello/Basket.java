package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Basket {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String basketItem;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBasketItem() {
        return basketItem;
    }

    public void setBasketItem(String basketItem) {
        this.basketItem = basketItem;
    }


}

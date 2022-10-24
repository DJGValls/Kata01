package Kata01.Model;

import Kata01.Utils.Money;
import com.sun.istack.NotNull;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@MappedSuperclass
public class AbstractProduct {

    @NotNull
    private String prodcutName;

    @Embedded
    @Nullable
    @AttributeOverrides({
            @AttributeOverride( name = "currency", column = @Column(name = "productPrice_code")),
            @AttributeOverride( name = "amount", column = @Column(name = "productPrice"))})
    private Money productPrice;

    public AbstractProduct() {
    }

    public String getProdcutName() {
        return prodcutName;
    }

    public void setProdcutName(String prodcutName) {
        this.prodcutName = prodcutName;
    }

    @Nullable
    public Money getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(@Nullable Money productPrice) {
        this.productPrice = productPrice;
    }
}

package Kata01.Model;

import Kata01.Utils.Money;
import com.sun.istack.NotNull;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
public class AbstractProduct {

    @NotNull
    private String prodcutName;

    @NotNull
    private String productBrand;

    @NotNull
    private LocalDate dateOfArrive;

    @NotNull
    private Integer stock;

    @NotNull
    private Integer minStock;

    @NotNull
    private Integer maxStock;

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

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public LocalDate getDateOfArrive() {
        return dateOfArrive;
    }

    public void setDateOfArrive(LocalDate dateOfArrive) {
        this.dateOfArrive = dateOfArrive;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getMinStock() {
        return minStock;
    }

    public void setMinStock(Integer minStock) {
        this.minStock = minStock;
    }

    public Integer getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(Integer maxStock) {
        this.maxStock = maxStock;
    }

    @Nullable
    public Money getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(@Nullable Money productPrice) {
        this.productPrice = productPrice;
    }
}

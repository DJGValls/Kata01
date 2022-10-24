package Kata01.Model;

import Kata01.Model.AbstractProduct;
import com.sun.istack.NotNull;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "checking")
@EntityListeners(AuditingEntityListener.class)
public class ConserveProduct extends AbstractProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer conserveId;

   @NotNull
   private String productBrand;

   @NotNull
   private LocalDate dateOfArrive;

   @NotNull
   private LocalDate dateOfCaducity;

   @NotNull
   private Integer stock;

   @NotNull
   private Integer minStock;

   @NotNull
   private Integer maxStock;

    public ConserveProduct() {
    }

    public Integer getConserveId() {
        return conserveId;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public LocalDate getDateOfArrive() {
        return dateOfArrive;
    }

    public LocalDate getDateOfCaducity() {
        return dateOfCaducity;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer getMinStock() {
        return minStock;
    }

    public Integer getMaxStock() {
        return maxStock;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public void setDateOfArrive(LocalDate dateOfArrive) {
        this.dateOfArrive = dateOfArrive;
    }

    public void setDateOfCaducity(LocalDate dateOfCaducity) {
        this.dateOfCaducity = dateOfCaducity;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setMinStock(Integer minStock) {
        this.minStock = minStock;
    }

    public void setMaxStock(Integer maxStock) {
        this.maxStock = maxStock;
    }
}

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
   private LocalDate dateOfCaducity;


    public ConserveProduct() {
    }

    public Integer getConserveId() {
        return conserveId;
    }

    public LocalDate getDateOfCaducity() {
        return dateOfCaducity;
    }

    public void setDateOfCaducity(LocalDate dateOfCaducity) {
        this.dateOfCaducity = dateOfCaducity;
    }

}

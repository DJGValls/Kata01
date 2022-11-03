package Kata01.Model;

import Kata01.Model.Enum.CleaningType;
import com.sun.istack.NotNull;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

public class CleaningProduct extends AbstractProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer CleaningId;

    @NotNull
    private CleaningType cleaningType;

    public Integer getCleaningId() {
        return CleaningId;
    }

    public CleaningType getCleaningType() {
        return cleaningType;
    }

    public void setCleaningType(CleaningType cleaningType) {
        this.cleaningType = cleaningType;
    }
}

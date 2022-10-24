package Kata01;

import com.sun.istack.NotNull;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractProduct {

    @NotNull
    private String prodcutName;



}

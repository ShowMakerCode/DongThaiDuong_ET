package com.smk.problem02.entity;

import com.smk.problem02.abtracts.Thing;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookOnTape extends Thing {
    private Integer id;
    private String name;
    private Float price;
    private Integer amount;
    private Long seri;

    @Override
    public String getDescription() {
        return "Product Information"+"\n"+"Id: " + this.id + "\n" + "Name: " + this.name + "\n" + "Price: " + this.price + "\n" + "Amount: " + this.amount + "\n" + "Seri: " + this.seri;
    }
}
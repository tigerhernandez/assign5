/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author c0621483
 */
@Entity
public class productCode {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String productCode;
    private String description;

    protected productCode() {}

    public productCode(String productCode, String description) {
        this.productCode = productCode;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Product_code[id=%d, product_id='%s', description='%s']",
                id, productCode, description);
    }
}

// Not going to lie, I played with this for a few hours and i cant seem to figure 
// this out. sorry
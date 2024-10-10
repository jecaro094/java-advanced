package com.pluralsight.advancedjava.examples.example09;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record Purchase(long productId, int quantity, BigDecimal price, LocalDateTime dateTime) {

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {

        private long productId;
        private int quantity;
        private BigDecimal price;
        private LocalDateTime dateTime;

        public Builder ofProduct(long productId){
            this.productId = productId;
            return this;
        }

        public Builder withQuantity(int quantity){
            this.quantity = quantity;
            return this;
        }
        public Builder forPrice(BigDecimal price){
            this.price = price;
            return this;
        }
        public Builder atDatetime(LocalDateTime dateTime){
            this.dateTime = dateTime;
            return this;
        }

        public Purchase build(){
            return new Purchase(productId, quantity, price, dateTime);
        }
    }
}

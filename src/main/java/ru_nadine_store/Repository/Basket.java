package ru_nadine_store.Repository;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import ru_nadine_store.model.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
@SessionScope
public class Basket {
    private final List<Item> basket;

    public Basket() {
        this.basket = new ArrayList<>();
    }
    public void addAll (List<Item> itemIds){
        basket.addAll(itemIds);
    }
    public List<Item> getAll (){
        return Collections.unmodifiableList(basket);
    }
}

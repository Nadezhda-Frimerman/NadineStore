package ru_nadine_store.Service;

import org.springframework.stereotype.Service;
import ru_nadine_store.Repository.Basket;
import ru_nadine_store.model.Item;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
private final Basket basket;

    public StoreServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void addAll(List<Long> itemIds){
     basket.addAll(itemIds.stream().map(l->new Item(l)).toList());
    }

    @Override
    public List<Item> getAll(){
        return basket.getAll();
    }
}

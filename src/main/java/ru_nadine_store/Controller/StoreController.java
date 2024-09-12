package ru_nadine_store.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru_nadine_store.Service.StoreService;
import ru_nadine_store.model.Item;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {
    private StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }
@GetMapping("/add")
    public void addAll (@RequestParam("Ids") List<Long> itemIds){
        storeService.addAll(itemIds);
    }
    @GetMapping("/get")
    public List<Item> getAll(){
        return storeService.getAll();
    }

}

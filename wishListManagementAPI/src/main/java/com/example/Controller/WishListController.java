package com.example.Controller;

import com.example.Model.WishListItem;
import com.example.Service.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class WishListController {

    @Autowired
    private WishListService wishListService;



    @PostMapping("/wishlist/item")
    public WishListItem addWishListItem(@RequestBody WishListItem wishListItem){
        return wishListService.addWishListItem(wishListItem);
    }


    @DeleteMapping("/wishlist/item")
    public String deleteWishlistItem(@RequestParam Integer id){
        return wishListService.deleteWishlistItem(id);
    }

    @GetMapping("/wishlist/user")
    public List<WishListItem> getWishListOfUser(@RequestParam Integer userId){
        return wishListService.getWishListOfUser(userId);
    }
}

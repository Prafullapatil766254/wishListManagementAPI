package com.example.WishListService;

import com.example.Model.User;
import com.example.Model.WishListItem;
import com.example.Repository.UserRepository;
import com.example.Repository.WishListRepository;
import com.example.Service.WishListService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WishListServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private WishListService wishListService;

    @Autowired
    protected WishListRepository wishListRepository;

    @Test
    void addWishListItem() {
        User user = userRepository.findById(1).orElse(null);
        WishListItem wishListItem = wishListService.addWishListItem(new WishListItem(11 , "SmartPhone" , "An one plus smart phone with great camera quality" , user , LocalDateTime.now()));
        System.out.println(wishListItem);
        assertNotNull(wishListItem , "Test case add wish list item is failed..");

    }


    @Test
    void getWishListOfUser(){
        List<WishListItem> wishListItemList = wishListService.getWishListOfUser(1);
        System.out.println(wishListItemList);
        assertNotNull(wishListItemList , "Test case get wish list of user is failed..");
    }


    @Test
    void deleteWishlistItem(){
        wishListService.deleteWishlistItem(11);
        WishListItem wishListItem = wishListRepository.findById(11).orElse(null);
        System.out.println(wishListItem);
        assertEquals(null , wishListItem , "Test case delete item is failed..");
    }


}
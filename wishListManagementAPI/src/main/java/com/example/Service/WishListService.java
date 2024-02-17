package com.example.Service;

import com.example.CustomeExceptions.UserNotFoundException;
import com.example.Model.User;
import com.example.Model.WishListItem;
import com.example.Repository.UserRepository;
import com.example.Repository.WishListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishListService {

    @Autowired
    private WishListRepository wishListRepository;


    @Autowired
    private UserRepository userRepository;



    public WishListItem addWishListItem(WishListItem wishListItem){
        return wishListRepository.save(wishListItem);
    }

    public String deleteWishlistItem(Integer id){
        WishListItem wishListItem = wishListRepository.findById(id).orElse(null);


        if(wishListItem == null){
            return "Invalid item id..please provide valid item id..";
        }

        wishListRepository.delete(wishListItem);
        return "Item deleted successfully..";
    }

    public List<WishListItem> getWishListOfUser(Integer userId) {
        User user = userRepository.findById(userId).orElseThrow( () -> new UserNotFoundException("User with id "+userId+" is not exists.."));
        List<WishListItem>  itemsOfUser = wishListRepository.findByUser(user);
        return itemsOfUser;
    }
}

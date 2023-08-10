package com.example.plantnest.service;

import com.example.plantnest.entity.WishList;
import com.example.plantnest.repository.WishListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishlistService {

    @Autowired
    private WishListRepository wishlistRepository;

    public List<WishList> getAllWishlists() {
        return wishlistRepository.findAll();
    }

    public WishList createWishlist(WishList wishlist) {
        return wishlistRepository.save(wishlist);
    }
}

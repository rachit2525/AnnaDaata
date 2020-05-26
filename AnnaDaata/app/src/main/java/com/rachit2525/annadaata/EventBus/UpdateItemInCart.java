package com.rachit2525.annadaata.EventBus;

import com.rachit2525.annadaata.Database.CartItem;

public class UpdateItemInCart {

    private CartItem cartItem;

    public CartItem getCartItem() {
        return cartItem;
    }

    public void setCartItem(CartItem cartItem) {
        this.cartItem = cartItem;
    }

    public UpdateItemInCart(CartItem cartItem) {
        this.cartItem = cartItem;
    }
}

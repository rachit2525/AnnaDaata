package com.rachit2525.annadaata.EventBus;

import com.rachit2525.annadaata.Model.FoodModel;

public class FoodItemClick {
    private boolean success;
    private FoodModel foodModel;

    public FoodItemClick(boolean success, FoodModel foodModel) {
        this.success = success;
        this.foodModel = foodModel;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public FoodModel getFoodModel() {
        return foodModel;
    }

    public void setFoodModel(FoodModel foodModel) {
        this.foodModel = foodModel;
    }
}

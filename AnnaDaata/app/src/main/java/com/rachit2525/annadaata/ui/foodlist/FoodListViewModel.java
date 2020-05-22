package com.rachit2525.annadaata.ui.foodlist;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.rachit2525.annadaata.Common.Common;
import com.rachit2525.annadaata.Model.FoodModel;

public class FoodListViewModel extends ViewModel {
    private MutableLiveData<FoodModel> mutableLiveDataFoodList;
    public FoodListViewModel()
    {

    }

    public MutableLiveData<FoodModel> getMutableLiveDataFoodList() {
        if(mutableLiveDataFoodList==null)
            mutableLiveDataFoodList=new MutableLiveData<>();
        mutableLiveDataFoodList.setValue(Common.categorySelected.getFoods());
        return mutableLiveDataFoodList;
    }
}

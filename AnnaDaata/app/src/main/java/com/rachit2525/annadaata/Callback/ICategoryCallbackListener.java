package com.rachit2525.annadaata.Callback;

import com.rachit2525.annadaata.Model.BestDealModel;
import com.rachit2525.annadaata.Model.CategoryModel;

import java.util.List;

public interface ICategoryCallbackListener {

    void onCategoryLoadSuccess(List<CategoryModel> categoryModels);

    void onCategoryLoadFailed(String message);

}

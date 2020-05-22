package com.rachit2525.annadaata.Callback;

import com.rachit2525.annadaata.Model.PopularCategoryModel;

import java.util.List;

public interface IPopularCallbackListener {
    void onPopularLoadSuccess(List<PopularCategoryModel> popularCategoryModels);

    void onPopularLoadFailed(String message);

}

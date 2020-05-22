package com.rachit2525.annadaata.Callback;

import com.rachit2525.annadaata.Model.BestDealModel;
import com.rachit2525.annadaata.Model.PopularCategoryModel;

import java.util.List;

public interface IBestDealCallbackListener {
    void onBestDealLoadSuccess(List<BestDealModel> bestDealModels);

    void onBestDealLoadFailed(String message);

}

package com.rachit2525.annadaata.ui.foodlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rachit2525.annadaata.Adapter.MyFoodListAdapter;
import com.rachit2525.annadaata.Model.FoodModel;
import com.rachit2525.annadaata.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class FoodListFragment extends Fragment {
    private FoodListViewModel sendViewModel;
    Unbinder unbinder;
    @BindView(R.id.recycler_food_list)
    RecyclerView recycler_food_list;
    LayoutAnimationController layoutAnimationController;
    MyFoodListAdapter adapter;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        sendViewModel= new ViewModelProvider(this).get(FoodListViewModel.class);
       // sendViewModel = new ViewModelProvider(this, viewModelFactory).get(YouViewModel.class);
        View root=inflater.inflate(R.layout.fragment_food_list,container,false);
         unbinder= ButterKnife.bind(this,root);
         sendViewModel.getMutableLiveDataFoodList().observe(this,Observer<List<FoodModel>>()
    {

        public void onChanges(List<FoodModel> foodModels)
        {
            adapter=new MyFoodListAdapter(getContext(),foodModels);
            recycler_food_list.setAdapter(adapter);
            recycler_food_list.setLayoutAnimation(layoutAnimationController);
        }


         });

        return root;
    }

    private void initView()
    {
        recycler_food_list.setHasFixedSize(true);
        recycler_food_list.setLayoutManager(new LinearLayoutManager(getContext()));
        layoutAnimationController= AnimationUtils.loadLayoutAnimation(getContext(),R.anim.layout_item_from_left);
    }

}

package com.khuongviettai.fashion.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.khuongviettai.fashion.fragment.AccountFragment;
import com.khuongviettai.fashion.fragment.CartFragment;
import com.khuongviettai.fashion.fragment.HistoryFragment;
import com.khuongviettai.fashion.fragment.HomeFragment;
import com.khuongviettai.fashion.fragment.ShopFragment;

public class MainAdapter extends FragmentStateAdapter {
    private static final int NUM_PAGES = 5;

    public MainAdapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new ShopFragment();
            case 2:
                return new CartFragment();
            case 3:
                return new HistoryFragment();
            case 4:
                return new AccountFragment();
            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return NUM_PAGES;
    }
}

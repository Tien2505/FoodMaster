package com.example.foodstore.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.foodstore.R;
import com.example.foodstore.adapter.Tabadapter;
import com.google.android.material.tabs.TabLayout;

import static com.example.foodstore.MainActivity.toolbar;


public class FragmentStatistical extends Fragment {
    private Tabadapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentstatistical,container,false);
        toolbar.setVisibility(View.VISIBLE);
        tabLayout = view.findViewById(R.id.tabLayout);
        viewPager =view.findViewById(R.id.viewPager);
        adapter = new Tabadapter(getActivity().getSupportFragmentManager());
        adapter.addFragment(new FragmentThongKe_Ngay(), "Ngày");
        adapter.addFragment(new FragmentThongKe_Thang(), "Tháng");
        adapter.addFragment(new FragmentThongKe_Nam(), "Năm");
//        adapter.addFragment(new FragmentThongKe_TopSanPham(), "Top Sản Phẩm");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }
}

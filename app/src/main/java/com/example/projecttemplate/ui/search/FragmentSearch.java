package com.example.projecttemplate.ui.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

//import com.example.projecttemplate.databinding.FragmentDashboardBinding;
import com.example.projecttemplate.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FragmentSearch extends Fragment {

    //private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /*DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDashboard;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;*/
        // inflate는 xml에 표기된 레이아웃들을 메모리에 로딩된 후 객체화 시키는 과정
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    /*@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }*/
}
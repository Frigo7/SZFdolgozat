package com.example.szf_szakdolgozat.ui.maintenance;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.szf_szakdolgozat.R;
import com.example.szf_szakdolgozat.databinding.FragmentMaintenanceBinding;
import com.example.szf_szakdolgozat.databinding.FragmentProductionBinding;
import com.example.szf_szakdolgozat.ui.production.ProductionViewModel;

public class MaintenanceFragment extends Fragment {

    private FragmentMaintenanceBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MaintenanceViewModel maintenanceViewModel =
                new ViewModelProvider(this).get(MaintenanceViewModel.class);

        binding = FragmentMaintenanceBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textMaintenance;
        maintenanceViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
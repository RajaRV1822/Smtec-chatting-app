package com.example.smtecapp20.ui.invite;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.smtecapp20.databinding.FragmentInviteBinding;

public class invitefragment extends Fragment {

    private FragmentInviteBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        inviteViewModel inviteViewModel =
                new ViewModelProvider(this).get(inviteViewModel.class);

        binding = FragmentInviteBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textInvite;
        inviteViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}


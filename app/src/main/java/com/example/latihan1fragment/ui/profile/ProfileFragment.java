package com.example.latihan1fragment.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.latihan1fragment.R;
import com.example.latihan1fragment.ui.notifications.NotificationsViewModel;

public class ProfileFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable
            ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, null);
    }
}

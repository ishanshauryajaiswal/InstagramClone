package com.crossfire.instagramclone.Profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.crossfire.instagramclone.R;

/**
 * @author Akshat Pandey
 * @version 1.0
 * @date 03-10-2017
 */

public class SignOutFragment extends Fragment {

    private static final String TAG = "SignOutFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signout,container,false);

        return view;
    }
}

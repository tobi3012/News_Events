package com.example.tranq.newsevents.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.tranq.newsevents.R;

public class TabMyPageForgotPasswordFragment extends Fragment {

    private EditText edEmailForgot;
    private Button btResetPassword;

    public TabMyPageForgotPasswordFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab_mypage_login, container, false);

        edEmailForgot = (EditText) view.findViewById(R.id.edEmailForgot);
        btResetPassword = (Button) view.findViewById(R.id.btResetPassword);

        initClick();
        return view;
    }

    private void initClick(){

        btResetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}

package com.example.tranq.newsevents.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.tranq.newsevents.R;

public class TabMyPageLoginFragment extends Fragment {

    private EditText edEmailLogin, edPasswordLogin;
    private Button btLogin, btForgotPassword;

    public TabMyPageLoginFragment() {
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

        edEmailLogin = (EditText) view.findViewById(R.id.edEmailLogin);
        edPasswordLogin = (EditText) view.findViewById(R.id.edPasswordLogin);
        btLogin = (Button) view.findViewById(R.id.btLogin);
        btForgotPassword = (Button) view.findViewById(R.id.btForgotPassword);

        initClick();
        return view;
    }

    private void initClick(){

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}

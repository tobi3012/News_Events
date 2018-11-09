package com.example.tranq.newsevents.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.tranq.newsevents.R;

/**
 * Created by HiepTQ on 11/7/2018.
 */

public class TabMyPageSignupFragment extends Fragment {
    private EditText edFullName, edEmailSignup, edPasswordSignup;
    private Button btSignup, btAlready;

    private String fullName, email, password;

    public TabMyPageSignupFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab_mypage, container, false);

        edFullName = (EditText) view.findViewById(R.id.edFullName);
        edEmailSignup = (EditText) view.findViewById(R.id.edEmailSignup);
        edPasswordSignup = (EditText) view.findViewById(R.id.edPasswordSignup);

        /*
        Không thấy tác dụng
        edFullName.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_DATETIME_VARIATION_NORMAL);
        edEmailSignup.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
        edPasswordSignup.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
         */
        btSignup = (Button) view.findViewById(R.id.btSignup);
        btAlready = (Button) view.findViewById(R.id.btAlrealy);

        getDataText();
        initClick();

        return view;
    }

    private void getDataText(){
        fullName = edFullName.getText().toString();
        email = edEmailSignup.getText().toString();
        password = edPasswordSignup.getText().toString();
    }

    private void initClick(){

        if (fullName != null && email != null && password != null ){

            btSignup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }

        btAlready.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

}

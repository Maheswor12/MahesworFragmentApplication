package com.example.mahesworfragmentapplication.ui.addiction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.mahesworfragmentapplication.R;

public class AddictionFragment extends Fragment implements View.OnClickListener {

    EditText etFirst, etSecond;
    Button btnCalculate;
    TextView tvResult;
    int firstnum1, secondnum2, result;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_addiction, container, false);

        etFirst = view.findViewById(R.id.Firstnumber);
        etSecond = view.findViewById(R.id.Secondnumber);
        btnCalculate = view.findViewById(R.id.addCalculate);
        tvResult = view.findViewById(R.id.addResult);

        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        firstnum1 = Integer.parseInt(etFirst.getText().toString());
        secondnum2 = Integer.parseInt(etSecond.getText().toString());
        result = firstnum1 + secondnum2;
        Toast.makeText(getActivity(), "The sum is: " + result, Toast.LENGTH_SHORT).show();


    }
}
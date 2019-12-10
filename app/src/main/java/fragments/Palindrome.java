package fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.dee.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Palindrome extends Fragment implements View.OnClickListener {
    private EditText etNum;
    private Button btnShow;
    private TextView resultArea;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome, container, false);

        etNum= view.findViewById(R.id.etNum);
        btnShow = view.findViewById(R.id.btnShow);
        resultArea= view.findViewById(R.id.resultArea);

        btnShow.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View view) {

        int reversedInteger=0, remainder,originalInteger;
        int num=Integer.parseInt(etNum.getText().toString());
        originalInteger = num;

        while(num !=0) {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num /= 10;

        }
        if(originalInteger == reversedInteger)
            resultArea.setText(originalInteger+"is a Palindrome Number ");
        else
            resultArea.setText(originalInteger+"is not a Palindrome Number ");

    }
}

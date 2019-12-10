package fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
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
public class ArmStrong extends Fragment implements View.OnClickListener {
    private EditText etNum;
    private Button btnShow;
    private TextView resultArea;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_arm_strong, container, false);

        etNum= view.findViewById(R.id.etNum);
        btnShow = view.findViewById(R.id.btnShow);
        resultArea= view.findViewById(R.id.resultArea);

        btnShow.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View view) {
        if (TextUtils.isEmpty(etNum.getText())) {
            etNum.setError("Enter Armstrong Number");
            return;
        }
        int num = Integer.parseInt(etNum.getText().toString());
        int number, temp, total = 0;

        number = num;
        while (number != 0) {
            temp = number % 10;
            total = total + temp * temp * temp;
            number /= 10;

        }
        if (total == num)
            resultArea.setText(num + "is an Armstrong Number ");
        else
            resultArea.setText(num + "is not an Armstrong Number ");
    }
    }

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
public class SimpleInterest extends Fragment implements View.OnClickListener {
    private EditText etPrinciple, etTime, etRate;
    private Button btnCalculate;
    private TextView resultArea;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_interest, container, false);

        etPrinciple = view.findViewById(R.id.etPrinciple);
        etTime = view.findViewById(R.id.etTime);
        etRate = view.findViewById(R.id.etRate);

        btnCalculate = view.findViewById(R.id.btnCalculate);
        resultArea = view.findViewById(R.id.resultArea);

        btnCalculate.setOnClickListener(this);

      return view;
    }

    @Override
    public void onClick(View view) {

        float principle= Float.parseFloat(etPrinciple.getText().toString());
        float time = Float.parseFloat(etTime.getText().toString());
        float rate= Float.parseFloat(etRate.getText().toString());

        float calculate = (principle * time * rate)/ 100;

        resultArea.setText("Simple interest of above data is " + calculate);
    }
}

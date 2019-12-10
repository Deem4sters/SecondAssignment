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
public class Swapping extends Fragment implements View.OnClickListener {
    private EditText etNum;
    private EditText etNum2;
    private Button btnShow;
    private TextView resultArea;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_swapping, container, false);
        etNum= view.findViewById(R.id.etNum);
        etNum2= view.findViewById(R.id.etNum2);
        btnShow = view.findViewById(R.id.btnShow);
        resultArea= view.findViewById(R.id.resultArea);

        btnShow.setOnClickListener(this);



        return view;
    }


    @Override
    public void onClick(View view) {

        int first,second;
        first=Integer.parseInt(etNum.getText().toString());
        second=Integer.parseInt(etNum2.getText().toString());
        first=first+second;
        second=first-second;
        first=first-second;

        resultArea.setText("First Number:"+" "+first+ " "+
                "Second Number:"+" "+second);


    }
}

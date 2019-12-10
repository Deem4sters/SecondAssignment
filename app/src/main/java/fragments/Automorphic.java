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
public class Automorphic extends Fragment implements View.OnClickListener {
    private EditText etNum;
    private Button btnShow;
    private TextView resultArea;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);
        etNum = view.findViewById(R.id.etNum);
        btnShow = view.findViewById(R.id.btnShow);
        resultArea = view.findViewById(R.id.resultArea);

        resultArea.setOnClickListener(this);

        return view;

    }


    @Override
    public void onClick(View v) {

    }
}

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
public class circle extends Fragment implements View.OnClickListener{
    private EditText etRadius;
    private Button btnArea;
    private TextView resultArea;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_circle, container, false);
        etRadius = view.findViewById(R.id.etRadius);
        btnArea = view.findViewById(R.id.btnArea);
        resultArea = view.findViewById(R.id.resultArea);

        btnArea.setOnClickListener(this);


        return view;
    }


    @Override
    public void onClick(View view) {
        float radius= Float.parseFloat(etRadius.getText().toString());
        float area = 3.14f * radius * radius;

        resultArea.setText("Area of circle is" + area);

    }
}

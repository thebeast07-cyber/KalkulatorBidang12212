package com.example.kalkulatorbidang;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class lingkaran extends Fragment {
    private Button btn_hasil;
    private EditText tx_diameter;
    private TextView hasilkeliling,hasilluas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_lingkaran, container, false);
        btn_hasil = v.findViewById(R.id.btn_hasil);
        tx_diameter = v.findViewById((R.id.tx_diameter));
        hasilkeliling = v.findViewById(R.id.hasilkeliling);
        hasilluas = v.findViewById(R.id.hasilluas);

        btn_hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = tx_diameter.getText().toString();


                if (angka1.isEmpty()) {
                    tx_diameter.setError("Angka Harus Di Isi");
                    tx_diameter.requestFocus();
                }else {
                    Double Diameter = Double.parseDouble(angka1);

                    Double keliling = 3.14 * Diameter ;
                    Double luas = 3.14 * ((0.5 * Diameter)*(0.5 * Diameter));

                    hasilkeliling.setText(String.format("%.2f",keliling));
                    hasilluas.setText(String.format("%.2f",luas));

                }
            }
        });

        return v;
    }
}
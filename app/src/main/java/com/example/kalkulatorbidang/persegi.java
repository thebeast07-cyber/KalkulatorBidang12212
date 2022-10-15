package com.example.kalkulatorbidang;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class persegi extends Fragment {
    private Button btn_hasil;
    private EditText tx_panjang,tx_lebar;
    private TextView hasilkeliling,hasilluas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_persegi, container, false);
        btn_hasil = v.findViewById(R.id.btn_hasil);
        tx_panjang = v.findViewById(R.id.tx_panjang);
        tx_lebar = v.findViewById(R.id.tx_lebar);
        hasilkeliling = v.findViewById(R.id.hasilkeliling);
        hasilluas = v.findViewById(R.id.hasilluas);

        btn_hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = tx_panjang.getText().toString();
                String angka2 = tx_lebar.getText().toString();

                if (angka1.isEmpty()) {
                    tx_panjang.setError("Angka Harus Di Isi");
                    tx_panjang.requestFocus();
                }else if (angka2.isEmpty()){
                    tx_lebar.setError("Angka Harus Di Isi");
                    tx_lebar.requestFocus();
                }else {
                    Integer Panjang = Integer.parseInt(angka1);
                    Integer Lebar = Integer.parseInt(angka2);

                    Integer keliling = 2 * (Panjang + Lebar);
                    Integer luas = Panjang * Lebar;

                    hasilkeliling.setText(String.valueOf(keliling));
                    hasilluas.setText(String.valueOf(luas));

                }
            }
        });

        return v;

    }
}
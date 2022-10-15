package com.example.kalkulatorbidang;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;


public class segitiga extends Fragment {
    private Button btn_hasil;
    private EditText tx_alas,tx_tinggi,tx_sisi;
    private TextView hasilkeliling,hasilluas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_segitiga, container, false);
        btn_hasil = v.findViewById(R.id.btn_hasil);
        tx_alas = v.findViewById(R.id.tx_alas);
        tx_tinggi = v.findViewById(R.id.tx_tinggi);
        tx_sisi = v.findViewById(R.id.tx_sisi);
        hasilkeliling = v.findViewById(R.id.hasilkeliling);
        hasilluas = v.findViewById(R.id.hasilluas);

        btn_hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = tx_alas.getText().toString();
                String angka2 = tx_tinggi.getText().toString();
                String angka3 = tx_sisi.getText().toString();

                if (angka1.isEmpty()) {
                    tx_alas.setError("Angka Harus Di Isi");
                    tx_alas.requestFocus();
                }else if (angka2.isEmpty()){
                    tx_tinggi.setError("Angka Harus Di Isi");
                    tx_tinggi.requestFocus();
                }else if (angka3.isEmpty()){
                    tx_sisi.setError("Angka Harus Di Isi");
                    tx_sisi.requestFocus();
                }else {
                    Double Alas = Double.parseDouble(angka1);
                    Double Tinggi = Double.parseDouble(angka2);
                    Double Sisi = Double.parseDouble((angka3));

                    Double keliling = Alas + Tinggi + Sisi ;
                    Double luas = 0.5 * (Alas * Tinggi);

                    hasilkeliling.setText(String.format("%.2f",keliling));
                    hasilluas.setText(String.format("%.2f",luas));

                }
            }
        });


        return v;
    }
}
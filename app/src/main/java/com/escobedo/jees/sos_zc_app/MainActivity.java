package com.escobedo.jees.sos_zc_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bomberos1_tam (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2121222"));
        startActivity(intent);
    }

    public void bomberos2_tam (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2123480"));
        startActivity(intent);
    }

    public void centro_salud_tam (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2122664"));
        startActivity(intent);
    }

    public void cr_cen_tam (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2121333"));
        startActivity(intent);
    }

    public void cr_nte_tam (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2273743"));
        startActivity(intent);
    }

    public void policiam_tam (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:066"));
        startActivity(intent);
    }

    public void hosp_gen_tam (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2131255"));
        startActivity(intent);
    }

    public void issste_tam (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2131820"));
        startActivity(intent);
    }

    public void poli_est_tam (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2143249"));
        startActivity(intent);
    }

    public void bomb_mad (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2150020"));
        startActivity(intent);
    }

    public void cr_mad (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2166688"));
        startActivity(intent);
    }

    public void hosp_civ_mad (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2138909"));
        startActivity(intent);
    }

    public void poli_mad (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2150322"));
        startActivity(intent);
    }

    public void poli_est_mad (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2155926"));
        startActivity(intent);
    }

    public void seg_soc_mad (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2152220"));
        startActivity(intent);
    }

    public void trans_mad (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2150762"));
        startActivity(intent);
    }

    public void trans_alt (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2640038"));
        startActivity(intent);
    }

    public void poli_fed_alt (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2240303"));
        startActivity(intent);
    }

    public void bomb_alt (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:04412504272"));
        startActivity(intent);
    }

    public void bomb_pem_alt (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2640683"));
        startActivity(intent);
    }

    public void prot_civ_alt (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2640127"));
        startActivity(intent);
    }

    public void cent_sal_alt (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2640100"));
        startActivity(intent);
    }

    public void dif_alt (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2640205"));
        startActivity(intent);
    }

    public void poli_minist_alt (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2640122"));
        startActivity(intent);
    }

    public void batallon_alt (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2157915"));
        startActivity(intent);
    }

    public void emergencias (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:066"));
        startActivity(intent);
    }

    public void memo (View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:8333112146"));
        startActivity(intent);
    }
}

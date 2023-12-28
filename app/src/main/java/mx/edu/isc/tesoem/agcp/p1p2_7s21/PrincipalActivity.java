package mx.edu.isc.tesoem.agcp.p1p2_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {

    RadioButton rbhombre, rbmujer, rbbinario;

    Button btnverifica, btncbverifica, btnp2;

    CheckBox cbcasa, cbescuela, cblugares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        rbhombre = findViewById(R.id.rbhombre);
        rbmujer = findViewById(R.id.rbmujer);
        rbbinario = findViewById(R.id.rbbinario);
        cbcasa = findViewById(R.id.cbcasa);
        cbescuela = findViewById(R.id.cbescuela);
        cblugares = findViewById(R.id.cblugares);

        btnverifica = findViewById(R.id.btnverifica);
        btncbverifica = findViewById(R.id.btncbverifica);
        btnp2 = findViewById(R.id.btnp2);

    }

    public void acciones(View v){
        if (v.getId() == R.id.rbhombre){
            Toast.makeText(this, "Se selecciono Hombre", Toast.LENGTH_SHORT).show();
        }else if (v.getId() == R.id.rbbinario){
            Toast.makeText(this, "Se selecciono No binario", Toast.LENGTH_SHORT).show();
        }else if (v.getId() == R.id.rbmujer){
            Toast.makeText(this, "Se selecciono mujer", Toast.LENGTH_SHORT).show();
        }else if (v.getId() == R.id.btnverifica){
            checarradio();
        }else if (v.getId() ==R.id.btncbverifica){
            checarcb();
        }else if (v.getId() == R.id.btnp2){
            Intent intent = new Intent(this, ImagenActivity.class);
            startActivity(intent);
        }
    }

    private void checarcb(){
        if (cbcasa.isChecked()){
            Toast.makeText(this, "Lo usa en casa", Toast.LENGTH_SHORT).show();
        }else if (cbescuela.isChecked()){
            Toast.makeText(this, "Lo usa en la escuela", Toast.LENGTH_SHORT).show();
        }else if (cblugares.isChecked()){
            Toast.makeText(this, "Lo usa en lugares publicos", Toast.LENGTH_SHORT).show();
        }
    }

    public void checarradio(){
        if (rbhombre.isChecked()){
            Toast.makeText(this, "Selecciono hombre", Toast.LENGTH_SHORT).show();
        }else if (rbbinario.isChecked()){
            Toast.makeText(this, "Selecciono no binario", Toast.LENGTH_SHORT).show();
        }else if (rbmujer.isChecked()){
            Toast.makeText(this, "Selecciono mujer", Toast.LENGTH_SHORT).show();
        }
    }
}
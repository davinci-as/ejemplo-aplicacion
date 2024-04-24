package ar.edu.davinci.ejemploaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int numeroGanador = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        double aleatorio = Math.random() * 6 + 1;
        this.numeroGanador = (int) aleatorio;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String jugar() {
        double aleatorio = Math.random() * 6 + 1;
        int numeroDato = (int) aleatorio;
        Log.i("tirar-datos", "Ganaste" + numeroDato);
        if(numeroDato == this.numeroGanador) {
            return "Ganaste: salió " + numeroDato;
        } else {
            return "Perdiste: sacaste " + numeroDato
                + " debería ser " + this.numeroGanador;
        }
    }

    public void tirarDato(View view) {
        LinearLayout resultados = findViewById(R.id.resultados);
        TextView resultado = new TextView(this);
        resultados.addView(resultado);
        String mensaje = jugar();
        resultado.setText(mensaje);
    }
}
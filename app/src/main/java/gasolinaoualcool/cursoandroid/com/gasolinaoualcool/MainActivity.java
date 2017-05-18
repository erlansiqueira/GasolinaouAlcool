package gasolinaoualcool.cursoandroid.com.gasolinaoualcool;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText textoAlcool;
    private EditText textoGasolina;
    private Button botaoVerificar;
    private TextView textoVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoAlcool = (EditText) findViewById(R.id.textoAlcool);
        textoGasolina = (EditText) findViewById(R.id.textoGasolina );
        botaoVerificar = (Button) findViewById(R.id.botaoVerificar);
        textoVerificar = (TextView) findViewById(R.id.textoVerificar);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    //Recuperar valores digitados
                    String textoPrecoAlcool = textoAlcool.getText().toString();
                    String textoPrecoGasolina = textoGasolina.getText().toString();

                    if (textoPrecoAlcool.isEmpty() && textoPrecoGasolina.isEmpty()) {
                        Toast.makeText(getApplicationContext(), "É preciso preencher todos os campos!",
                                Toast.LENGTH_SHORT).show();

                    } else {

                    //Converter valores strings para numero
                        Double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                        Double valorGasolina = Double.parseDouble(textoPrecoGasolina);

                        // dividir o preco do alcool pelo preco da gasolina
                        double resultado = valorAlcool / valorGasolina;

                        if (resultado <= 0.7) {
                            textoVerificar.setText("E melhor usar alcool");
                        } else {

                            textoVerificar.setText("E melhor usar Gasolina");

                        }}
                }


        });

}}




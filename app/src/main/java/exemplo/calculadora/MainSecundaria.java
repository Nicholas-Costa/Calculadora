package exemplo.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class MainSecundaria extends AppCompatActivity {

    TextView visor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_2);

        Toast.makeText(getApplicationContext(), "Entrou na Activity 2", Toast.LENGTH_SHORT).show();

        Intent it = getIntent();
        if(it!=null){
            Bundle params = it.getExtras();
            if(params!=null){
                visor = (TextView) findViewById(R.id.visor_it2);
                String resultado_it = params.getString("key");
                visor.setText(resultado_it);
            }
        }



    }
}

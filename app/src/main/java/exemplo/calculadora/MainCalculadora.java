package exemplo.calculadora;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainCalculadora extends AppCompatActivity {

    TextView display1;
    TextView display2;
    String display3;

    double numero;
    double numero1;
    double numero2;
    double resultado;
    String operacao;
    String operacao1;
    String[] valor;

    //Variável para validações...
    String teste;

    //Variável utilizada para validações...
    int ok = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_calculadora);

        //Buscando valores do XML...
        display1 = findViewById(R.id.visor_pacial);
        display1.setText("");
        display2 = findViewById(R.id.visor_resultado);
        display2.setText("");
        display3 = null;
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (display3!=null){
            Toast.makeText(this, display3, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onRestart() {
        if (display3!=null){
            Toast.makeText(this, display3, Toast.LENGTH_SHORT).show();
        }
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (display3!=null){
            Toast.makeText(this, display3, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onPause() {
        if (display3!=null){
            Toast.makeText(this, display3, Toast.LENGTH_SHORT).show();
        }
        super.onPause();
    }

    @Override
    protected void onStop() {
        if (display3!=null){
            Toast.makeText(this, display3, Toast.LENGTH_SHORT).show();
        }
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        if (display3!=null){
            Toast.makeText(this, display3, Toast.LENGTH_SHORT).show();
        }
        super.onDestroy();
    }

    //OnClick para Todos os Botões...
    public void click(View v){

        if(v.getId()==R.id.num7){ display1.setText(display1.getText()+"7"); }

        if (v.getId()==R.id.num4){ display1.setText(display1.getText()+"4"); }

        if(v.getId()==R.id.num1){ display1.setText(display1.getText()+"1"); }

        if (v.getId()==R.id.num8){ display1.setText(display1.getText()+"8"); }

        if(v.getId()==R.id.num5){ display1.setText(display1.getText()+"5"); }

        if (v.getId()==R.id.num2){ display1.setText(display1.getText()+"2"); }

        if(v.getId()==R.id.num9){ display1.setText(display1.getText()+"9"); }

        if (v.getId()==R.id.num6){ display1.setText(display1.getText()+"6"); }

        if(v.getId()==R.id.num3){ display1.setText(display1.getText()+"3"); }

        if (v.getId()==R.id.num0){ display1.setText(display1.getText()+"0"); }

        if(v.getId()==R.id.mais){

            ok = 1;

            if(display1.getText().toString()==""){
                Toast.makeText(this, "Você precisa digitar um número", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            //Variável para evitar utilização de operações...
            teste = display1.getText().toString();

            if(teste.contains("÷") || teste.contains("*")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("!") || teste.contains("√") || teste.contains("^") || teste.contains("%")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("sen") || teste.contains("cos") || teste.contains("tan")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(ok == 1){
                display1.setText(display1.getText()+"+");
            }
        }

        if (v.getId()==R.id.menos){

            ok = 1;

            if(display1.getText().toString()==""){
                Toast.makeText(this, "Você precisa digitar um número", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            //Variável para evitar utilização de operações...
            teste = display1.getText().toString();

            if(teste.contains("÷") || teste.contains("*")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("!") || teste.contains("√") || teste.contains("^") || teste.contains("%")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("sen") || teste.contains("cos") || teste.contains("tan")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(ok == 1){
                display1.setText(display1.getText()+"-");
            }
        }

        if(v.getId()==R.id.vezes){

            ok = 1;

            if(display1.getText().toString()==""){
                Toast.makeText(this, "Você precisa digitar um número", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            //Variável para evitar utilização de operações...
            teste = display1.getText().toString();

            if(teste.contains("+") || teste.contains("-")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("!") || teste.contains("√") || teste.contains("^") || teste.contains("%")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("sen") || teste.contains("cos") || teste.contains("tan")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(ok == 1){
                display1.setText(display1.getText()+"*");
            }
        }

        if (v.getId()==R.id.dividir){

            ok = 1;

            if(display1.getText().toString()==""){
                Toast.makeText(this, "Você precisa digitar um número", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            //Variável para evitar utilização de operações...
            teste = display1.getText().toString();

            if(teste.contains("+") || teste.contains("-")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("!") || teste.contains("√") || teste.contains("^") || teste.contains("%")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("sen") || teste.contains("cos") || teste.contains("tan")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(ok == 1){
                display1.setText(display1.getText()+"÷");
            }
        }

        if(v.getId()==R.id.maismenos){

            ok = 1;

            //Variável para evitar utilização de operações...
            teste = display1.getText().toString();

            if(teste.contains("+") || teste.contains("÷") || teste.contains("*")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("!") || teste.contains("√") || teste.contains("^") || teste.contains("%")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("sen") || teste.contains("cos") || teste.contains("tan")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }

            if(ok==1){

                //Verifica se o display está vázio...
                if(display1.getText().toString().equals("")){
                    display1.setText("(m1)x");
                }
                else{
                    display1.setText(display1.getText()+"x(m1)");
                }
            }
        }

        if (v.getId()==R.id.clearall){
            
            if(display1.getText().toString().equals("")){
                Toast.makeText(this, "O display já estava limpo!", Toast.LENGTH_SHORT).show();
            }
            
            display1.setText("");
            display2.setText("");
        }

        if(v.getId()==R.id.porcentagem){

            ok = 1;

            if(display1.getText().toString()==""){
                Toast.makeText(this, "Você precisa digitar um número", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            //Variável para evitar utilização de operações...
            teste = display1.getText().toString();

            if(teste.contains("+") || teste.contains("-") || teste.contains("÷") || teste.contains("*")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("!") || teste.contains("√") || teste.contains("^") || teste.contains("%")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("sen") || teste.contains("cos") || teste.contains("tan")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(ok == 1){
                display1.setText(display1.getText()+"%");
            }

        }

        if (v.getId()==R.id.potencia){

            ok = 1;

            if(display1.getText().toString()==""){
                Toast.makeText(this, "Você precisa digitar um número", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            //Variável para evitar utilização de operações...
            teste = display1.getText().toString();

            if(teste.contains("+") || teste.contains("-") || teste.contains("÷") || teste.contains("*")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("!") || teste.contains("√") || teste.contains("^") || teste.contains("%")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("sen") || teste.contains("cos") || teste.contains("tan")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }

            if(ok==1){
                display1.setText(display1.getText()+"^");
            }
        }

        if(v.getId()==R.id.fatorial){

            ok = 1;

            if(display1.getText().toString()==""){
                Toast.makeText(this, "Você precisa digitar um número", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            //Variável para evitar utilização de operações...
            teste = display1.getText().toString();

            if(teste.contains("+") || teste.contains("-") || teste.contains("÷") || teste.contains("*")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("!") || teste.contains("√") || teste.contains("^") || teste.contains("%")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("sen") || teste.contains("cos") || teste.contains("tan")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }

            if(ok==1){
                display1.setText(display1.getText()+"!");
            }
        }

        if (v.getId()==R.id.raiz){

            ok = 1;
            
            //Variável para evitar utilização de operações...
            teste = display1.getText().toString();

            if(teste.contains("+") || teste.contains("-") || teste.contains("÷") || teste.contains("*")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("!") || teste.contains("√") || teste.contains("^") || teste.contains("%")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("sen") || teste.contains("cos") || teste.contains("tan")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(ok == 1){
                display1.setText(display1.getText()+"√");
            }
        }

        if(v.getId()==R.id.seno){

            ok = 1;

            if(display1.getText().toString()==""){
                Toast.makeText(this, "Você precisa digitar um número", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            //Variável para evitar utilização de operações...
            teste = display1.getText().toString();

            if(teste.contains("+") || teste.contains("-") || teste.contains("÷") || teste.contains("*")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("!") || teste.contains("√") || teste.contains("^") || teste.contains("%")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("sen") || teste.contains("cos") || teste.contains("tan")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(ok == 1){
                display1.setText("sen(" + display1.getText() + ")");
            }
        }

        if (v.getId()==R.id.cosseno){

            ok = 1;

            if(display1.getText().toString()==""){
                Toast.makeText(this, "Você precisa digitar um número", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            //Variável para evitar utilização de operações...
            teste = display1.getText().toString();

            if(teste.contains("+") || teste.contains("-") || teste.contains("÷") || teste.contains("*")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("!") || teste.contains("√") || teste.contains("^") || teste.contains("%")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("sen") || teste.contains("cos") || teste.contains("tan")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(ok == 1){
                display1.setText("cos(" + display1.getText() + ")");
            }
        }

        if(v.getId()==R.id.tangente){

            ok = 1;

            if(display1.getText().toString()==""){
                Toast.makeText(this, "Você precisa digitar um número", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            //Variável para evitar utilização de operações...
            teste = display1.getText().toString();

            if(teste.contains("+") || teste.contains("-") || teste.contains("÷") || teste.contains("*")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("!") || teste.contains("√") || teste.contains("^") || teste.contains("%")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(teste.contains("sen") || teste.contains("cos") || teste.contains("tan")){
                Toast.makeText(this, "Esta função só funciona com números", Toast.LENGTH_SHORT).show();
                ok = 0;
            }
            if(ok == 1){
                display1.setText("tan(" + display1.getText() + ")");
            }
        }

        if (v.getId()==R.id.ponto){ display1.setText(display1.getText()+"."); }

        //RESOLUÇÃO DAS OPERAÇÕES...................................................................
        if(v.getId()==R.id.igual){

            //ADIÇÃO...
            if(display1.getText().toString().contains("+")){

                operacao = display1.getText().toString();
                valor = operacao.split("\\+");
                numero1 = Double.parseDouble(valor[0]);
                numero2 = Double.parseDouble(valor[1]);
                resultado = numero1+numero2;
                display2.setText(""+resultado);
                Toast.makeText(this, "Você somou!", Toast.LENGTH_SHORT).show();
                display3 = ("Última operação: "+operacao+" = "+resultado);
                Log.i("Resultado", display3);
            }

            //SUBTRAÇÃO...
            if(display1.getText().toString().contains("-")){

                operacao = display1.getText().toString();
                valor = operacao.split("\\-");
                numero1 = Double.parseDouble(valor[0]);
                numero2 = Double.parseDouble(valor[1]);
                resultado = numero1-numero2;
                display2.setText(""+resultado);
                Toast.makeText(this, "Você subtraiu!", Toast.LENGTH_SHORT).show();
                display3 = ("Última operação: "+operacao+" = "+resultado);
                Log.i("Resultado", display3);
            }

            //DIVISÃO...
            if(display1.getText().toString().contains("÷")){

                operacao = display1.getText().toString();
                valor = operacao.split("\\÷");
                numero1 = Double.parseDouble(valor[0]);
                numero2 = Double.parseDouble(valor[1]);
                if(valor[1].equals("0")){
                    display2.setText("Erro!");
                }
                else{
                    resultado = numero1/numero2;
                    display2.setText(""+resultado);
                }
                Toast.makeText(this, "Você dividiu!", Toast.LENGTH_SHORT).show();
                display3 = ("Última operação: "+operacao+" = "+resultado);
                Log.i("Resultado", display3);
            }

            //MULTIPLICAÇÃO...
            if(display1.getText().toString().contains("*")){

                operacao = display1.getText().toString();
                valor = operacao.split("\\*");
                numero1 = Double.parseDouble(valor[0]);
                numero2 = Double.parseDouble(valor[1]);
                resultado = numero1*numero2;
                display2.setText(""+resultado);
                Toast.makeText(this, "Você multiplicou!", Toast.LENGTH_SHORT).show();
                display3 = ("Última operação: "+operacao+" = "+resultado);
                Log.i("Resultado", display3);
            }

            //FATORIAL...
            if(display1.getText().toString().contains("!")){

                operacao = display1.getText().toString();

                //Substring da posição 0 a anterior da ! ...
                operacao1 = operacao.substring(0, operacao.length()-1);
                numero1 = Double.parseDouble(operacao1);

                double i = numero1 -1;
                while (i>0){
                    numero1 =numero1 * i;
                    i--;
                }
                display2.setText(""+numero1);
                Toast.makeText(this, "Você calculou o fatorial!", Toast.LENGTH_SHORT).show();
                display3 = ("Última operação: "+operacao+" = "+numero1);
                Log.i("Resultado", display3);
            }

            //SENO...
            if(display1.getText().toString().contains("sen")){

                operacao = display1.getText().toString();
                operacao1 = operacao.substring(4, operacao.length()-1);
                numero = Double.parseDouble(operacao1);
                double rad = Math.toRadians(numero);
                resultado = Math.sin(rad);
                display2.setText(""+resultado);
                Toast.makeText(this, "Você calculou o seno!", Toast.LENGTH_SHORT).show();
                display3 = ("Última operação: "+operacao+" = "+resultado);
                Log.i("Resultado", display3);
            }

            //COSSENO...
            if(display1.getText().toString().contains("cos")){

                operacao = display1.getText().toString();
                operacao1 = operacao.substring(4, operacao.length()-1);
                numero = Double.parseDouble(operacao1);
                double rad = Math.toRadians(numero);
                resultado = Math.cos(rad);
                display2.setText(""+resultado);
                Toast.makeText(this, "Você calculou o cosseno!", Toast.LENGTH_SHORT).show();
                display3 = ("Última operação: "+operacao+" = "+resultado);
                Log.i("Resultado", display3);
            }

            //TANGENTE...
            if(display1.getText().toString().contains("tan")){

                operacao = display1.getText().toString();
                operacao1 = operacao.substring(4, operacao.length()-1);
                numero = Double.parseDouble(operacao1);
                double rad = Math.toRadians(numero);
                resultado = Math.tan(rad);
                display2.setText(""+resultado);
                Toast.makeText(this, "Você calculou a tangente!", Toast.LENGTH_SHORT).show();
                display3 = ("Última operação: "+operacao+" = "+resultado);
                Log.i("Resultado", display3);
            }

            //PORCENTAGEM...
            if(display1.getText().toString().contains("%")){

                operacao = display1.getText().toString();
                valor = operacao.split("%");
                numero1 = Double.parseDouble(valor[0]);
                numero2 = Double.parseDouble(valor[1]);
                resultado = numero1*numero2/100;
                display2.setText(""+resultado);
                Toast.makeText(this, "Você calculou a porcentagem!", Toast.LENGTH_SHORT).show();
                display3 = ("Última operação: "+operacao+" = "+resultado);
                Log.i("Resultado", display3);
            }

            //POTÊNCIA...
            if(display1.getText().toString().contains("^")){

                operacao = display1.getText().toString();
                valor = operacao.split("\\^");
                numero1 = Double.parseDouble(valor[0]);
                numero2 = Double.parseDouble(valor[1]);
                resultado = Math.pow(numero1, numero2);
                display2.setText(""+resultado);
                Toast.makeText(this, "Você calculou a potência!", Toast.LENGTH_SHORT).show();
                display3 = ("Última operação: "+operacao+" = "+resultado);
                Log.i("Resultado", display3);
            }

            //RAIZ QUADRADA...
            if(display1.getText().toString().contains("√")){

                operacao = display1.getText().toString();
                operacao1 = operacao.substring(1, operacao.length());
                numero = Double.parseDouble(operacao1);
                resultado = Math.sqrt(numero);
                display2.setText(""+resultado);
                Toast.makeText(this, "Você calculou a raiz quadrada!", Toast.LENGTH_SHORT).show();
                display3 = ("Última operação: "+operacao+" = "+resultado);
                Log.i("Resultado", display3);
            }

            //INVERSÃO DE SINAL...
            if(display1.getText().toString().contains("(m1)")){

                //NÚMERO ANTES...
                if(display1.getText().toString().contains("x(m1)")){

                    operacao = display1.getText().toString();
                    valor = operacao.split("x");

                    //NÚMERO NEGATIVO...
                    if(valor[0].contains("-")){

                        //Substring sem o sinal negativo...
                        operacao1 = operacao.substring(1, valor[0].length());
                        valor[0] = operacao1;
                        numero1 = Double.parseDouble(valor[0]);
                        resultado = (-1)*numero1*(-1);
                        display2.setText(""+resultado);
                        Toast.makeText(this, "Você inverteu o sinal!", Toast.LENGTH_SHORT).show();
                        display3 = ("Ultima operação: "+operacao+ " = "+resultado);
                        Log.i("Resultado", display3);
                    }
                    //NÚMERO POSITIVO...
                    else{
                        numero1 = Double.parseDouble(valor[0]);
                        resultado = numero1*(-1);
                        display2.setText(""+resultado);
                        Toast.makeText(this, "Você inverteu o sinal!", Toast.LENGTH_SHORT).show();
                        display3 = ("Última operação: "+operacao+" = "+resultado);
                        Log.i("Resultado", display3);
                    }
                }

                //NÚMERO DEPOIS...
                if(display1.getText().toString().contains("(m1)x")){

                    operacao = display1.getText().toString();
                    valor = operacao.split("x");

                    //NÚMERO NEGATIVO...
                    if(valor[0].contains("-")){

                        //Substring sem o sinal negativo...
                        operacao1 = operacao.substring(1, operacao.length());
                        valor[0] = operacao1;
                        numero1 = Double.parseDouble(valor[0]);
                        resultado = (-1)*numero1*(-1);
                        display2.setText(""+resultado);
                        Toast.makeText(this, "Você inverteu o sinal!", Toast.LENGTH_SHORT).show();
                        display3 = ("Ultima operação: "+operacao+ " = "+resultado);
                        Log.i("Resultado", display3);
                    }

                    //NÚMERO POSITIVO...
                    else{
                        numero2 = Double.parseDouble(valor[1]);
                        resultado = numero2*(-1);
                        display2.setText(""+resultado);
                        Toast.makeText(this, "Você inverteu o sinal!", Toast.LENGTH_SHORT).show();
                        display3 = ("Última operação: "+operacao+" = "+resultado);
                        Log.i("Resultado", display3);
                    }
                }
            }

            //DISPLAY VAZIO...
            if(display1.getText().toString().equals("")){
                Toast.makeText(this, "Nada a calcular", Toast.LENGTH_SHORT).show();
            }
        }

        //Clicando em Enviar...
        if (v.getId()==R.id.enviar){

            Intent it = new Intent(this, MainSecundaria.class);
            Bundle params = new Bundle();
            params.putString("key", display3);
            it.putExtras(params);
            startActivity(it);
        }

    }

}

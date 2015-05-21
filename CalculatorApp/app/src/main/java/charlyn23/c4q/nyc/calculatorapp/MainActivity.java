package charlyn23.c4q.nyc.calculatorapp;


import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.math.BigDecimal;
import java.util.ArrayList;


import charlyn23.c4q.nyc.calculatorapp.R;


public class MainActivity extends Activity {
        String express="";
        int expLength = 0;
        String answer ="";
        TextView panel;
        BigDecimal results;

//    Button one = (Button)findViewById(R.id.one);
//    Button two = (Button)findViewById(R.id.two);
//    Button three = (Button)findViewById(R.id.three);
//    Button four = (Button)findViewById(R.id.four);
//    Button five = (Button)findViewById(R.id.five);
//    Button six = (Button)findViewById(R.id.six);
//    Button seven = (Button)findViewById(R.id.seven);
//    Button eight = (Button)findViewById(R.id.eight);
//    Button nine = (Button)findViewById(R.id.nine);
//    Button zero = (Button)findViewById(R.id.zero);
//    Button plus = (Button)findViewById(R.id.plus);
//    Button minus = (Button)findViewById(R.id.minus);
//    Button times = (Button)findViewById(R.id.times);
//    Button division = (Button)findViewById(R.id.division);
//    Button tip = (Button)findViewById(R.id.tip);
//    Button exp = (Button)findViewById(R.id.exp);
//    Button power = (Button)findViewById(R.id.power);
//    Button e = (Button)findViewById(R.id.e);
//    Button pi = (Button)findViewById(R.id.pi);
//
//    Button perm = (Button)findViewById(R.id.perm);
//    Button openParen = (Button)findViewById(R.id.openParen);
//    Button closeParen = (Button)findViewById(R.id.closeParen);
//    Button modulo = (Button)findViewById(R.id.modulo);
//    Button clear = (Button)findViewById(R.id.clear);
//    Button help = (Button)findViewById(R.id.help);
//    Button equals = (Button)findViewById(R.id.equals);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ActionBar actionBar = getActionBar();
//        actionBar.hide();
        panel =  (TextView)findViewById(R.id.panel);




    }
        public void buttonclick(View v){
            Button log = (Button)findViewById(R.id.log);
            Button sin = (Button)findViewById(R.id.sin);
            Button cos = (Button)findViewById(R.id.cos);
            Button tan = (Button)findViewById(R.id.tan);
            Button ln = (Button)findViewById(R.id.ln);
            Button sqrt = (Button)findViewById(R.id.sqrt);


//            boolean b = express.charAt(express.length()-1)!='1'||
//                    express.charAt(express.length()-1)!='2'||
//                    express.charAt(express.length()-1)!='3'||
//                    express.charAt(express.length()-1)!='4'||
//                    express.charAt(express.length()-1)!='5'||
//                    express.charAt(express.length()-1)!='6'||
//                    express.charAt(express.length()-1)!='7'||
//                    express.charAt(express.length()-1)!='8'||
//                    express.charAt(express.length()-1)!='9'||
//                    express.charAt(express.length()-1)!='0';



                if(v.getId()==R.id.help){
                        //TODO add activity and set explicit intent
                            }
                if(v.getId()==R.id.deg){
                     express+="*(180/PI)";
                     panel.setText(express);
                }
                if(v.getId()==R.id.perm){
                     express +="!";
                    panel.setText(express);
                }
                if(v.getId()==R.id.openParen){
                    express+="(";
                    panel.setText(express);
                }
                if(v.getId()==R.id.closeParen){
                    express+=")";
                    panel.setText(express);
                }
                if(v.getId()==R.id.percent){
                    express+="%";
                    panel.setText(express);
                }
                if(v.getId()==R.id.clear){
                    express="";
                    panel.setText(express);
                }
                if(v.getId()==R.id.tan){
                    express+="TAN(";
                    panel.setText(express);
                }
                if(v.getId()==R.id.point) {
                    express += ".";
                    panel.setText(express);
                }
                if(v.getId()==R.id.sin){
                    express += "SIN(";
                    panel.setText(express);
                }
                if(v.getId()==R.id.ln){
                    express += "LOG(";
                    panel.setText(express);
                }
                if(v.getId()==R.id.log){
                    express+= "LOG10(";
                    panel.setText(express);
                }
                if(v.getId()==R.id.cos){
                    express += "COS(";
                    panel.setText(express);
                }
                if(v.getId()==R.id.one){
                    express += "1";
                    panel.setText(express);
                }
                if(v.getId()==R.id.two){
                    express += "2";
                    panel.setText(express);
                }
                if(v.getId()==R.id.three){
                    express += "3";
                    panel.setText(express);
                }
                if(v.getId()==R.id.four){
                    express += "4";
                    panel.setText(express);
                }
                if(v.getId()==R.id.five){
                    express += "5";
                    panel.setText(express);
                }
                if(v.getId()==R.id.six){
                    express += "6";
                    panel.setText(express);
                }
                if(v.getId()==R.id.seven){
                    express += "7";
                    panel.setText(express);
                }
                if(v.getId()==R.id.eight){
                    express += "8";
                    panel.setText(express);
                }
                if(v.getId()==R.id.nine){
                    express += "9";
                    panel.setText(express);
                }
                if(v.getId()==R.id.zero){
                    express += "0";
                    panel.setText(express);
                }
                if(v.getId()==R.id.division){
                    express += "/";
                    panel.setText(express);
                }
                if(v.getId()==R.id.times){
                    express += "*";
                    panel.setText(express);
                }
                if(v.getId()==R.id.minus){
                    express += "-";
                    panel.setText(express);
                }
                if(v.getId()==R.id.plus){
                    express += "+";
                    panel.setText(express);
                }
                if(v.getId()==R.id.pi){
                    express += "PI";
                    panel.setText(express);
                }
                if(v.getId()==R.id.e){
                    express += "e";
                    panel.setText(express);
                }
                if(v.getId()==R.id.sqrt){
                    express += "SQRT(";
                    panel.setText(express);
                }
                if(v.getId()==R.id.exp){
                    express += ">>";
                    panel.setText(express);
                }
                if(v.getId()==R.id.power){
                    express += "^";
                    panel.setText(express);
                }
                if(v.getId()==R.id.modulo){
                    express += "%";
                    panel.setText(express);
                }
                if(v.getId()==R.id.inv){

                    if (cos.getText().toString().equals("cos")){
                        cos.setText("acos");
                        sin.setText("asin");
                        tan.setText("atan");
                        ln.setText("ex");
                        log.setText("10x");
                        sqrt.setText("x2");
                    }
                }
                if(v.getId()==R.id.tip){
                    express += "*0.20" ;
                }

            if(v.getId()==R.id.equals){
                try{
                    Expression expression = new Expression(express);
                    results = expression.eval();
                    answer = String.valueOf(results.doubleValue());
                    panel.setText(answer);

                }catch (Exception e){
                    panel.setText("ERROR");
                }
                }
        }




    }

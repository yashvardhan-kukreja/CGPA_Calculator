package com.example.yash1300.cgpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText cred1, cred2, cred3, cred4, cred5;
    Spinner grade1, grade2, grade3, grade4, grade5;
    int cont1, cont2, cont3, cont4, cont5;
    Button cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cred1 = findViewById(R.id.creds1);
        cred2 = findViewById(R.id.creds2);
        cred3 = findViewById(R.id.creds3);
        cred4 = findViewById(R.id.creds4);
        cred5 = findViewById(R.id.creds5);

        grade1 = findViewById(R.id.sub1);
        grade2 = findViewById(R.id.sub2);
        grade3 = findViewById(R.id.sub3);
        grade4 = findViewById(R.id.sub4);
        grade5 = findViewById(R.id.sub5);

        cal = findViewById(R.id.calCGPA);

        final String[] grades1 = {"   #   ", "   S   ", "   A   ", "   B   ", "   C   ", "   D   ", "   E   ", "   N   "};
        final String[] grades = {"#", "S", "A", "B", "C", "D", "E", "N"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, grades1);

        grade1.setAdapter(arrayAdapter);
        grade2.setAdapter(arrayAdapter);
        grade3.setAdapter(arrayAdapter);
        grade4.setAdapter(arrayAdapter);
        grade5.setAdapter(arrayAdapter);

        grade1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (grades[i].equals("S"))
                    cont1 = 10;
                else if (grades[i].equals("A"))
                    cont1 = 9;
                else if (grades[i].equals("B"))
                    cont1 = 8;
                else if (grades[i].equals("C"))
                    cont1 = 7;
                else if (grades[i].equals("D"))
                    cont1 = 6;
                else if (grades[i].equals("E"))
                    cont1 = 5;
                else
                    cont1 = 0;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                cont1 = 0;
            }
        });


        grade2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (grades[i].equals("S"))
                    cont2 = 10;
                else if (grades[i].equals("A"))
                    cont2 = 9;
                else if (grades[i].equals("B"))
                    cont2 = 8;
                else if (grades[i].equals("C"))
                    cont2 = 7;
                else if (grades[i].equals("D"))
                    cont2 = 6;
                else if (grades[i].equals("E"))
                    cont2 = 5;
                else
                    cont2 = 0;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                cont2 = 0;
            }
        });

        grade3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (grades[i].equals("S"))
                    cont3 = 10;
                else if (grades[i].equals("A"))
                    cont3 = 9;
                else if (grades[i].equals("B"))
                    cont3 = 8;
                else if (grades[i].equals("C"))
                    cont3 = 7;
                else if (grades[i].equals("D"))
                    cont3 = 6;
                else if (grades[i].equals("E"))
                    cont3 = 5;
                else
                    cont3 = 0;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                cont3 = 0;
            }
        });

        grade4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (grades[i].equals("S"))
                    cont4 = 10;
                else if (grades[i].equals("A"))
                    cont4 = 9;
                else if (grades[i].equals("B"))
                    cont4 = 8;
                else if (grades[i].equals("C"))
                    cont4 = 7;
                else if (grades[i].equals("D"))
                    cont4 = 6;
                else if (grades[i].equals("E"))
                    cont4 = 5;
                else
                    cont4 = 0;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                cont4 = 0;
            }
        });

        grade5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (grades[i].equals("S"))
                    cont5 = 10;
                else if (grades[i].equals("A"))
                    cont5 = 9;
                else if (grades[i].equals("B"))
                    cont5 = 8;
                else if (grades[i].equals("C"))
                    cont5 = 7;
                else if (grades[i].equals("D"))
                    cont5 = 6;
                else if (grades[i].equals("E"))
                    cont5 = 5;
                else
                    cont5 = 0;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                cont5 = 0;
            }
        });

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numerator = 1.0 * ((Integer.parseInt(cred1.getText().toString())*cont1) + (Integer.parseInt(cred2.getText().toString())*cont2)
                        + (Integer.parseInt(cred3.getText().toString())*cont3) + (Integer.parseInt(cred4.getText().toString())*cont4)
                        + (Integer.parseInt(cred5.getText().toString())*cont5));
                double cgpa = numerator/(Integer.parseInt(cred1.getText().toString()) + Integer.parseInt(cred2.getText().toString()) + Integer.parseInt(cred3.getText().toString()) + Integer.parseInt(cred4.getText().toString()) + Integer.parseInt(cred5.getText().toString()));
                Toast.makeText(MainActivity.this, Double.toString(cgpa), Toast.LENGTH_LONG).show();
            }
        });

    }
}

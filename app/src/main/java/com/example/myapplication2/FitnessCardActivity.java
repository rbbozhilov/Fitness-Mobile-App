package com.example.myapplication2;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class FitnessCardActivity extends AppCompatActivity {
    private EditText editTextFirstName;
    private EditText editTextLastName;
    private EditText editTextFitnessCardNumber;
    private TextView textViewExpireDate;

    private String API_URL = "https://localhost:44336/api/fitnesscard";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitnesscard);

        //Making some show text message
        Toast.makeText(this, "Fitness card check",Toast.LENGTH_SHORT).show();


        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextFitnessCardNumber = findViewById(R.id.editTextFitnessCardNumber);
        textViewExpireDate = findViewById(R.id.textViewExpireDate);

        Button btnGetExpire = findViewById(R.id.btnGetExpire);
        btnGetExpire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstName = editTextFirstName.getText().toString();
                String lastName = editTextLastName.getText().toString();
                String fitnessCardNumber = editTextFitnessCardNumber.getText().toString();

                new FetchExpirationDateTask().execute(firstName, lastName, fitnessCardNumber);
            }
        });
    }

    private class FetchExpirationDateTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            if (params.length < 3) {
                return null;
            }

            String firstName = params[0];
            String lastName = params[1];
            String fitnessCardNumber = params[2];
            API_URL += "/" + firstName + "/" + lastName + "/"+ fitnessCardNumber;

            try {

                URL url = new URL(API_URL);

                URLConnection urlConnection = url.openConnection();
                InputStream inputStream = urlConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                String str = "";
                str = bufferedReader.readLine();
                return str;
            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            if (result != null) {
                // Update UI with the expiration date
                textViewExpireDate.setText("Expire Date: " + result);
            } else {
                // Handle error case
                textViewExpireDate.setText("Failed to fetch expiration date.");
            }
        }
    }
}


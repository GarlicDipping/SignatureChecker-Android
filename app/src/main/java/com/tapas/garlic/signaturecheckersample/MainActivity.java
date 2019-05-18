package com.tapas.garlic.signaturecheckersample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import plugin.tapas.com.signaturechecker.SignatureChecker;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        String appSignature = SignatureChecker.getSignature(this);
        String appSignatureSalted = SignatureChecker.getSignatureSalted(this, "ThisIsASaltString");
        textView.setText(appSignature + "\n" + appSignatureSalted);
    }
}

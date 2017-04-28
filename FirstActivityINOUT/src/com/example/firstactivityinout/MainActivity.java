package com.example.firstactivityinout;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
	
	
	//declaration of properties
	EditText txtName;
	Button btnOk,btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        

        //instantiate the properties
        this.txtName=(EditText) this.findViewById(R.id.editText1);
        this.btnOk=(Button) this.findViewById(R.id.button1);
        this.btnCancel=(Button) this.findViewById(R.id.Button01);
        
        this.btnOk.setOnClickListener(this);
        this.btnCancel.setOnClickListener(this);
    }    
    
    @Override
    
}

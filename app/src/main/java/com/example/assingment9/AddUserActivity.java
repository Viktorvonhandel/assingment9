package com.example.assingment9;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;

public class AddUserActivity extends AppCompatActivity {

    EditText editFirstName, editLastName, editEmail;
    Button addUserButton;
    RadioGroup radioDegreeProgram;
    RadioButton seRadioButton, imRadioButton, ceRadioButton, eeRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        // Näkymä kompot täs
        editFirstName = findViewById(R.id.editFirstName);
        editLastName = findViewById(R.id.editLastName);
        editEmail = findViewById(R.id.editEmail);
        addUserButton = findViewById(R.id.addUserButton);
        radioDegreeProgram = findViewById(R.id.radioDegreeProgram);
        seRadioButton = findViewById(R.id.seRadioButton);
        imRadioButton = findViewById(R.id.imRadioButton);
        ceRadioButton = findViewById(R.id.ceRadioButton);
        eeRadioButton = findViewById(R.id.eeRadioButton);

        // listeneri paluu&lisäysnamiskalle
        addUserButton.setOnClickListener(view -> addUser());

        // valintanppi
        radioDegreeProgram.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.seRadioButton) {

                } else if (checkedId == R.id.imRadioButton) {

                } else if (checkedId == R.id.ceRadioButton) {

                } else if (checkedId == R.id.eeRadioButton) {

                }
            }
        });

    }


    private void addUser() {
        String firstName = editFirstName.getText().toString();
        String lastName = editLastName.getText().toString();
        String email = editEmail.getText().toString();
        String degreeProgram = getSelectedDegreeProgram();


        User user = new User(firstName, lastName, email, degreeProgram);
        UserStorage.getInstance().addUser(user);
        finish();
    }


    private String getSelectedDegreeProgram() {
        int checkedId = radioDegreeProgram.getCheckedRadioButtonId();
        if (checkedId == R.id.seRadioButton) {
            return "Software Engineering";
        } else if (checkedId == R.id.imRadioButton) {
            return "Industrial Management";
        } else if (checkedId == R.id.ceRadioButton) {
            return "Computional Engineering";
        } else if (checkedId == R.id.eeRadioButton) {
            return "Electrical Engineering";
        } else {
            return "";
        }
    }

}

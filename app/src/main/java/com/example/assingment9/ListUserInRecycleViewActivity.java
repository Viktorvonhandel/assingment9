package com.example.assingment9;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ListUserInRecycleViewActivity extends AppCompatActivity {
    RecyclerView rvUserView;
    ListUserInRecycleViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_user_in_recycle_view);


        rvUserView = findViewById(R.id.rvUserView);
        rvUserView.setLayoutManager(new LinearLayoutManager(this));


        List<User> userList = UserStorage.getInstance().getUsers();


        adapter = new ListUserInRecycleViewAdapter(userList);
        rvUserView.setAdapter(adapter);
    }
}



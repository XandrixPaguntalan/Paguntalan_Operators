package mcm.edu.ph.paguntalan_operators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;
        display = findViewById(R.id.display);

        int birthMonth = 1;
        int birthDay = 20;
        int birthYear = 2003;

        int currentMonth = 1;
        int currentDay = 26;
        int currentYear = 2021;

        int myageinmonths, myageindays, myageinyears;

        myageinmonths = currentMonth - birthMonth;
        myageindays = currentDay - birthDay;
        myageinyears = currentYear - birthYear;

        display.setText("My precise age is\n"+String.valueOf(myageinyears)+" Years,\n"+String.valueOf(myageinmonths)+" Months,\n"+String.valueOf(myageindays)+" Days.");

        }
    }

package com.example.deshawnloggins.dlfactquizapp;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//**************************************************************************************************
// This is variable is used to keep track of the total from all the other methods.
//**************************************************************************************************
    int total = 0;
//**************************************************************************************************
// This method is suppose to submit the quiz and report the total the user got right out of 10.
//**************************************************************************************************
    public void submitQuiz(View view)
    {
        String gotName;
        sleepIsTheOnlyAnswer();
        favoriteAnime();
        favoriteGames();
        EditText name = (EditText) findViewById(R.id.players_name);
       gotName = name.getText().toString();
        Context context = getApplicationContext();
        CharSequence text =gotName + " Your Total is: " + total + " out of 10" ;
        int duration = Toast.LENGTH_LONG;
        Toast toast = makeText(context, text, duration);
        toast.show();
    }
//**************************************************************************************************
// This method is used to to check which button is checked and send back a true or false and report
// the total if the correct answer is chosen.
//**************************************************************************************************
    public void hobbysButtonClicked(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId())
        {
            case R.id.music_button:
                if (checked)
                    break;

            case R.id.running_button:
                if (checked)
                    total+= 1;
                break;
            case R.id.progamming_button:
                if (checked)
                    break;
        }
    }
//**************************************************************************************************
//This function is used to get a true or false to see if a button is checked but also the correct
//Answer adds 1 to the total which is the global variable.
//**************************************************************************************************
    public void favoriteFoodButtonClicked(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId())
        {
            case R.id.laptop_button:
                if (checked)
                    break;
            case R.id.book_button:
                if (checked)
                    total+= 1;
                break;
            case R.id.Toast_button:
                if (checked)
                    break;
        }
    }
//**************************************************************************************************
//This method sends back a + 1 into total if checked comes back true.
//**************************************************************************************************
    public void favoriteAnime()
{
    CheckBox bokuHero = (CheckBox) findViewById(R.id.Hero_Academia_checkBox);
    boolean hero = bokuHero.isChecked();
    CheckBox stride = (CheckBox)findViewById(R.id.Stride_CheckBox);
    boolean strideAnime =  stride.isChecked();
    CheckBox sao = (CheckBox)findViewById(R.id.SAO_CheckBox);
    boolean swordArtOnline =  sao.isChecked();
    if(hero)
    {
        total+= 1;
    }
        if (strideAnime)
        {
            total += 1;
        }

            if (swordArtOnline)
            {
                total -= 0;
            }
}
//**************************************************************************************************
//This method sends back a +1 into total if the checkbox is clicked.
//**************************************************************************************************
    public void favoriteGames()
    {
        CheckBox overWatchGame = (CheckBox) findViewById(R.id.Overwatch_checkBox);
        boolean overwatch = overWatchGame.isChecked();
        CheckBox lifeIsStrangeGame = (CheckBox) findViewById(R.id.Life_Strange_Checkbox);
        boolean lifestrange = lifeIsStrangeGame.isChecked();
        CheckBox left4DeadGame = (CheckBox) findViewById(R.id.Left_4_Dead_checkBox);
        boolean left4 = left4DeadGame.isChecked();
        CheckBox ultimateDespair = (CheckBox) findViewById(R.id.Ultimate_Despair_checkBox);
        boolean despair = ultimateDespair.isChecked();

        if (overwatch)
        {
            total += 1;
        }
        if(lifestrange)
        {
            total+=1;
        }
        if(left4)
        {
            total+=1;
        }
        if(despair)
        {
            total+=1;
        }
    }
//**************************************************************************************************
//This method is meant to reset the score, which is the total, but I understand that it doesn't
//rest the buttonClicks themesleves, just the total.
//**************************************************************************************************
    public void resetButton(View view)
    {
        total = 0;
        Context context = getApplicationContext();
        CharSequence text ="Your Total is: " + total + " out of 10" ;
        int duration = Toast.LENGTH_SHORT;
        Toast toStartFromZero = Toast.makeText(context, text, duration);
        toStartFromZero.show();
    }
//**************************************************************************************************
//This method is used as a display text into a toast to give the user a a little more information
//About myself and to motivate them a little more in there own lives.
//**************************************************************************************************
    public void extrasButton(View view)
    {
        Context context = getApplicationContext();
        CharSequence text ="One of my favorite qoutes is:'I don't think I'll learn anything if I don't try to do something about it on my own.' " ;
        int duration = Toast.LENGTH_LONG;
        Toast extrasInfo = makeText(context, text, duration);
        extrasInfo.show();
    }
//**************************************************************************************************
//This is an anything goes method so there is no wrong answer.
//**************************************************************************************************
    public void sleepIsTheOnlyAnswer()
    {
        EditText Moo = (EditText) findViewById(R.id.Favorite_Thing_IN_World);
       String answerForMoo = Moo.getText().toString();
       String rest ="sleep";
       String rest2 ="Sleep";
       if(answerForMoo.equals(rest) || answerForMoo.equals(rest2))
       {
           total += 2;
       }
       else
       {
           Context context = getApplicationContext();
           CharSequence text = "Your answer for Question 1 is wrong. Think, what do you need 8 hour of everyday ? " ;
           int duration = Toast.LENGTH_LONG;
           Toast toast = makeText(context, text, duration);
           toast.show();
       }
    }
//**************************************************************************************************
}

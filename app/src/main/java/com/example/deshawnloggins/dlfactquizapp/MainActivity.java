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
        anythingIsTheCorrentAnswer();
        String gotName;

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
    public void bokuNoHero(View view)
{
    boolean hero;

    CheckBox bokuHero = (CheckBox) findViewById(R.id.Hero_Academia_checkBox);
    hero = bokuHero.isChecked();

    if(hero == true)
    {
        total+= 1;
    }

}

//**************************************************************************************************
//This method sends back a +1 into total if checked comes back true.
//**************************************************************************************************
    public void stride(View view)
{
    boolean strideAnime;

    CheckBox stride = (CheckBox)findViewById(R.id.Stride_CheckBox);
    strideAnime =  stride.isChecked();

    if(strideAnime == true)
    {
        total+= 1;
    }
}

//**************************************************************************************************
//This method sends back a return statment because it isn't mean to do anything.
//**************************************************************************************************
    public void sAO(View view)
    {
        boolean SwordArt;
        CheckBox sao = (CheckBox)findViewById(R.id.SAO_CheckBox);
        SwordArt =  sao.isChecked();

        if(SwordArt == true)
        {
           return;

        }

    }

//**************************************************************************************************
//This method sends back a +1 into total if the checkbox is clicked.
//**************************************************************************************************
    public void overWatch(View view)
    {
        boolean overwatch;
        CheckBox overWatchGame = (CheckBox)findViewById(R.id.Overwatch_checkBox);
        overwatch =  overWatchGame.isChecked();

        if(overwatch == true)
        {
            total+= 1;
        }

    }

//**************************************************************************************************
//This method sends back a +1 into the total if the checkbox is checked.
//**************************************************************************************************
    public void lifeIsStrange(View view)
    {
        boolean lifestrange;
        CheckBox lifeIsStrangeGame = (CheckBox)findViewById(R.id.Life_Strange_Checkbox);
        lifestrange =  lifeIsStrangeGame.isChecked();

        if(lifestrange == true)
        {
            total+= 1;
        }
    }

//**************************************************************************************************
//This method sends back a +1 into total if the checkbox is checked.
//**************************************************************************************************
    public void left4Dead(View view)
    {
        boolean left4;
        CheckBox left4DeadGame = (CheckBox)findViewById(R.id.Left_4_Dead_checkBox);
        left4 =  left4DeadGame.isChecked();

        if(left4 == true)
        {
            total+= 1;
        }
    }

//**************************************************************************************************
//This method sends a +1 into total if checked.
//**************************************************************************************************
    public void ultimateDespair(View view)
    {
        boolean despair;
        CheckBox ultimateDespair = (CheckBox)findViewById(R.id.Ultimate_Despair_checkBox);
        despair =  ultimateDespair.isChecked();

        if(despair == true)
        {
            total+= 1;
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
    public void anythingIsTheCorrentAnswer()
    {
        String answerForMoo;

        EditText Moo = (EditText) findViewById(R.id.Anything_goes);
        answerForMoo = Moo.getText().toString();

       if(answerForMoo != null)

       {
           total += 2;
       }

    }
//**************************************************************************************************

}

package mun.treehsbeginandro_recipefragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RecipeListFragment.OnRecipeSelectedInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // only instantiate a new fragment if it does nto exist already so it is not created on
        // top of existing fragment when you rotate the screen on whenever onCreate is called
        // and another already exists

        RecipeListFragment savedFragment = (RecipeListFragment) getFragmentManager().findFragmentById(R.id.placeHolder);
        if (savedFragment == null) {
            RecipeListFragment myFragment = new RecipeListFragment();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.placeHolder,myFragment);
            fragmentTransaction.commit();
        }


    }

    @Override
    public void onListRecipeSelected(int position) {

        Toast.makeText(MainActivity.this, Recipes.directions[position], Toast.LENGTH_SHORT).show();

    }
}

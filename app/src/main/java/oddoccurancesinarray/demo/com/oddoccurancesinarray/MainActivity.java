package oddoccurancesinarray.demo.com.oddoccurancesinarray;

import android.support.v4.content.res.TypedArrayUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private Boolean duplicateFound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] intArray = new int[]{9, 3, 9, 3, 9, 7, 9};
        
        for (int i = 0; i < intArray.length; i++) {
            duplicateFound = false;
            int j = intArray[i];
            for (int k = 0; k < intArray.length; k++) {
                int l = intArray[k];
                //Log.d("Odd", intArray[i] + ":" + intArray[k]);
                if (intArray[i] == intArray[k] && !(i == k)) {
                    duplicateFound = true;
                }
            }
            //Log.d("Odd", "Duplicate for " + intArray[i] + " " + String.valueOf(duplicateFound));
            if(duplicateFound == false){
                Log.d("Odd", String.valueOf(intArray[i]));
            }
        }
    }
}

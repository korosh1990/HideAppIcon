package ir.androidlife.hideappicon;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PackageManager packageManager = getPackageManager();
                ComponentName componentName = new ComponentName(MainActivity.this, MainActivity.class);
                packageManager.setComponentEnabledSetting(componentName, packageManager.COMPONENT_ENABLED_STATE_DISABLED, packageManager.DONT_KILL_APP);


                Toast.makeText(MainActivity.this, "آیکن مخفی شد!", Toast.LENGTH_SHORT).show();

            }
        });
    }
}

package retrofit.aishwarya.com.butterknifeexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @InjectView(R.id.sample_text)
    public TextView mSampleText;
    @InjectView(R.id.sample_btn)
    public Button mSampleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        mSampleButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.sample_btn) {
            mSampleText.setText("SuccessFully implemented butterknife");
        }
    }

}

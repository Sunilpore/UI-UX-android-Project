package com.logindemo.voice_recorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;

import com.logindemo.R;

public class VoiceRecorderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voice_recorder);

    }

    public void openDialogRcorder(View view) {

        DialogFragment dialogFragment = RecorderDialogFragment.newInstance("voice recording");
        dialogFragment.setCancelable(false);
        dialogFragment.show(getSupportFragmentManager(),"recorder_dialog_frag");
    }

}

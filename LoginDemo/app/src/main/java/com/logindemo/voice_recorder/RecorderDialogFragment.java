package com.logindemo.voice_recorder;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;

import com.logindemo.R;

public class RecorderDialogFragment extends DialogFragment {

    public static final String TITLE = "title";
    boolean btnStatus = false;
    ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.recorder_dialog,container);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imageView = view.findViewById(R.id.iv_audio_btn);
        imageView.setOnClickListener(v->{
            //Toast.makeText(getActivity(), "Clicked....", Toast.LENGTH_SHORT).show();
            btnStatus = !btnStatus;
            if(btnStatus){
                imageView.setBackgroundResource(R.drawable.ic_stop);
            } else {
                imageView.setBackgroundResource(R.drawable.ic_play);
            }

        });
    }

    static RecorderDialogFragment newInstance(String title) {
        RecorderDialogFragment frag = new RecorderDialogFragment();
        Bundle args = new Bundle();
        args.putString(TITLE, title);
        frag.setArguments(args);
        return frag;
    }


}

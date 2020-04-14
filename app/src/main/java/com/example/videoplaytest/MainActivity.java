package com.example.videoplaytest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PixelFormat;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;
    MediaController mController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFormat(PixelFormat.TRANSLUCENT);
        setContentView(R.layout.activity_main);
        videoView = (VideoView) findViewById(R.id.video);
        mController = new MediaController(this);



        File video = new File("/sdcard/test.mp4");
        if(video.exists()){
            videoView.setVideoPath(video.getAbsolutePath());
            videoView.setMediaController(mController);
            mController.setMediaPlayer(videoView);
            videoView.requestFocus();
        }
    }
}

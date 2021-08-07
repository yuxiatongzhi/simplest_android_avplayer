package com.example.zhanghui.avplayer;

import android.content.Context;
import android.view.SurfaceHolder;
import android.widget.MediaController;

/**
 * <TODO>
 *
 * @author Li Junchao
 * @date 2021/8/4 15:14
 */
public class Player extends MediaCodecPlayer implements MediaController.MediaPlayerControl
{
    public Player(SurfaceHolder holder, Context context)
    {
        super(holder, context);
    }

    @Override
    public void seekTo(int pos)
    {

    }

    @Override
    public boolean isPlaying()
    {
        return mState == STATE_PLAYING;
    }

    @Override
    public int getBufferPercentage()
    {
        return 0;
    }

    @Override
    public boolean canPause()
    {
        return true;
    }

    @Override
    public boolean canSeekBackward()
    {
        return true;
    }

    @Override
    public boolean canSeekForward()
    {
        return true;
    }

    @Override
    public int getAudioSessionId()
    {
        return 0;
    }
}

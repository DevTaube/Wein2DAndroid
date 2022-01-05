package wein2dandroid;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Sprite
{
    // Variables ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private Bitmap bitmap;
    protected static App app;
    // Constructor ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Sprite(int resource)
    {
        bitmap = BitmapFactory.decodeResource(app.getResources(), resource);
    }
    // getSprite ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    protected Bitmap getBitmap()
    {
        return bitmap;
    }
}

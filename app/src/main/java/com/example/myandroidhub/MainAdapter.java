package com.example.myandroidhub;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myandroidhub.CameraApp.CameraActivity;
import com.example.myandroidhub.androidteamrecycler.AndroidTeamActivity;
import com.example.myandroidhub.backstack.BackstackActivity;
import com.example.myandroidhub.calculator.OperationsActivity;
import com.example.myandroidhub.callback.CallbackActivity;
import com.example.myandroidhub.fragment.FragmentActivity;
import com.example.myandroidhub.framelayout.FrameActivity;
import com.example.myandroidhub.galleryimage.GalleryActivity;
import com.example.myandroidhub.intent.IntentActivity;
import com.example.myandroidhub.location.GoogleMapsActivity;
import com.example.myandroidhub.moviedetails.MovieDetailsActivity;
import com.example.myandroidhub.multiplefragment.MultipleActivity;
import com.example.myandroidhub.myfirstapp.MainActivity;
import com.example.myandroidhub.permissions.PermissionActivity;
import com.example.myandroidhub.picasso.PicassoActivity;
import com.example.myandroidhub.recyclerview.RecyclerViewActivity;
import com.example.myandroidhub.screenrotate.RotateActivity;
import com.example.myandroidhub.sharedpreference.SharedActivity;
import com.example.myandroidhub.snackbar.SnackBarActivity;
import com.example.myandroidhub.student.StudentActivity;
import com.example.myandroidhub.tables.TablesActivity;
import com.example.myandroidhub.webview.WebViewActivity;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    private List<String> menuList;
    private Context mContext;

    public MainAdapter(List<String> menuList, Context mContext) {
        this.menuList = menuList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.main_list_layout, parent, false);
        MainViewHolder mainViewHolder = new MainViewHolder(view);
        return mainViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MainViewHolder holder, final int position) {

        holder.mButton.setText(menuList.get(position));


        holder.mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String item = menuList.get(position);

                if (item.equalsIgnoreCase("Intent")) {
                    Intent intent = new Intent(mContext, MainActivity.class);
                    mContext.startActivity(intent);
                }
                else if(item.equalsIgnoreCase("Calculator")) {
                    Intent intent = new Intent(mContext, OperationsActivity.class);
                    mContext.startActivity(intent);
                }
                else if(item.equalsIgnoreCase("relative layout")) {
                    Intent intent = new Intent(mContext, RelativeActivity.class);
                    mContext.startActivity(intent);
                }
                else if(item.equalsIgnoreCase("frame layout")) {
                    Intent intent = new Intent(mContext, FrameActivity.class);
                    mContext.startActivity(intent);
                }
                else if(item.equalsIgnoreCase("recycler view")) {
                    Intent intent = new Intent(mContext, RecyclerViewActivity.class);
                    mContext.startActivity(intent);
                }
                else if(item.equalsIgnoreCase("android team")) {
                    Intent intent = new Intent(mContext, AndroidTeamActivity.class);
                    mContext.startActivity(intent);
                }
                else if(item.equalsIgnoreCase("movie details")) {
                    Intent intent = new Intent(mContext, MovieDetailsActivity.class);
                    mContext.startActivity(intent);
                }
                else if(item.equalsIgnoreCase("Rotate")) {
                    Intent intent = new Intent(mContext, RotateActivity.class);
                    mContext.startActivity(intent);
                }
                else if(item.equalsIgnoreCase("Shared Preferences")) {
                    Intent intent = new Intent(mContext, SharedActivity.class);
                    mContext.startActivity(intent);
                }
                else if(item.equalsIgnoreCase("Picasso")) {
                    Intent intent = new Intent(mContext, PicassoActivity.class);
                    mContext.startActivity(intent);
                }
                else if(item.equalsIgnoreCase("Fragment")) {
                    Intent intent = new Intent(mContext, FragmentActivity.class);
                    mContext.startActivity(intent);
                }
                else if(item.equalsIgnoreCase("Backstack")) {
                    Intent intent = new Intent(mContext, BackstackActivity.class);
                    mContext.startActivity(intent);
                }
                else if(item.equalsIgnoreCase("Callbacks")) {
                    Intent intent = new Intent(mContext, CallbackActivity.class);
                    mContext.startActivity(intent);
                }
                else if(item.equalsIgnoreCase("Student")) {
                    Intent intent = new Intent(mContext, StudentActivity.class);
                    mContext.startActivity(intent);
                }
                else if(item.equalsIgnoreCase("permission")) {
                    Intent intent = new Intent(mContext, PermissionActivity.class);
                    mContext.startActivity(intent);
                }
                else if(item.equalsIgnoreCase("Camera")) {
                    Intent intent = new Intent(mContext, CameraActivity.class);
                    mContext.startActivity(intent);
                }
                else if(item.equalsIgnoreCase("Gallery")) {
                    Intent intent = new Intent(mContext, GalleryActivity.class);
                    mContext.startActivity(intent);
                }
                else if(item.equalsIgnoreCase("Location")) {
                    Intent intent = new Intent(mContext, GoogleMapsActivity.class);
                    mContext.startActivity(intent);
                }
                else if(item.equalsIgnoreCase("Share Intent")) {
                    Intent intent = new Intent(mContext, IntentActivity.class);
                    mContext.startActivity(intent);
                }
                else if(item.equalsIgnoreCase("Snackbar")) {
                    Intent intent = new Intent(mContext, SnackBarActivity.class);
                    mContext.startActivity(intent);
                }
                else if(item.equalsIgnoreCase("Webview")) {
                    Intent intent = new Intent(mContext, WebViewActivity.class);
                    mContext.startActivity(intent);
                }
//                else if(item.equalsIgnoreCase("Multiple")) {
//                    Intent intent = new Intent(mContext, MultipleActivity.class);
//                    mContext.startActivity(intent);
//                }
                else
                {
                    Intent intent = new Intent(mContext, TablesActivity.class);
                    mContext.startActivity(intent);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }
}

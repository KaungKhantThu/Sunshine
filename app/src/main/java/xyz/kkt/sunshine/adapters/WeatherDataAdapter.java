package xyz.kkt.sunshine.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.kkt.sunshine.R;
import xyz.kkt.sunshine.viewHolders.WeatherDataViewHolder;

/**
 * Created by Lenovo on 12/1/2017.
 */

public class WeatherDataAdapter extends RecyclerView.Adapter<WeatherDataViewHolder> {
    private LayoutInflater mLayoutInflater;

    public WeatherDataAdapter(Context context) {
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public WeatherDataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View newsItemView = mLayoutInflater.inflate(R.layout.view_item_weather, parent, false);
        return new WeatherDataViewHolder(newsItemView);
    }

    @Override
    public void onBindViewHolder(WeatherDataViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }
}

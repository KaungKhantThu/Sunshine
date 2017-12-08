package xyz.kkt.sunshine.viewHolders;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.kkt.sunshine.R;

/**
 * Created by Lenovo on 12/1/2017.
 */

public class WeatherDataViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.rl_container)
    RelativeLayout rlContainer;

    public WeatherDataViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                rlContainer.setBackgroundColor(R.color.primary);
            }
        });
    }

}

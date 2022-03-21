package com.example.phanvanhuan_18093581_gk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;

public class CycleAdapter  extends BaseAdapter {
    private Context context;
    private int idImage;
    private List<Cycle> cycleList;
    private int positionSelect=-1;

    public CycleAdapter(Context context, int idImage, List<Cycle> cycleList) {
        this.context = context;
        this.idImage = idImage;
        this.cycleList = cycleList;
    }



    @Override
    public int getCount() {
        if(cycleList.size()!=0 && !cycleList.isEmpty())
            return cycleList.size();
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null)
            view= LayoutInflater.from(viewGroup.getContext()).inflate(idImage,viewGroup,false);

        TextView tv_name= (TextView) view.findViewById(R.id.textView_name);
        TextView tv_detail=(TextView) view.findViewById(R.id.textView_detail);
        TextView tv_price=(TextView) view.findViewById(R.id.textView_price2);

        ImageView imageView= (ImageView)  view.findViewById(R.id.imageView);

        final ConstraintLayout constraintLayout= (ConstraintLayout) view.findViewById(R.id.constraintLayout);
        final Cycle cycle = cycleList.get(i);

        if(cycleList!=null && !cycleList.isEmpty()){
            tv_name.setText(cycle.getName());
            tv_detail.setText(cycle.getDetail());
            tv_price.setText("$"+cycle.getPrice());
            int idImage= cycle.getIdImage();
            switch (idImage){
                case 1: imageView.setImageResource(R.drawable.img_1);
                    break;

                case 2: imageView.setImageResource(R.drawable.img_3);
                    break;

                default: break;
            }
        }

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity3.class);
                Bundle bundle = new Bundle();
                bundle.putInt("id", cycle.getIdImage());
                bundle.putString("name", cycle.getName());
                bundle.putString("detail", cycle.getDetail());
                bundle.putString("price", cycle.getPrice()+"$");
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });

        return view;
    }


}

package com.elmansouriadil.realmdatabase.adilosrecycle;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by yeah on 4/22/2016.
 */
public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.UserHolder> {
    private  LayoutInflater layoutInflater;
    private ArrayList<friends> a = new ArrayList();
    public FriendsAdapter(Context context){
        layoutInflater = LayoutInflater.from(context);
        friends f = new friends("adil","is singing");
        a.add(f);
        f = new friends("elmansouri","is coding");
        a.add(f);
        f = new friends("John","is dancing");
        a.add(f);
        f = new friends("Android","Java");
        a.add(f);
        f = new friends("Iphone","Objective-C");
        a.add(f);
        f = new friends("james","is designing");
        a.add(f);
        f = new friends("sara","texting");
        a.add(f);
        f = new friends("alicia","cooking");
        a.add(f);
    }
    @Override
    public UserHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.friends,parent,false);
        UserHolder userHolder = new UserHolder(view);
        return userHolder;
    }

    @Override
    public void onBindViewHolder(UserHolder holder, int position) {
        holder.name.setText(a.get(position).getName());
        holder.note.setText(a.get(position).getNote());
    }


    @Override
    public int getItemCount() {
        return a.size();
    }
    public static class UserHolder extends RecyclerView.ViewHolder{
        TextView name,note;
        public UserHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            note = (TextView) itemView.findViewById(R.id.note);
        }
    }
}

package com.vgroup.tutor;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Emertat on 11/6/2016.
 */
public class DepartmentAdapter extends RecyclerView.Adapter<DepartmentViewHolder> {

    private final int numItems;

    public DepartmentAdapter(int numItems) {
        this.numItems = numItems;
    }

    @Override public DepartmentViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_item_card, viewGroup, false);

        return new DepartmentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(DepartmentViewHolder fakePageVH, int i) {
//        personViewHolder.personName.setText(persons.get(i).name);
//        personViewHolder.personAge.setText(persons.get(i).age);
//        personViewHolder.personPhoto.setImageResource(persons.get(i).photoId);
        // do nothing
    }

    @Override public int getItemCount() {
        return numItems;
    }
}

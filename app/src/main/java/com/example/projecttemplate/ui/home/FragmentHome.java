package com.example.projecttemplate.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.projecttemplate.R;
import com.example.projecttemplate.list_item;
import com.example.projecttemplate.ui.MyListAdapter;

import java.util.ArrayList;

public class FragmentHome extends Fragment {

    ArrayList<list_item> itemArrayList;
    RecyclerView recyclerView;
    MyListAdapter adapter;
    View rootview = null;
    Context ct;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = (RecyclerView) rootview.findViewById(R.id.my_plant_list);
        itemArrayList = new ArrayList<list_item>();

        // fragment는 activity가 아니라서 MainActivity.this 또는 this 사용 불가
        ct = container.getContext();
        Context test = this.getContext();

        // https://lakue.tistory.com/56
        // https://recipes4dev.tistory.com/154
        recyclerView.setLayoutManager(new LinearLayoutManager(ct));

        itemArrayList.add(new list_item(R.drawable.plant_1, "허브"));
        itemArrayList.add(new list_item(R.drawable.plant_2, "카스테라"));
        itemArrayList.add(new list_item(R.drawable.plant_3, "흰둥이"));
        itemArrayList.add(new list_item(R.drawable.plant_4, "멋쟁이"));

        adapter = new MyListAdapter(ct, itemArrayList);
        recyclerView.setAdapter(adapter);

        return rootview;
    }
}

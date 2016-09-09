package mun.treehsbeginandro_recipefragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RecipeListFragment extends Fragment {

    public interface OnRecipeSelectedInterface {
        public void onListRecipeSelected(int position);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list,container,false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.ListRecyclerView);

        // get an instance of this Fragments Activity and cast it to our Interface as the Activity
        // implements our interface. In other words the Activity is the listener
        // then pass the listener to the Adapter. Remember the onClick handler method that will be
        // automatically called when the list item view is clicked is in the ViewHolder class with
        // in the Adapter class. So we pass in the listener object (activity) to the adapter
        // and then onClick method of the ViewHolder calls the onListRecipeSelected of Activity
        // where we show the Toast. This is how we communicate a click or touch event from a fragment
        // to an Activity as it is Activity that is handling the UI
        OnRecipeSelectedInterface listener = (OnRecipeSelectedInterface)getActivity();

        ListAdapter listAdapter = new ListAdapter(listener);
        recyclerView.setAdapter(listAdapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }
}

package we5.innovation.samiulfahad.we5calender;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CalenderAdapter extends RecyclerView.Adapter<CalenderVeiwHolder>
{
    private final ArrayList<String> dayOfMonth;
    private final OnItemListener onItemListener;

    public CalenderAdapter(ArrayList<String> dayOfMonth, OnItemListener onItemListener) {
        this.dayOfMonth = dayOfMonth;
        this.onItemListener = onItemListener;
    }

    @NonNull
    @Override
    public CalenderVeiwHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.calender_cell,parent, false);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (parent.getHeight()*0.166666);
        return new CalenderVeiwHolder(view, onItemListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CalenderVeiwHolder holder, int position)
    {
        holder.dayOfMonth.setText(dayOfMonth.get(position));
    }

    @Override
    public int getItemCount() {
        return dayOfMonth.size();
    }

    public interface  OnItemListener{
        void onItemClick(int position, String dayText);
    }

}

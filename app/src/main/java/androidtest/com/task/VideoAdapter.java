package androidtest.com.task;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidtest.com.task.functions.CreateList;

/**
 * Created by Sridhar on 13-06-2017.
 */

public class VideoAdapter extends ArrayAdapter<CreateList> {
    Context context;

    public VideoAdapter(Context context, int resourceId ,List<CreateList> videoses) {
        super(context, resourceId, videoses);
        this.context = context;

    }

      @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View rowView, ViewGroup parent) {
        ViewHolder holder = null;
       CreateList videoses = getItem(position);

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         rowView = layoutInflater.inflate(R.layout.video_single, parent, false);
        holder = new ViewHolder();

        holder. imageView = (ImageView) rowView.findViewById(R.id.myimage);
        holder.txtTitle = (TextView) rowView.findViewById(R.id.title);
        holder. txttime = (TextView) rowView.findViewById(R.id.time);
        holder. txtDesc = (TextView) rowView.findViewById(R.id.description);
        rowView.setTag(holder);
        //    } else {
        holder = (ViewHolder) rowView.getTag();


        holder.imageView.setImageResource(videoses.getImage_ID());
        holder.txtTitle.setText(videoses.getImage_title());
        holder. txttime.setText(videoses.gettime());
        holder.txtDesc.setText(videoses.getImage_title2());

        return rowView;
    }
    private class ViewHolder {

        ImageView imageView;
        TextView txtTitle;
        TextView txttime;
        TextView txtDesc;


    }

}

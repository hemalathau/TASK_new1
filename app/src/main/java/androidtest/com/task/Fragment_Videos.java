
package androidtest.com.task;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import androidtest.com.task.R;
import androidtest.com.task.VideoAdapter;
import androidtest.com.task.functions.CreateList;
import androidtest.com.task.functions.Validations;

import static androidtest.com.task.R.drawable.swipe;
import static androidtest.com.task.R.id.myswipeimage;

/**
 * Created by Latha on 13-06-2017.
 */

public class Fragment_Videos extends Fragment {
    private ListView lv_videos;
    String[] profile_names = new String[]{" EMPTINESS FT.JUSTIN TIBLEKAR  ", " I'M FALLING LOVE WITH U ", " BABY FT. JUSTIN BABER ", "I'M FALLING LOVE WITH U ", " EMPTINESS FT.JUSTIN TIBLEKAR  "};
    String[] time = new String[]{"20 mins", "20 mins", "20 mins", "20 mins", "20 mins"};
    String[] desc = new String[]{"Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry"};

    int[] Imageids = new int[]{R.drawable.imageone, R.drawable.imaget, R.drawable.imageth, R.drawable.imageone, R.drawable.imaget};

    public Fragment_Videos() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_videos, container, false);
        //initializing_recyclerview(v,R.id.imagegallery);
        View imageswipe = inflater.inflate(R.layout.activity_main, container, false);
     final    ImageView swipeimg = (ImageView) imageswipe.findViewById(R.id.myswipeimage);
        prepareData();
        System.out.println("preparedata:   " + prepareData());
        lv_videos = (ListView) v.findViewById(R.id.lv_videos);
        VideoAdapter adapter = new VideoAdapter(Validations.ctx, 1, prepareData());
        lv_videos.setAdapter(adapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View container, int position, long id) {
// Getting the Container Layout of the ListView

                final TextView tv=(TextView)container.findViewById(R.id.title);
                Toast.makeText(Validations.ctx,tv.getText().toString(),Toast.LENGTH_SHORT).show();

            }
        };
// Setting the item click listener for the listview
        lv_videos.setOnItemClickListener(itemClickListener);


        return v;
    }


    private ArrayList<CreateList> prepareData() {

        ArrayList<CreateList> theimage = new ArrayList<>();
        for (int i = 0; i < profile_names.length; i++) {
            CreateList createList = new CreateList();
            createList.setImage_title(profile_names[i]);
            createList.settime(time[i]);
            createList.setImage_title2(desc[i]);
            createList.setImage_ID(Imageids[i]);
            System.out.println("createList::" + createList);
            theimage.add(createList);
        }
        return theimage;
    }


}

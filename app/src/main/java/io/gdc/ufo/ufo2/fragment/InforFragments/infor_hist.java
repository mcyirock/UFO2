package io.gdc.ufo.ufo2.fragment.InforFragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import io.gdc.ufo.ufo2.R;
import io.gdc.ufo.ufo2.fragment.VO.Event_VO;


public class infor_hist extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public infor_hist() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment infor_hist.
     */
    // TODO: Rename and change types and number of parameters
    public static infor_hist newInstance(String param1, String param2) {
        infor_hist fragment = new infor_hist();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        args.putString("mainEvent", param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_infor_hist, container, false);
        Event_VO vo = new Event_VO(getArguments().get("mainEvent").toString());


        ImageView mainImage = (ImageView)view.findViewById(R.id.infor_hist_main_image);
        int mainImg = getContext().getResources().getIdentifier(vo.getInfo_hist_pic(), "drawable", getContext().getPackageName());
        mainImage.setImageResource(mainImg);
        TextView sd = (TextView)view.findViewById(R.id.infor_hist_short_description);
        TextView ld = (TextView)view.findViewById(R.id.infor_hist_long_description);
        TextView dd = (TextView)view.findViewById(R.id.infor_hist_event_date);
        sd.setText(vo.getTitle()+" 역사");
        ld.setText(vo.getInfo_hist_text());
        dd.setText(vo.getEvent_date());
        
        
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}

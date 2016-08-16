package io.gdc.ufo.ufo2.fragment.InforFragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import io.gdc.ufo.ufo2.R;
import io.gdc.ufo.ufo2.fragment.VO.Event_VO;


public class infor_prog extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public infor_prog() {
        // Required empty public constructor
    }


    public static infor_prog newInstance(String param1, String param2) {
        infor_prog fragment = new infor_prog();
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
        View view = inflater.inflate(R.layout.fragment_infor_prog, container, false);

        Event_VO vo = new Event_VO(getArguments().get("mainEvent").toString());


        ImageView mainImage = (ImageView)view.findViewById(R.id.infor_prog_main_image);
        int mainImg = getContext().getResources().getIdentifier(vo.getInfo_program_pic(), "drawable", getContext().getPackageName());
        mainImage.setImageResource(mainImg);
        TextView sd = (TextView)view.findViewById(R.id.infor_prog_short_description);
        TextView ld = (TextView)view.findViewById(R.id.infor_prog_long_description);
        TextView dd = (TextView)view.findViewById(R.id.infor_prog_event_date);
        sd.setText(vo.getTitle()+" 프로그램");
        //ld.setText(Html.fromHtml(vo.getInfo_program_text()));
        WebView wv = (WebView)view.findViewById(R.id.infor_prog_webview_description);
        wv.loadData(vo.getInfo_program_text(), "text/html; charset=UTF-8", null);


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

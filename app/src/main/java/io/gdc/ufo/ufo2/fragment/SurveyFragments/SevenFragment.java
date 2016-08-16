package io.gdc.ufo.ufo2.fragment.SurveyFragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

import io.gdc.ufo.ufo2.MainActivity;
import io.gdc.ufo.ufo2.R;
import io.gdc.ufo.ufo2.fragment.VO.Event_VO;

public class SevenFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public SevenFragment() {
        // Required empty public constructor
    }

    public static SevenFragment newInstance(String param1, String param2) {
        SevenFragment fragment = new SevenFragment();
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



        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_seven, container, false);
        Event_VO vo = new Event_VO(getArguments().get("mainEvent").toString());

        ImageView mainImage = (ImageView)view.findViewById(R.id.seven_main_image);
        try {
            int mainImg = getContext().getResources().getIdentifier(vo.getQ7_img(), "drawable", getContext().getPackageName());
            mainImage.setImageResource(mainImg);
        }catch(Exception e){
            //질문 그림이 없으면 표시 하지 않음.
        }
        TextView sd = (TextView)view.findViewById(R.id.seven_description);
        sd.setText(vo.getQuestions().get(6));

        Button buttonLoadImage = (Button)view.findViewById(R.id.loadimage);
        TextView textTargetUri = (TextView)view.findViewById(R.id.targeturi);
        ImageView targetImage = (ImageView)view.findViewById(R.id.targetimage);

        buttonLoadImage.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {

            }
        });
        return view;
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
        void onSevenTextInput(String one);
    }


}

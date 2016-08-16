package io.gdc.ufo.ufo2.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import io.gdc.ufo.ufo2.R;
import io.gdc.ufo.ufo2.fragment.VO.Event_VO;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DetailFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static String ARG_PARAM1 = "param1";
    private static String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public DetailFragment() {
        // Required empty public constructor
    }

    public static DetailFragment newInstance(String param1, String param2) {
        DetailFragment fragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        args.putString("event", param1);
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
        Event_VO vo = new Event_VO(getArguments().getString("event"));
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        final ImageView mainImage = (ImageView)view.findViewById(R.id.d_main_image);
        int mainImg = getContext().getResources().getIdentifier(vo.getMain_image(), "drawable", getContext().getPackageName());
        mainImage.setImageResource(mainImg);
        TextView sd = (TextView)view.findViewById(R.id.short_description);
        TextView ld = (TextView)view.findViewById(R.id.long_description);
        sd.setText(vo.getEvent_short_description());
        ld.setText(vo.getEvent_long_description());

        TextView nt = (TextView)view.findViewById(R.id.detail_noti_title);
        nt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.goNotiFromDetail();
            }
        });

        Button surveyBtn = (Button)view.findViewById(R.id.detail_survey_btn);

        nt.setText(vo.getNoticeList().get(0).getTitle());

        surveyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.goSurveyFromDetail();
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
        void goNotiFromDetail();
        void goSurveyFromDetail();
    }
}

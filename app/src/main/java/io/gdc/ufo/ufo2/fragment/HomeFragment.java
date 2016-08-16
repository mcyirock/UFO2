package io.gdc.ufo.ufo2.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import io.gdc.ufo.ufo2.MainActivity;
import io.gdc.ufo.ufo2.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HomeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
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
        //setSetting((LinearLayout)inflater.inflate(R.id.detail_imgGallery,container,false));
        //setSetting((LinearLayout)getView().findViewById(R.id.detail_imgGallery));


        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //홈에 있는 메인에 사진을 선택할때
        view.findViewById(R.id.main_home_image_view).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ((MainActivity)getActivity()).setMainEvent("dano");
            }
        });
        setSetting((LinearLayout)view.findViewById(R.id.detail_imgGallery));
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
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

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    public void setSetting(LinearLayout l){

        //Grace: 갤러리
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(600, 450);

        //파퓰레이트 되는 축제들을 세팅
        LinearLayout l1 = new LinearLayout(getContext());
        l1.setOrientation(LinearLayout.VERTICAL);
        ImageView iv1 = new ImageView(getContext());
        iv1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                ((MainActivity)getActivity()).setMainEvent("coffee");
            }
        });
        TextView it1 = new TextView(getContext());
        TextView it11 = new TextView(getContext());
        it11.setTextColor(getResources().getColor(R.color.colorPrimary));
        it1.setText("2016 제 8회 강릉커피축제");
        it11.setText("2016.09.30 ~ 2016.10.03");
        iv1.setImageResource(R.drawable.fev2_01);
        iv1.setLayoutParams(layoutParams);
        iv1.setPadding(5, 5, 5, 5);
        //iv1.setOnClickListener(1);
        l1.addView(iv1);
        l1.addView(it1);
        l1.addView(it11);
        l.addView(l1);

        LinearLayout l2 = new LinearLayout(getContext());
        l2.setOrientation(LinearLayout.VERTICAL);
        ImageView iv2 = new ImageView(getContext());
        iv2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                ((MainActivity)getActivity()).setMainEvent("tanger");

            }
        });
        TextView it2 = new TextView(getContext());
        TextView it22 = new TextView(getContext());
        it22.setTextColor(getResources().getColor(R.color.colorPrimary));
        it2.setText("삼척 맹방 유채꽃 축제");
        it22.setText("2016.04.08 ~ 2016.04.17");
        iv2.setImageResource(R.drawable.fev3_01);
        iv2.setLayoutParams(layoutParams);
        iv2.setPadding(5, 5, 5, 5);
        //iv1.setOnClickListener(1);
        l2.addView(iv2);
        l2.addView(it2);
        l2.addView(it22);
        l.addView(l2);

        LinearLayout l3 = new LinearLayout(getContext());
        l3.setOrientation(LinearLayout.VERTICAL);
        ImageView iv3 = new ImageView(getContext());
        iv3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                ((MainActivity)getActivity()).setMainEvent("squid");
            }
        });
        TextView it3 = new TextView(getContext());
        TextView it33 = new TextView(getContext());
        it33.setTextColor(getResources().getColor(R.color.colorPrimary));
        it3.setText("오징어 축제");
        it33.setText("2016.09.30 ~ 2016.10.03");
        iv3.setImageResource(R.drawable.fev2_07);
        iv3.setLayoutParams(layoutParams);
        iv3.setPadding(5, 5, 5, 5);
        //iv1.setOnClickListener(1);
        l3.addView(iv3);
        l3.addView(it3);
        l3.addView(it33);
        l.addView(l3);
    }
}

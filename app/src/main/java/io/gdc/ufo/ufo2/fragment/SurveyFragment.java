package io.gdc.ufo.ufo2.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.gdc.ufo.ufo2.R;
import io.gdc.ufo.ufo2.fragment.SurveyFragments.CouponFragment;
import io.gdc.ufo.ufo2.fragment.SurveyFragments.FiveFragment;
import io.gdc.ufo.ufo2.fragment.SurveyFragments.FourFragment;
import io.gdc.ufo.ufo2.fragment.SurveyFragments.OneFragment;
import io.gdc.ufo.ufo2.fragment.SurveyFragments.SevenFragment;
import io.gdc.ufo.ufo2.fragment.SurveyFragments.SixFragment;
import io.gdc.ufo.ufo2.fragment.SurveyFragments.ThreeFragment;
import io.gdc.ufo.ufo2.fragment.SurveyFragments.TwoFragment;

public class SurveyFragment extends Fragment{
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public SurveyFragment() {
        // Required empty public constructor
    }

    public static SurveyFragment newInstance(String param1, String param2) {
        SurveyFragment fragment = new SurveyFragment();
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
        View inflatedView = inflater.inflate(R.layout.fragment_survey, container, false);

        TabLayout tabLayout = (TabLayout) inflatedView.findViewById(R.id.tab_survey);
        tabLayout.addTab(tabLayout.newTab().setText("문항 1"));
        tabLayout.addTab(tabLayout.newTab().setText("문항 2"));
        tabLayout.addTab(tabLayout.newTab().setText("문항 3"));
        tabLayout.addTab(tabLayout.newTab().setText("문항 4"));
        tabLayout.addTab(tabLayout.newTab().setText("문항 5"));
        tabLayout.addTab(tabLayout.newTab().setText("문항 6"));
        tabLayout.addTab(tabLayout.newTab().setText("문항 7"));
        tabLayout.addTab(tabLayout.newTab().setText("쿠폰받기"));

        final ViewPager viewPager = (ViewPager) inflatedView.findViewById(R.id.survey_viewpager);


        PagerAdapter pa = new PagerAdapter(getChildFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(pa);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return inflatedView;
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

    public class PagerAdapter extends FragmentPagerAdapter {
        int mNumOfTabs;

        public PagerAdapter(FragmentManager fm, int NumOfTabs) {
            super(fm);
            this.mNumOfTabs = NumOfTabs;
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return new OneFragment().newInstance(getArguments().getString("mainEvent"), "");
                case 1:
                    return new TwoFragment().newInstance(getArguments().getString("mainEvent"), "");
                case 2:
                    return new ThreeFragment().newInstance(getArguments().getString("mainEvent"), "");
                case 3:
                    return new FourFragment().newInstance(getArguments().getString("mainEvent"), "");
                case 4:
                    return new FiveFragment().newInstance(getArguments().getString("mainEvent"), "");
                case 5:
                    return new SixFragment().newInstance(getArguments().getString("mainEvent"), "");
                case 6:
                    return new SevenFragment().newInstance(getArguments().getString("mainEvent"), "");
                case 7:
                    return new CouponFragment().newInstance(getArguments().getString("mainEvent"), "");
                default:
                    return new OneFragment().newInstance(getArguments().getString("mainEvent"), "");
            }
        }

        @Override
        public int getCount() {
            return mNumOfTabs;
        }
    }
}

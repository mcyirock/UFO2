package io.gdc.ufo.ufo2.fragment;

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

public class CouponShowFragment extends Fragment {

    public CouponShowFragment() {
        // Required empty public constructor
    }

    public static CouponShowFragment newInstance(String param1, String param2) {
        CouponShowFragment fragment = new CouponShowFragment();
        Bundle args = new Bundle();
        args.putString("mainEvent", param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_coupon_show, container, false);

        Event_VO vo = new Event_VO(getArguments().get("mainEvent").toString());

        ImageView mainImage = (ImageView)view.findViewById(R.id.coupon_show_main_image);
        int mainImg = getContext().getResources().getIdentifier(vo.getQ_coupon_img(), "drawable", getContext().getPackageName());
        mainImage.setImageResource(mainImg);
        TextView sd = (TextView)view.findViewById(R.id.coupon_show_short_description);
        TextView ld = (TextView)view.findViewById(R.id.coupon_show_long_description);
        TextView dd = (TextView)view.findViewById(R.id.coupon_show_event_date);
        sd.setText(vo.getTitle()+"의 쿠폰이 발급되었습니다");
        //ld.setText(vo.getInfo_info_text());
        dd.setText(vo.getEvent_date());
        
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


}

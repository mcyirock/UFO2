package io.gdc.ufo.ufo2.fragment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import io.gdc.ufo.ufo2.R;
import io.gdc.ufo.ufo2.fragment.VO.Event_VO;
import io.gdc.ufo.ufo2.fragment.VO.Notice_VO;
import io.gdc.ufo.ufo2.fragment.dummy.DummyContent.DummyItem;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyNotificationRecyclerViewAdapter extends RecyclerView.Adapter<MyNotificationRecyclerViewAdapter.ViewHolder> {

    //private final List<DummyItem> mValues;
    //private final NotificationFragment.OnListFragmentInteractionListener mListener;

    List<Notice_VO> vo;
    NotificationFragment.OnListFragmentInteractionListener mListener;

    public MyNotificationRecyclerViewAdapter(List<Notice_VO> items, NotificationFragment.OnListFragmentInteractionListener listener) {
        vo = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_notification, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = vo.get(position);
        holder.mTitleView.setText(vo.get(position).getTitle());
        holder.mCreatedByView.setText(vo.get(position).getCreatedBy());
        holder.mDateView.setText(vo.get(position).getDate());


        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return vo.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mTitleView;
        public final TextView mCreatedByView;
        public final TextView mDateView;
        public Notice_VO mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mTitleView = (TextView) view.findViewById(R.id.noti_title);
            mCreatedByView = (TextView) view.findViewById(R.id.noti_createdBy);
            mDateView = (TextView) view.findViewById(R.id.noti_date);

        }

        @Override
        public String toString() {
            return super.toString() + " '" + mTitleView.getText() + "'";
        }
    }
}

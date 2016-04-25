package io.github.leibnik.example;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import io.github.leibnik.chatimageview.ChatImageView;

/**
 * Created by Droidroid on 2016/4/25.
 */
public class ChatAdapter extends BaseAdapter {

    private Context mContext;
    private List<ChatBean> mData;

    public ChatAdapter(Context context, List<ChatBean> data) {
        mContext = context;
        mData = data;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public ChatBean getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {
        return 4;
    }

    @Override
    public int getItemViewType(int position) {
        return getItem(position).type;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ChatBean item = getItem(position);
        Viewholder viewholder = null;
        if (convertView == null) {
            viewholder = new Viewholder();
            switch (item.type) {
                case ChatBean.LEFT_IMAGE:
                    convertView = View.inflate(mContext, R.layout.item_image_left, null);
                    viewholder.imageView = (ChatImageView) convertView.findViewById(R.id.chat_image_left);
                    break;
                case ChatBean.LEFT_TEXT:
                    convertView = View.inflate(mContext, R.layout.item_text_left, null);
                    viewholder.textView = (TextView) convertView.findViewById(R.id.tv_text_left);
                    break;
                case ChatBean.RIGHT_IMAGE:
                    convertView = View.inflate(mContext, R.layout.item_image_right, null);
                    viewholder.imageView = (ChatImageView) convertView.findViewById(R.id.chat_image_right);
                    break;
                case ChatBean.RIGHT_TEXT:
                    convertView = View.inflate(mContext, R.layout.item_text_right, null);
                    viewholder.textView = (TextView) convertView.findViewById(R.id.tv_text_right);
                    break;
            }
            convertView.setTag(viewholder);
        } else {
            viewholder = (Viewholder) convertView.getTag();
        }
        switch (item.type) {
            case ChatBean.LEFT_IMAGE:
                viewholder.imageView.setImageResource(item.imgId);
                break;
            case ChatBean.LEFT_TEXT:
                viewholder.textView.setText(item.text);
                break;
            case ChatBean.RIGHT_IMAGE:
                viewholder.imageView.setImageResource(item.imgId);
                break;
            case ChatBean.RIGHT_TEXT:
                viewholder.textView.setText(item.text);
                break;
        }
        return convertView;
    }

    class Viewholder {
        ChatImageView imageView;
        TextView textView;
    }
}

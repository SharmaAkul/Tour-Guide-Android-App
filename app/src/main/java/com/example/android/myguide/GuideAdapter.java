package com.example.android.myguide;


import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


    public class GuideAdapter extends ArrayAdapter<Guide>  {

        private int mColorResourceId;

        /**
         *
         * @param context
         * @param words
         */
        public GuideAdapter(Context context, ArrayList<Guide> words) {
            super(context, 0, words);
        }

        /**
         *
         * @param position
         * @param convertView
         * @param parent
         * @return
         */
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item, parent, false);
            }

            Guide currentWord = getItem(position);

            TextView DescTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

            DescTextView.setText(currentWord.getPlace());


            TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

            defaultTextView.setText(currentWord.getDescrption());

            ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

            imageView.setImageResource(currentWord.getImageResourceId());



            return listItemView;
        }
    }


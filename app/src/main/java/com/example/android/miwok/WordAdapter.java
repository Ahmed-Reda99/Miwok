package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int colorId;

    public WordAdapter(Context context, ArrayList<Word> numberWords,int id) {
        super(context,0, numberWords);
        colorId = id;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwokWord);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.englishWord);
        englishTextView.setText(currentWord.getDefaultTranslation());

        View textContainer = listItemView.findViewById(R.id.textContainer);
        int color = ContextCompat.getColor(getContext(), colorId);
        textContainer.setBackgroundColor(color);


        ImageView wordImage = (ImageView) listItemView.findViewById(R.id.wordImage);

        if(currentWord.getCategory() == 0)
        {
            wordImage.setVisibility(8);
            return listItemView;
        }

        wordImage.setImageResource(currentWord.getImage_id());
        return listItemView;
    }
}

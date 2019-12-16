package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mTopButton;
    private Button mBottomButton;
    private int mIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.topButton);
        mBottomButton = findViewById(R.id.bottomButton);

        mStoryTextView.setText(R.string.T1_Story);
        mTopButton.setText(R.string.T1_Ans1);
        mBottomButton.setText(R.string.T1_Ans2);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (mIndex) {
                    case 1:
                        mStoryTextView.setText(R.string.T3_Story);
                        mTopButton.setText(R.string.T3_Ans1);
                        mBottomButton.setText(R.string.T3_Ans2);

                        mIndex = 3;
                        break;
                    case 2:
                        mStoryTextView.setText(R.string.T3_Story);
                        mTopButton.setText(R.string.T3_Ans1);
                        mBottomButton.setText(R.string.T3_Ans2);

                        mIndex = 3;
                        break;
                    case 3:
                        mStoryTextView.setText(R.string.T6_End);
                        mTopButton.setVisibility(View.INVISIBLE);
                        mBottomButton.setVisibility(View.INVISIBLE);

                        mIndex = 6;
                        break;
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (mIndex) {
                    case 1:
                        mStoryTextView.setText(R.string.T2_Story);
                        mTopButton.setText(R.string.T2_Ans1);
                        mBottomButton.setText(R.string.T2_Ans2);

                        mIndex = 2;
                        break;
                    case 2:
                        mStoryTextView.setText(R.string.T4_End);
                        mTopButton.setVisibility(View.INVISIBLE);
                        mBottomButton.setVisibility(View.INVISIBLE);

                        mIndex = 4;
                        break;
                    case 3:
                        mStoryTextView.setText(R.string.T5_End);
                        mTopButton.setVisibility(View.INVISIBLE);
                        mBottomButton.setVisibility(View.INVISIBLE);

                        mIndex = 5;
                        break;
                }
            }
        });

    }
}

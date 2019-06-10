package com.example.daamjad.bottomsheet;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class MainActivity extends AppCompatActivity {

    private BottomSheetBehavior sheetBehavior;
    private Button btnBottomSheet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpReferences();
        setOnClickListener();

        sheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                switch (newState) {
                    case BottomSheetBehavior.STATE_HIDDEN:
                        break;
                    case BottomSheetBehavior.STATE_EXPANDED: {
                        btnBottomSheet.setText(R.string.close);
                    }
                    break;
                    case BottomSheetBehavior.STATE_COLLAPSED: {
                        btnBottomSheet.setText(R.string.expand);
                    }
                    break;
                    case BottomSheetBehavior.STATE_DRAGGING:
                    case BottomSheetBehavior.STATE_SETTLING:
                        sheetBehavior.setHideable(false);
                        break;
                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });
    }

    //region Helper method
    private void setUpReferences() {
        LinearLayout layoutBottomSheet = findViewById(R.id.bottom_sheet);
        btnBottomSheet = findViewById(R.id.btn_bottom_sheet);
        sheetBehavior = BottomSheetBehavior.from(layoutBottomSheet);
    }
    //endregion

    //region Helper methods for OnClick
    private void setOnClickListener() {
        btnBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED) {
                    sheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                    btnBottomSheet.setText(R.string.close);
                } else {
                    sheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                    btnBottomSheet.setText(R.string.expand);
                }
            }
        });
    }
    //endregion
}

package com.jayway.viewtutorial.part1;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;

public class DistanceTextView extends TemplateTextView {

    private static final int UNIT_M = 0;
    private static final int UNIT_KM = 1;
    private static final String[] FORMATS = { "%.0fm", "%.1fkm" };

    public DistanceTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setDistance(float distance) {
        int unit = UNIT_M;
        float displayDistance = distance;
        if (distance > 1000) {
            unit = UNIT_KM;
            displayDistance = distance / 1000;
        }
        String fromatText = String.format(template, FORMATS[unit]);
        String distanceText = String.format(fromatText, displayDistance);
        setText(Html.fromHtml(distanceText), BufferType.SPANNABLE);
    }
}

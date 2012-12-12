package com.jayway.viewtutorial.part1;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;

public class DurationTextView extends TemplateTextView {

    public DurationTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * Updates the text of the view with the new duration, properly formatted
     * 
     * @param duration
     *            The duration in seconds
     */
    public void setDuration(float duration) {
        int durationInMinutes = Math.round(duration / 60);
        int hours = durationInMinutes / 60;
        int minutes = durationInMinutes % 60;

        String hourText = "";
        String minuteText = "";

        if (hours > 0) {
            hourText = hours + (hours == 1 ? " hour " : " hours ");
        }
        if (minutes > 0) {
            minuteText = minutes + (minutes == 1 ? " minute" : " minutes");
        }
        if (hours == 0 && minutes == 0) {
            minuteText = "less than 1 minute";
        }

        String durationText = String.format(template, hourText + minuteText);
        setText(Html.fromHtml(durationText), BufferType.SPANNABLE);
    }
}

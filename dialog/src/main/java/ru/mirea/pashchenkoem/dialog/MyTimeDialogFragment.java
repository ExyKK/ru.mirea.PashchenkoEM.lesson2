package ru.mirea.pashchenkoem.dialog;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MyTimeDialogFragment {
    public void showDialog(Context context, TextView textView) {
        Calendar calendar = Calendar.getInstance();
        TimePickerDialog timePickerDialog = new TimePickerDialog(context,
                (view, hourOfDay, minute) -> {
                    calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
                    calendar.set(Calendar.MINUTE, minute);
                    textView.setText(DateFormat.getTimeInstance(DateFormat.SHORT, new Locale("ru", "RU")).format(calendar.getTime()));
                }, calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), true);
        timePickerDialog.show();
    }
}

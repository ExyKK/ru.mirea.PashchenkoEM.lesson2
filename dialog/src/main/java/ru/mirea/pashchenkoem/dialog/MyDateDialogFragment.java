package ru.mirea.pashchenkoem.dialog;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MyDateDialogFragment {
    public void showDialog(Context context, TextView textView) {
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(context,
                (view, year, month, dayOfMonth) -> {
                    calendar.set(Calendar.YEAR, year);
                    calendar.set(Calendar.MONTH, month);
                    calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                    textView.setText(DateFormat.getDateInstance(DateFormat.MEDIUM, new Locale("ru", "RU")).format(calendar.getTime()));
                }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }
}

package de.bahnhoefe.deutschlands.bahnhofsfotos.Dialogs;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;

import de.bahnhoefe.deutschlands.bahnhofsfotos.R;

public class SimpleDialogs {

    public void confirm(Context context, int message) {
        new AlertDialog.Builder(new ContextThemeWrapper(context, R.style.AlertDialogCustom))
                .setIcon(R.mipmap.ic_launcher)
                .setTitle(R.string.app_name)
                .setMessage(message)
                .setNeutralButton(R.string.button_ok_text, null).create().show();
    }

    public void confirm(Context context, CharSequence message) {
        new AlertDialog.Builder(new ContextThemeWrapper(context, R.style.AlertDialogCustom))
                .setIcon(R.mipmap.ic_launcher)
                .setTitle(R.string.app_name)
                .setMessage(message)
                .setNeutralButton(R.string.button_ok_text, null).create().show();
    }

    public void select(Context context, CharSequence message, CharSequence[] items, int checkedItem, DialogInterface.OnClickListener listener) {
        new AlertDialog.Builder(new ContextThemeWrapper(context, R.style.AlertDialogCustom))
                .setIcon(R.mipmap.ic_launcher)
                .setTitle(R.string.app_name)
                .setSingleChoiceItems(items, checkedItem, null)
                .setPositiveButton(message, listener)
                .create().show();
    }
}

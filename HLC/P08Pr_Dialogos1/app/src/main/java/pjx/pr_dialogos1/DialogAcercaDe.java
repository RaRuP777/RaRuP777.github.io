package pjx.pr_dialogos1;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;

public class DialogAcercaDe extends DialogFragment {

    public Dialog onCreateDialog(Bundle savedInstanceState){

        AlertDialog.Builder dialogo = new AlertDialog.Builder(getActivity());

        dialogo.setMessage("IESGC. Desarrollo de Aplicaciones Web")
                .setTitle("Acerca de")
                .setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        dialog.cancel();
                    }
                });
        return dialogo.create();
    }

}

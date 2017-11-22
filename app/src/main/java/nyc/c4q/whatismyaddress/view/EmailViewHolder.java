package nyc.c4q.whatismyaddress.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.whatismyaddress.R;
import nyc.c4q.whatismyaddress.model.Emails;

/**
 * Created by c4q on 11/21/17.
 */

public class EmailViewHolder extends RecyclerView.ViewHolder {
    private TextView emails;


    public EmailViewHolder(View itemView) {
        super(itemView);
        emails = itemView.findViewById(R.id.email_view_list);
    }
    public void onBind(Emails emails) {
        emails.setText(Emails.getEmails());
    }
}

package nyc.c4q.whatismyaddress.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.whatismyaddress.R;
import nyc.c4q.whatismyaddress.model.Emails;
import nyc.c4q.whatismyaddress.view.EmailViewHolder;

/**
 * Created by c4q on 11/21/17.
 */

public class EmailAdapter extends RecyclerView.Adapter<EmailViewHolder> {

    private List<Emails> emailList;

    public EmailAdapter(List<Emails> emailList) {
        this.emailList = emailList;
    }

    @Override
    public EmailViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.email_item_view, parent, false);
        return new EmailViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(EmailViewHolder holder, int position) {
        Emails emails = emailList.get(position);

        holder.onBind(emails);
    }

    @Override
    public int getItemCount() {
        return emailList.size();
    }


}

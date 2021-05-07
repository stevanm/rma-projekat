package rs.ac.uns.pmf.footballteamfinder.presentation.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import rs.ac.uns.pmf.footballteamfinder.R;
import rs.ac.uns.pmf.footballteamfinder.core.domain.Team;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.ViewHolder> {

    private Context context;

    List<Team> teams = new ArrayList<>();

    public TeamAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.team_row_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Team team = teams.get(position);

        holder.getNameTextView().setText(team.getName());
        holder.getCityTextView().setText(team.getCity());
        holder.getFoundedTextView().setText(String.valueOf(team.getFounded()));
        Picasso.get()
                .load(team.getLogo())
                .resize(60, 60)
                .into(holder.getImageView());

        holder.itemView.setOnClickListener(v ->
                {
                    ((MainActivity) context).onTeamItemClick(teams.get(position));
                }
        );
    }

    @Override
    public int getItemCount() {
        return teams.size();
    }


    public void setList(List<Team> teamList) {
        this.teams = teamList;
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView teamName;
        private TextView teamCity;
        private TextView teamFounded;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.logo);
            teamName = itemView.findViewById(R.id.teamName);
            teamCity = itemView.findViewById(R.id.teamCity);
            teamFounded = itemView.findViewById(R.id.teamFounded);
        }

        public ImageView getImageView() {
            return imageView;
        }

        public TextView getNameTextView() {
            return teamName;
        }

        public TextView getCityTextView() {
            return teamCity;
        }

        public TextView getFoundedTextView() {
            return teamFounded;
        }

    }
}

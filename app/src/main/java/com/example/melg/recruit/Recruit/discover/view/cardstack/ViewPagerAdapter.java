//package com.example.melg.recruit.Recruit.discover.view.cardstack;
//
//import android.content.Context;
//import android.support.annotation.NonNull;
//import android.support.v4.view.PagerAdapter;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//
//import com.example.melg.recruit.R;
//
//import butterknife.BindView;
//import butterknife.ButterKnife;
//
//public class ViewPagerAdapter extends PagerAdapter {
//
//
//
//
//
//    private List<RecentGames.Results> contents;
//    private Context context;
//
//    public ViewPagerAdapter(Context context, List<RecentGames.Results> listResults) {
//        this.context = context;
//        contents=listResults;
//    }
//
//    public void addData(List<RecentGames.Results> data){
//
//        contents.addAll(data);
//        notifyDataSetChanged();
//    }
//
//    @Override
//    public int getCount() {
//        return contents.size();
//    }
//
//    @Override
//    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
//
//        return view== (CardView)object;
//    }
//
//    @NonNull
//    @Override
//    public Object instantiateItem(@NonNull ViewGroup container, int position) {
//        LayoutInflater inflater= (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View view= inflater.inflate(R.layout.games_viewholder, container, false);
//        container.addView(view);
//        ButterKnife.bind(this,view);
//
////        homeTeamImage = view.findViewById(R.id.home_team);
////        homeScore = view.findViewById(R.id.home_score);
////        awayScore = view.findViewById(R.id.away_score);
////        competition = view.findViewById(R.id.competition);
//
//
//
////        homeTeamImage.setImageResource(R.drawable.realmadridshield);
////        homeScore.setText(String.valueOf(contents.get(position).getSportEventStatus().getHomeScore()));
////        awayScore.setText(String.valueOf(contents.get(position).getSportEventStatus().getAwayScore()));
////        competition.setText(contents.get(position).getSportEvent().getTournament().getName());
////        homeName.setText(contents.get(position).getSportEvent().getCompetitors().get(0).getName());
////        awayName.setText(contents.get(position).getSportEvent().getCompetitors().get(1).getName());
////
////
////        setShieldHomeTeam(position);
////        setShieldAwayTeam(position);
//
//
//        return view;
//    }
//
//
//
//
//
//    @Override
//    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//        container.removeView((View) object);
//    }
//
//}

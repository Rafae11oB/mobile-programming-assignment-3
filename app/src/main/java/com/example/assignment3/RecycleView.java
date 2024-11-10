public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private final List<String> movieList;

    public MovieAdapter(List<String> movieList) {
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        holder.textView.setText(movieList.get(position));
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    static class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.movieName);
        }
    }
}

@Override
public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
    holder.textView.setText(movieList.get(position));
    holder.itemView.setOnClickListener(v -> 
        Toast.makeText(v.getContext(), "Clicked: " + movieList.get(position), Toast.LENGTH_SHORT).show());
}
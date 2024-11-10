public class BasicFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_basic, container, false);
        Log.d("BasicFragment", "onCreateView called");
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("BasicFragment", "onStart called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("BasicFragment", "onResume called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("BasicFragment", "onPause called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("BasicFragment", "onStop called");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("BasicFragment", "onDestroyView called");
    }
}
public class OutputFragment extends Fragment {
    private SharedViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_output, container, false);
        viewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
        TextView textView = view.findViewById(R.id.textView);

        viewModel.getInputText().observe(getViewLifecycleOwner(), textView::setText);
        return view;
    }
}

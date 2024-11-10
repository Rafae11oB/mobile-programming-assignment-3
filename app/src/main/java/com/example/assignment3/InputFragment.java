public class InputFragment extends Fragment {
    private SharedViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_input, container, false);
        viewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        EditText editText = view.findViewById(R.id.editText);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                viewModel.setInputText(s.toString());
            }
            // Other required methods for TextWatcher (empty in this case)...
        });
        return view;
    }
}

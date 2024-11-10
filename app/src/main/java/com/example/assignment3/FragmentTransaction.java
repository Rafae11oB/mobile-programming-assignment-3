public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button switchButton = findViewById(R.id.switchButton);
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Initial Fragment load
        fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, new FragmentA(), "FRAGMENT_A")
                .commit();

        switchButton.setOnClickListener(v -> {
            Fragment currentFragment = fragmentManager.findFragmentById(R.id.fragmentContainer);
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            if (currentFragment instanceof FragmentA) {
                transaction.replace(R.id.fragmentContainer, new FragmentB(), "FRAGMENT_B");
            } else {
                transaction.replace(R.id.fragmentContainer, new FragmentA(), "FRAGMENT_A");
            }
            transaction.commit();
        });
    }
}

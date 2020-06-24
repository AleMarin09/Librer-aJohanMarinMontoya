 Este es una librería de un Onboardin hecho en clase el cual permitirá al usuario tener 3 Screen de un Onboarding sin necesidad de realizar todo el código necesario para eso necesito que sigas los siguientes pasos:
 1.- Copiar el siguiente link  en el build.gradle proyect: maven { url 'https://jitpack.io' }
2.- Copiar el siguiente enlace en el build.gradle module app: implementation 'com.github.AleMarin09:Librer-aJohanMarinMontoya:1.2'
3.- Copiar  en el main java: public class MainActivity extends AppCompatActivity {

    private ViewPager viewPagerContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializeComponents
        _initializeComponents();

        //initializeAdapter
        _initializeFragmentAdapter();
    }

    public void _initializeComponents(){
        viewPagerContainer = findViewById(R.id.viewPagerContainer);
    }

    public void _initializeFragmentAdapter() {
        OnboardingAdapter adapter = new OnboardingAdapter(getSupportFragmentManager());
        viewPagerContainer.setAdapter(adapter);
    }

}
4.- Copiar en el activuty main.xml: 
   <androidx.viewpager.widget.ViewPager
        android:id="@+id/viewPagerContainer"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
    </androidx.viewpager.widget.ViewPager>

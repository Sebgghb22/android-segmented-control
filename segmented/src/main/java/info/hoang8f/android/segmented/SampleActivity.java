package info.hoang8f.android.segmented;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SampleActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_sample, container, false);

            SegmentedGroup segmented2 = (SegmentedGroup) rootView.findViewById(R.id.segmented2);
            segmented2.setTintColor(Color.DKGRAY);

            SegmentedGroup segmented3 = (SegmentedGroup) rootView.findViewById(R.id.segmented3);
            //Tint color, and text color when checked
            segmented3.setTintColor(Color.parseColor("#FFD0FF3C"), Color.parseColor("#FF7B07B2"));

            SegmentedGroup segmented4 = (SegmentedGroup) rootView.findViewById(R.id.segmented4);
            segmented4.setTintColor(getResources().getColor(R.color.radio_button_selected_color));

            return rootView;
        }
    }

}

package uz.itjunior.akrommalik.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import uz.itjunior.akrommalik.R;

public class AppInfoFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                              ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_app_info, container, false);

        return root;
    }
}

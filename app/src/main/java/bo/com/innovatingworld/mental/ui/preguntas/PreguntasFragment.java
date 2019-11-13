package bo.com.innovatingworld.mental.ui.preguntas;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bo.com.innovatingworld.mental.R;

public class PreguntasFragment extends Fragment {

    private PreguntasViewModel mViewModel;

    public static PreguntasFragment newInstance() {
        return new PreguntasFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.preguntas_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(PreguntasViewModel.class);
        // TODO: Use the ViewModel
    }

}

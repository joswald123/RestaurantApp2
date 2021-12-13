package usa.sesion1.reto2.ui.menu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import usa.sesion1.reto2.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link menuFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class menuFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public menuFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment menuFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static menuFragment newInstance(String param1, String param2) {
        menuFragment fragment = new menuFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    // Botones menu
    private Button ordenar_btn1, ordenar_btn2, ordenar_btn3, ordenar_btn4;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // se modifica el inflate empezando con un "view root" y se retorna el root
        View root = inflater.inflate(R.layout.fragment_menu, container, false);

        // Se conectan las variables a sus ids
        ordenar_btn1 = root.findViewById(R.id.btnCassoulet);
        ordenar_btn2 = root.findViewById(R.id.btnGraten);
        ordenar_btn3 = root.findViewById(R.id.btnRatatouille);
        ordenar_btn4 = root.findViewById(R.id.btnBullabesa);

        // Acciones de los botones
        ordenar_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Se agrego al carrito", Toast.LENGTH_LONG).show();
            }
        });
        ordenar_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Se agrego al carrito", Toast.LENGTH_LONG).show();
            }
        });
        ordenar_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Se agrego al carrito", Toast.LENGTH_LONG).show();
            }
        });
        ordenar_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Se agrego al carrito", Toast.LENGTH_LONG).show();
            }
        });

        return root;
    }
}
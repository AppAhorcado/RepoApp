package val.femxa.cam.edu.myphotoproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class CreditsActivity extends AppCompatActivity {

    String texto;
    TextView creditos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        creditos = (TextView)findViewById(R.id.text);
        creditos.setText("CREDITOS: \n\n"+getTexto());
        setContentView(creditos);
    }

    public void setTexto(){
        texto = "Isabel Martin Alonso\n" +
                "\tContact: isabelmartinalonso2@gmail.com\n" +
                "\tGitHub: github.com/isamaralo\n" +
                "\tFrom: Avila, Spain\n" +
                "\n" +
                "\tTony Lopez Belinchon\n" +
                "\tContact: antonio3650@gmail.com\n" +
                "\tGitHub: github.com/antoniolb92\n" +
                "\tFrom: Madrid, Spain\n" +
                "\n" +
                "\tSusana Sanchez Montero\n" +
                "\tContact: susanasanchez@auxiliamadrid.org\n" +
                "\tGitHub: github.com/Susanasanch\n" +
                "\tFrom: Madrid, Spain\n" +
                "\n" +
                "\tNira Maria Bethencourt Hernandez\n" +
                "\tContact: nirabethencourt@gmail.com\n" +
                "\tGitHub: github.com/niraBH\n" +
                "\tFrom: Tenerife, Spain\n" +
                "\n" +
                "\tCarlota Elena Sanchez Sansegundo\n" +
                "\tContact: carlotasanchezsansegundo@gmail.com\n" +
                "\tGitHub: github.com/css94\n" +
                "\tFrom: Madrid, Spain\n" +
                "\t\n" +
                "\tCristian Hernandez Del Caso\n" +
                "\tContact: cristianhernandezdelcaso@hotmail.com\n" +
                "\tGitHub: github.com/Cristian8\n" +
                "\tFrom: Avila, Spain\n" +
                "\t\n" +
                "\tDante Jeanpier Olivares Oruna\n" +
                "\tContact: dante_cancer27@hotmail.com\n" +
                "\tGitHub: github.com/dante321\n" +
                "\tFrom: Lima, Peru\n" +
                "\t\n" +
                "\tManuel Santiago Risquez\n" +
                "\tContact: manudj_2006@hotmail.com\n" +
                "\tGitHub: github.com/manu160427\n" +
                "\tFrom: Madrid, Spain\n" +
                "\t\n" +
                "\tArtistic Director: Francisco Javier Moreno Pereda (\"Luis Mambreche\")\n" +
                "\tContact: morenopereda12@gmail.com\n" +
                "\tGitHub: github.com/jmoremore\n" +
                "\tFrom: Albacete, Spain\t\n" +
                "\t\n" +
                "\tShallow Worker: Iulian Constantin Anghel (\"Julian The Angel\")\n" +
                "\tContact: iulian.anghel19@gmail.com\n" +
                "\tGitHub: github.com/iulianang\n" +
                "\tFrom: Bucarest, Romania\n" +
                "\t\n" +
                "\tShallow Worker: Zaineb Mazouz\n" +
                "\tContact: z.m.malak@hotmail.com\n" +
                "\tGitHub: github.com/zaineb88\n" +
                "\tFrom: Rabat, Morocco\n" +
                "\t\n" +
                "\tShallow Worker: Cristina Calvo Sanz\n" +
                "\tContact: c.calvosanz@gmail.com\n" +
                "\tGitHub: github.com/crikycs\n" +
                "\tFrom: Madrid, Spain\n" +
                "\t\n" +
                "\tShallow Worker: Alvaro Esteve Atance\n" +
                "\tContact: alvarodava@gmail.com\n" +
                "\tGitHub: github.com/SteveR98 \n" +
                "\tFrom: Madrid, Spain\n" +
                "\t\n" +
                "\tShallow Worker: Diego Bladimir Duque Castillo\n" +
                "\tContact: diego.duque90@gmail.com\n" +
                "\tGitHub: github.com/dbcd\n" +
                "\tFrom: Madrid, Spain\t\n" +
                "\n" +
                "\tDaniel Garcea-Nieto Sanchez-Guijaldo\n" +
                "\tContact: daniel_garciasanchez@hotmail.com\n" +
                "\tGitHub: github.com/danielparla\n" +
                "\tFrom: Madrid, Spain\n" +
                "\t\n" +
                "\tRodrigo Muñoz Sanchez\n" +
                "\tContact: rodrickms@gmail.com\n" +
                "\tGitHub: github.com/rodrick88\n" +
                "\tFrom: Madrid, Spain\n" +
                "\t\n" +
                "\tAitor Garcea Ruiz\n" +
                "\tContact: aitor.garcia.ruiz@hotmail.com\n" +
                "\tGitHub: github.com/AitorPCGR\n" +
                "\tFrom: Madrid, Spain\n" +
                "\t\n" +
                "\tAlvaro Garcia Fernandez\n" +
                "\tContact: alvgarfer@gmail.com\n" +
                "\tGitHub: github.com/alvgarfer\n" +
                "\tFrom: Madrid, Spain";

    }

    public String getTexto(){
        return texto;
    }

}

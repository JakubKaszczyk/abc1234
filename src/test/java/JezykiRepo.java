import com.example.abc123.R;

import java.util.ArrayList;

public class JezykiRepo  {
   public static ArrayList<Jezyk> jezyki = new ArrayList<>();

   public static void wypelnijTablice(){
      jezyki.add(new Jezyk("PHP", R.drawable.android));
      jezyki.add(new Jezyk("JAVA", R.drawable.bank));
      jezyki.add(new Jezyk("RUBY", R.drawable.zegar));
   }



}

package ya.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import static android.R.attr.button;

public class Sample1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TableLayout tl = new TableLayout(this);
        setContentView(tl);

        TableRow[] tr = new TableRow[10];

        TextView[] tv = new TextView[10];
        Button[] bt = new Button[10];

        for (int i = 0; i < tr.length; i++) {
            tr[i] = new TableRow(this);

            tv[i] = new TextView(this);
            tv[i].setText("商品番号" + i + "-------");
            bt[i] = new Button(this);
            bt[i].setText("購入");

            tr[i].addView(tv[i]);
            tr[i].addView(bt[i]);

            tl.addView(tr[i]);
        }
    }
}

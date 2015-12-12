package com.android.count;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final static int ERROR = -1;

    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        Node node = new Node("+");
        Node rightNode = new Node("*");

        node.setLeftNode(new Node(2));
        node.setRightNode(rightNode);

        rightNode.setLeftNode(new Node(2));
        rightNode.setRightNode(new Node(3));

        if ( node.evaluate() == ERROR ){
            resultTextView.setText("error!!");
        }else{
            resultTextView.setText( String.valueOf(node.evaluate()));
        }



    }

    private void initView() {
        resultTextView = (TextView)findViewById(R.id.result_TextView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

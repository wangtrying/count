package com.android.count;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.android.count.terry.INode;
import com.android.count.terry.numbers.NumNode;
import com.android.count.terry.operators.binaryOperators.AddNode;
import com.android.count.terry.operators.binaryOperators.MultiplyNode;

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



        // add by Terry
        //


        // create number nodes first
        INode node1 = new NumNode(1);
        INode node2 = new NumNode(2);
        INode node3 = new NumNode(3);

        //create * node
        INode multiplyNode = new MultiplyNode(node2, node3);

        //create + node
        INode addNode = new AddNode(node1, multiplyNode);

        resultTextView.setText("I am Terry: "+ String.valueOf(addNode.evaluate()));


        // add by Terry



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

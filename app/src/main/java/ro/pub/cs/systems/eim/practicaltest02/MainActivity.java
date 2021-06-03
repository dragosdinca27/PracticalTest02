package ro.pub.cs.systems.eim.practicaltest02;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.provider.SyncStateContract;
import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.Socket;

public class MainActivity extends AppCompatActivity {

    private TextView pokemonName;
    private TextView pokemonAbilities;
    private TextView pokemonTypes;
    private Button initButton;
    private ImageView pokemonImage;

//    private ServerThread serverThread = null;
//    private ClientThread clientThread = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_practical_test02_main);

        pokemonName = (TextView)findViewById(R.id.pokemon_name);
        pokemonAbilities = (TextView)findViewById(R.id.pokemon_abilites);
        pokemonTypes = (TextView)findViewById(R.id.pokemon_types);

        initButton = (Button)findViewById(R.id.init_button);

        pokemonImage = (ImageView)findViewById(R.id.pokemon_image);
        
    }

    

//    @Override
//    public void run() {
//        try {
//            while (!Thread.currentThread().isInterrupted()) {
//                Log.i(Constants.TAG, "[SERVER THREAD] Waiting for a client invocation...");
//                Socket socket = serverSocket.accept();
//                Log.i(SyncStateContract.Constants.TAG, "[SERVER THREAD] A connection request was received from " + socket.getInetAddress() + ":" + socket.getLocalPort());
//                CommunicationThread communicationThread = new CommunicationThread(this, socket);
//                communicationThread.start();
//            }
//        } catch (ClientProtocolException clientProtocolException) {
//            Log.e(Constants.TAG, "[SERVER THREAD] An exception has occurred: " + clientProtocolException.getMessage());
//            if (Constants.DEBUG) {
//                clientProtocolException.printStackTrace();
//            }
//        } catch (IOException ioException) {
//            Log.e(Constants.TAG, "[SERVER THREAD] An exception has occurred: " + ioException.getMessage());
//            if (Constants.DEBUG) {
//                ioException.printStackTrace();
//            }
//        }
//    }

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
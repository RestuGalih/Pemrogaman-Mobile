package restu.galih.projek.uts;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this,getMylist());
        mRecyclerView.setAdapter(myAdapter);
    }
    private ArrayList<Model> getMylist(){

        ArrayList<Model> models = new ArrayList<>();

        Model model = new Model();
        model.setTitle("Melati Daeva");
        model.setDescription("Melati Daeva Oktavianti merupakan pemain bulu tangkis asal Indonesia. Atlet kelahiran Serang, 26 Oktober 1994");
        model.setImg(R.drawable.mel);
        models.add(model);

        model = new Model();
        model.setTitle("Yolla Yuliana");
        model.setDescription("Yolla Yuliana lahir di Bandung, 16 Mei 1994. Dunia voli sudah melekat pada keluarga Yolla.");
        model.setImg(R.drawable.yolla);
        models.add(model);

        model = new Model();
        model.setTitle("Pungky Afriecia");
        model.setDescription("Pungky Afriecia, nama yang satu ini tentu sudah sering didengar oleh para pecinta voli Indonesia.");
        model.setImg(R.drawable.pungky);
        models.add(model);

        model = new Model();
        model.setTitle("Lindswell Kwok");
        model.setDescription("Lindswell Kwok. Lindswell (Hanzi: 郭利娟; pinyin: Guō Lìjuān, lahir di Binjai, 24 September 1991; umur 28 tahun) adalah seorang atlet wushu");
        model.setImg(R.drawable.lindswell);
        models.add(model);


        model = new Model();
        model.setTitle("Dellie Threesyadinda");
        model.setDescription("Wanita yang akrab disapa Dinda ini lahir pada 12 Mei 1990.");
        model.setImg(R.drawable.del);
        models.add(model);

        return models;
    }
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.profile:
                Intent activity1 = new Intent(this, Toolbar.class);
                startActivity(activity1);
                return true;
            default:
                return true;
        }
    }
}
/*import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new MyAdapter(this,getMylist());
        mRecyclerView.setAdapter(myAdapter);

    }

    private ArrayList<Model> getMylist() {
        ArrayList<Model> models = new ArrayList<>();
        Model model = new Model();
        model.setTitle("Melati Daeva");
        model.setDescription("Melati Daeva Oktavianti merupakan pemain bulu tangkis asal Indonesia. Atlet kelahiran Serang, 26 Oktober 1994");
        model.setImg(R.drawable.mel);
        models.add(model);

        model = new Model();
        model.setTitle("Yolla Yuliana");
        model.setDescription("Yolla Yuliana lahir di Bandung, 16 Mei 1994. Dunia voli sudah melekat pada keluarga Yolla.");
        model.setImg(R.drawable.yolla);
        models.add(model);

        model = new Model();
        model.setTitle("Pungky Afriecia");
        model.setDescription("Pungky Afriecia, nama yang satu ini tentu sudah sering didengar oleh para pecinta voli Indonesia.");
        model.setImg(R.drawable.pungky);
        models.add(model);

        model = new Model();
        model.setTitle("Lindswell Kwok");
        model.setDescription("Lindswell Kwok. Lindswell (Hanzi: 郭利娟; pinyin: Guō Lìjuān, lahir di Binjai, 24 September 1991; umur 28 tahun) adalah seorang atlet wushu");
        model.setImg(R.drawable.lindswell);
        models.add(model);

        model = new Model();
        model.setTitle("Dellie Threesyadinda");
        model.setDescription("Wanita yang akrab disapa Dinda ini lahir pada 12 Mei 1990.");
        model.setImg(R.drawable.del);
        models.add(model);


        return models;

    }
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected (MenuItem item){
        switch  (item.getItemId()){
            case R.id.profile:
                Intent activity1 = new Intent(this, Toolbar.class);
                startActivity(activity1);
                return true;
                default:
                    return true;
        }
    }

}*/


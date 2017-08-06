package com.eapp.wrapme.retrofit19;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Proxy;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {
    public static final String ROOT_URL = "http://quliver.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*

        DownloadWebPageTask task = new DownloadWebPageTask();
        task.execute(new String[]{"http://www.vogella.com/index.html"});

*/
        Intent intent = new Intent(getApplicationContext(), MyIntentService.class);
        startService(intent);


    }

/*

    private class DownloadWebPageTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... urls) {
            try {
                praseData();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return "dfbd";
        }


        @Override
        protected void onPostExecute(String result) {

        }


    }


    public void praseData() throws IOException {
        System.setProperty("https.proxyHost", "127.0.0.1.87878798");
        System.setProperty("https.proxyPort", "8080");
        Proxy proxy = new Proxy(                                      //
                Proxy.Type.HTTP,                                      //
                InetSocketAddress.createUnresolved("127.0.0.1", 8080) //
        );
        for (int no = 2; no < 50; no++) {
            String url = "https://www.moviespur.in/category/new-bollywood-movies-146.html?page=" + no;
            Document doc = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2") //
                    .header("Content-Language", "en-US") //
                    .get();

            Elements link = doc.getElementsByClass("touch");
            for (Element e : link) {
                String absHref = e.attr("abs:href"); // "http://jsoup.org/"
                String linkText = e.text();
                System.out.println(linkText);
                //System.out.println(absHref);


                Document doc1 = Jsoup.connect(absHref)
                        .userAgent("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2") //
                        .header("Content-Language", "en-US") //
                        .get();
                Element link1 = doc1.getElementsByClass("touch").last();
                String absHref1 = link1.attr("abs:href");
                Document doc2 = Jsoup.connect(absHref1)
                        .userAgent("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2") //
                        .header("Content-Language", "en-US") //
                        .get();
                Element link2 = doc2.getElementsByClass("downloadbutton").first();
                String absHref2 = link2.attr("abs:href");
                System.out.println(absHref2);
                insertUser_india(linkText, absHref2);
            }
        }

        }


    private void insertUser_india(final String pagelink, final String sourcename) {
        //Here we will handle the http request to insert user to mysql db
        //Creating a RestAdapter
        RestAdapter adapter = new RestAdapter.Builder().setEndpoint(ROOT_URL) //Setting the Root URL
                .build(); //Finally building the adapter

        //Creating object for our interface
        SetMovie api = adapter.create(SetMovie.class);

        //Defining the method insertuser of our interface
        api.insertData(
                //Passing the values by getting it from editTexts
               */
/* editTextName.getText().toString(),
                editTextUsername.getText().toString(),
                editTextPassword.getText().toString(),
                editTextEmail.getText().toString(),*//*

                pagelink,
                sourcename,

                //Creating an anonymous callback
                new Callback<Response>() {
                    @Override
                    public void success(retrofit.client.Response result, retrofit.client.Response response) {
                        BufferedReader reader = null;
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        //If any error occured displaying the error as toast
                        // Toast.makeText(MainActivity.this, error.toString(),Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

*/

}

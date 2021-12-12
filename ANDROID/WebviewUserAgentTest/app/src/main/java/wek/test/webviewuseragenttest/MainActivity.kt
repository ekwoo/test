package wek.test.webviewuseragenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText
import java.util.logging.Logger

/**
 * 메인 액티비티
 * 코틀린 문법부터 잘 모르겠는걸..
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("DEBUG","start onCreate")
        super.onCreate(savedInstanceState)
        Log.d("DEBUG","set Content View")
        setContentView(R.layout.activity_main)

        //웹뷰설정
        Log.d("DEBUG","set WebView")
        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.userAgentString = myWebView.settings.userAgentString + "; customString"

        //input설정
        Log.d("DEBUG","set EditText")
        val myInput:EditText = findViewById(R.id.url)

        Log.d("DEBUG","set Button")
        val moveButton: Button = findViewById(R.id.button)
        moveButton.setOnClickListener {
            myWebView.loadUrl(myInput.text.toString())
        }
    }
}
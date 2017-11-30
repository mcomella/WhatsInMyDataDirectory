package xyz.mcomella.whatsinmydatadirectory

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.io.File

private const val LOGTAG = "DataDirContents"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            logDirectory(dataDir)
        } else {
            log("Unable to log dataDir - requires API 24+")
        }
        logDirectory(filesDir)
        logDirectory(cacheDir)
    }
}

private fun log(msg: String) {
    Log.d(LOGTAG, msg)
}

private fun logDirectory(dir: File) {
    if (!dir.exists() || !dir.isDirectory) throw IllegalStateException("Expected ${dir.absolutePath} to be a directory.")

    log("--- ${dir.absolutePath} ---")

    val children = dir.list()
    if (children.isEmpty()) {
        log("EMPTY")
    } else children.forEach {
        log("  $it")
    }
}

package com.example.fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.core.app.NotificationCompatExtras
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var rvNumbers:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      rvNumbers=findViewById(R.id.tvNumbers)
        rvNumbers.layoutManager=LinearLayoutManager(baseContext)
        var numbersAdapter=NumbersAdapter(fibonacci(100))
        rvNumbers.adapter=numbersAdapter
        var m= fibonacci(100)
        print(m)

    }
}
fun fibonacci(n:Int):List<BigInteger> {
    var fibo1 = BigInteger.ZERO
    var fibo2 = BigInteger.ONE
    var result = MutableList<BigInteger>(n, { BigInteger.ZERO })
    result[0] = fibo1
    result[1] = fibo2
    for (i in 1..n) {
        var sum = fibo1 + fibo2
        fibo1 = fibo2
        fibo2=sum
        result[i - 1] = fibo1

}
 return result

}
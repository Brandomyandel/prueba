package Screen

import androidx.compose.runtime.Composable
import com.example.prcatica_git.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

@Composable
fun bandera_de_japon(){
    Row(modifier = Modifier.fillMaxSize()) {
       Box(modifier = Modifier
               .weight(1f)
               .fillMaxSize()
               .background(Color.White),
           contentAlignment = Alignment.Center
       )
       {
           Image(painter=painterResource(R.drawable.japon),
               contentDescription="Japon",
               modifier=Modifier
               )
       }
       }

    }
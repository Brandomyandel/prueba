package Screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.asComposePath
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun Chile(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .size(width = 300.dp, height = 200.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Red)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.White)
        )
        Box(
            modifier = Modifier
                .size(width = 100.dp, height = 100.dp)
                .background(Color.Blue)
        ) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                val canvasWidth = size.width
                val canvasHeight = size.height
                val starSize = 40f

                val path = Path().apply {
                    moveTo(canvasWidth / 2f, canvasHeight / 2f - starSize)
                    lineTo(canvasWidth / 2f + starSize * 0.3f, canvasHeight / 2f - starSize * 0.3f)
                    lineTo(canvasWidth / 2f + starSize, canvasHeight / 2f - starSize * 0.3f)
                    lineTo(canvasWidth / 2f + starSize * 0.4f, canvasHeight / 2f + starSize * 0.1f)
                    lineTo(canvasWidth / 2f + starSize * 0.6f, canvasHeight / 2f + starSize)
                    lineTo(canvasWidth / 2f, canvasHeight / 2f + starSize * 0.5f)
                    lineTo(canvasWidth / 2f - starSize * 0.6f, canvasHeight / 2f + starSize)
                    lineTo(canvasWidth / 2f - starSize * 0.4f, canvasHeight / 2f + starSize * 0.1f)
                    lineTo(canvasWidth / 2f - starSize, canvasHeight / 2f - starSize * 0.3f)
                    lineTo(canvasWidth / 2f - starSize * 0.3f, canvasHeight / 2f - starSize * 0.3f)
                    close()
                }
                drawPath(path, color = Color.White)
            }
        }
    }
}
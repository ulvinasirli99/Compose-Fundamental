package nasirli.tool.kotlincomposeviewfundamental

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import nasirli.tool.kotlincomposeviewfundamental.screens.CardWidget
import nasirli.tool.kotlincomposeviewfundamental.screens.ImageWidget
import nasirli.tool.kotlincomposeviewfundamental.screens.LazyColumnWidget
import nasirli.tool.kotlincomposeviewfundamental.screens.LazyGridWidget
import nasirli.tool.kotlincomposeviewfundamental.screens.LazyRowWidget
import nasirli.tool.kotlincomposeviewfundamental.screens.ScaffoldWidget
import nasirli.tool.kotlincomposeviewfundamental.screens.StateAndReComposition
import nasirli.tool.kotlincomposeviewfundamental.screens.SurfaceView
import nasirli.tool.kotlincomposeviewfundamental.screens.TextFieldAndToastMessage
import nasirli.tool.kotlincomposeviewfundamental.screens.TextStyling
import nasirli.tool.kotlincomposeviewfundamental.ui.theme.KotlinComposeViewFundamentalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinComposeViewFundamentalTheme {
                LazyGridWidget()
            }
        }
    }
}
package nasirli.tool.kotlincomposeviewfundamental.screens.movie_app.model

data class Data(
    val country: String,
    val genres: List<String>,
    val id: Int,
    val images: List<String>,
    val imdb_rating: String,
    val poster: String,
    val title: String,
    val year: String
)

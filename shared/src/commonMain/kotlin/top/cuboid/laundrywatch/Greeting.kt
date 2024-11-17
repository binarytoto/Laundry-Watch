package top.cuboid.laundrywatch

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class Greeting {
    private val platform: Platform = getPlatform()
    private val client = HttpClient()

    suspend fun greet(): String {
        val response = client.get("https://www.laundryview.com/api/c_locations")
        return response.body()
    }
}